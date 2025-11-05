package composite.menu_alternative;

import java.util.ArrayList;

public class Menu extends MenuComponent { // could be named CompositeMenu
    private final ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        super(name, description);
    }

    @Override
    public void print() {
        System.out.print("\n" + this.getName());
        System.out.println(", " + this.getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (MenuComponent menuComponent : menuComponents) {
            price += menuComponent.getPrice();
        }
        return price;
    }

    //-------------------------------------------------------------------------

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
}
