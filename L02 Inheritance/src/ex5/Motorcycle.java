package ex5;

public class Motorcycle extends Vehicle {
    private int engineSize; // ccm

    public Motorcycle(String make, String model, int year, double mileage, int engineSize) {
        super(make, model, year, mileage);
        this.engineSize = engineSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", engine size: " + engineSize + " ccm");
    }

    public void start() {
        System.out.println("Starting the Motorcycle...");
        System.out.println("Vroom, vroom!");
    }

    public void stop() {
        System.out.println("Stopping the Motorcycle...");
    }

    public void action() {
        System.out.println("Performing motorcycle-specific action: Revving the engine!");
    }
}
