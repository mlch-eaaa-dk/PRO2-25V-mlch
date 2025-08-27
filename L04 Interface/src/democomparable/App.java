package democomparable;

import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        Person p1 = new Person("Jensen", 2000);
        Person p2 = new Person("Jensen", 1000);

        if (p1.compareTo(p2) < 0) {
            System.out.println(p1 + " er mindre end " + p2);
        } else if (p1.compareTo(p2) > 0) {
            System.out.println(p1 + " er større end " + p2);
        } else {
            System.out.println(p1 + " og " + p2 + " er lige store");
        }
        System.out.println();

        ArrayList<Person> personer = new ArrayList<>();
        personer.add(p1);
        personer.add(p2);
        System.out.println("Personer usorterede: " + personer);
        Collections.sort(personer);
        System.out.println("Personer sorterede: " + personer);
    }
}
