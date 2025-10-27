package list25vstudent;

public class TestList25V {

    public static void main(String[] args) {
        City paris = new City("Paris", 12_000_000);
        City london = new City("London", 9_000_000);
        City amsterdam = new City("Amsterdam", 7_000_000);
        City rom = new City("Rom", 9_000_000);
        City oslo = new City("Oslo", 1_200_000);

        List25V<City> list = new SingleLinkedList25V<>();
//        List25V<City> list = new DoubleLinkedList25V<>();
//        List25V<City> list = new ArrayList25V<>();
        list.add(paris);
        System.out.println(list);
        list.add(amsterdam);
        System.out.println(list);
        list.add(london);
        System.out.println(list);

        System.out.println("Size: " + list.size());
        System.out.println();

        // TODO Test the methods in the implementation of List25V
    }
}
