package observer_ex3student;

public class Purchaser {
    private String name; // not empty

    public Purchaser(String name) {
        this.name = name;
    }

    public void purchaseBooks(Book b, int amount) {
        b.incCount(amount);
        System.out.println("Buyer " + name + ": " + b + ", " + amount + " copies");
    }
}
