package democomparable;

public class Person implements Comparable<Person> {
    private String name;
    private int monthlySalary;

    public Person(String name, int monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String toString() {
        return String.format("Person(%s, kr %d)", name, monthlySalary);
    }

    @Override
    public int compareTo(Person other) {
        int nameDiff = this.name.compareTo(other.name);
        if (nameDiff != 0) {
            return nameDiff;
        }
        return Integer.compare(this.monthlySalary, other.monthlySalary);
    }
}
