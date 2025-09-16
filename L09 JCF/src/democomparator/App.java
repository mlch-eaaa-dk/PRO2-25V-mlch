package democomparator;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student(100, "Jens"), new Student(102, "Ulla"), new Student(101, "Hans")
        ));

        System.out.println("Unsorted:");
        System.out.println(students);

        System.out.println("Sorted:");
//        Collections.sort(students);
//        Collections.sort(students, null);
//        students.sort(null);
//        Collections.sort(students, new StudentNameComparator());
        students.sort(new StudentNameComparator());
        System.out.println(students);
    }
}
