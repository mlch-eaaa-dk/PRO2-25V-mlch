package ex5;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.printf("Make: %s, model: %s, year: %d, mileage: %,.0f km", make, model, year, mileage);
    }

    public abstract void start();

    public abstract void stop();

    public void performAction() {
        this.action();
    }

    public abstract void action();
}
