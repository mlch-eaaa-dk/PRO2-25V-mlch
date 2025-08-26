package ex5;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String make, String model, int year, double mileage, double loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", load capacity: " + loadCapacity);
    }

    public void start() {
        System.out.println("Starting the Truck...");
        System.out.println("Rumbling engine...");
    }

    public void stop() {
        System.out.println("Stopping the Truck...");
    }

    public void action() {
        System.out.println("Performing truck-specific action: Activating the hydraulic lift!");
    }
}
