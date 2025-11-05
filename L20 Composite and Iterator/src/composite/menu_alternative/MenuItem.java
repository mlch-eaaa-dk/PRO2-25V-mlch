package composite.menu_alternative;

public class MenuItem extends MenuComponent {
    private double price;

    public MenuItem(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("  " + this.getName());
        System.out.println(", " + this.getPrice());
        System.out.println("     -- " + this.getDescription());
    }
}
