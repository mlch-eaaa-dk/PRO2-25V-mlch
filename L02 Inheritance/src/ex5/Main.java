package ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Camry", 2010, 120000, 4);
        Motorcycle honda = new Motorcycle("Honda", "Gold Wing", 2020, 20000, 1833);
        Truck jungheinrich = new Truck("Jungheinrich", "EFG213", 2021, 1500, 2000);

        ArrayList<Vehicle> vehicles = new ArrayList<>(
                List.of(toyota, honda, jungheinrich)
        );

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.start();
            vehicle.stop();
            vehicle.performAction();
        }
    }
}
