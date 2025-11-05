package composite.menu_book;

import java.util.ArrayList;

public class Menu extends MenuComponent {
	private String name;
	private String description;
	private final ArrayList<MenuComponent> menuComponents = new ArrayList<>();

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
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

	//-------------------------------------------------------------------------

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
}
