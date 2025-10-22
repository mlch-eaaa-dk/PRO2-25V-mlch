package misguided_weatherstation_book;

public class ForecastDisplay implements DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public void update(float temp, float humidity, float pressure) { // push
        lastPressure = currentPressure;
        currentPressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("*** Forecast *** ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
