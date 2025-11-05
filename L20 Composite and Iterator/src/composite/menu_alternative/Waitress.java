package composite.menu_alternative;

public class Waitress {
	private final MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
}
