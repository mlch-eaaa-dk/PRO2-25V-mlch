package observer_weatherstation_simplified;

public class CurrentConditionsDisplay implements Observer {

    @Override
    public void update(float temperature, float humidity, float pressure) { // push
        System.out.println("*** Current conditions ***");
        System.out.println(temperature + "F degrees and " + humidity + "% humidity");
    }

//    @Override
//    public void update(WeatherData weatherData) { // pull
//        float temperature = weatherData.getTemperature();;
//        float humidity = weatherData.getHumidity();
//
//        System.out.println("*** Current conditions ***");
//        System.out.println(temperature + "F degrees and " + humidity + "% humidity");
//    }
}
