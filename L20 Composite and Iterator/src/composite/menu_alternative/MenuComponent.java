package composite.menu_alternative;

public abstract class MenuComponent { // could be named AbstractMenu
    private String name;
    private String description;

    protected MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //-----------------------------------------------------

    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
}
