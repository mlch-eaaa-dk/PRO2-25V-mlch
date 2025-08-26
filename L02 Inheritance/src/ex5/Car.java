package ex5;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, double mileage, int numDoors) {
        super(make, model, year, mileage);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", number of doors: " + numDoors);
    }

    @Override
    public void start() {
        System.out.println("Starting the Car...");
        System.out.println("Vroom, vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Car...");
    }

    @Override
    public void action() {
        System.out.println("Performing car-specific action: Honking the horn!");
    }
}
