package testnote.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private final List<Integer> grades = new ArrayList<>(MAX_NUMBER_OF_GRADES);
    private static final int MAX_NUMBER_OF_GRADES = 10;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return List.copyOf(grades);
    }

    /** Pre: The grade is in {-3, 0, 2, 4, 7, 10, 12}. */
    public void addGrade(int grade) {
        if (!List.of(-3, 0, 2, 4, 7, 10, 12).contains(grade)) {
            throw new IllegalArgumentException("Illegal grade");
        }
        if (grades.size() == MAX_NUMBER_OF_GRADES) {
            throw new TooManyGradesException("For mange karakterer givet");
        }
        grades.add(grade);
    }


    /** Pre: This student has at least one grade. */
    public double averageGrade() {
        if (grades.isEmpty()) {
            throw new RuntimeException("Student has no grades");
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
