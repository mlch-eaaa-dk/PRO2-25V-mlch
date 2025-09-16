package demohashcode;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
        Set<Student> students = new HashSet<>();

        Student jens = new Student(100, "Jens");
        students.add(jens);
        students.add(new Student(102, "Ulla"));
        Student hans = new Student(101, "Hans");
        students.add(hans);
        System.out.println(students);

        System.out.println("Jens er med? " + students.contains(jens));
        System.out.println("Hans er med? " + students.contains(hans));

        students.add(new Student(102, "Ulla Pia"));
        System.out.println(students);
    }
}
