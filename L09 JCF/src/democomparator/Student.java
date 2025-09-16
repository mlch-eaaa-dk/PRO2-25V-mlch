package democomparator;

public class Student implements Comparable<Student> {
    private final int studentNo;
    private String name; // not null

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Student(%s, %s)", studentNo, name);
    }

    //-----------------------------------------------------

    @Override
    public int hashCode() {
        return studentNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student other)) return false;
        return studentNo == other.studentNo;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentNo, o.studentNo);
    }
}

// Inherited equals() from Object compares references.
// Inherited hashCode() from Object return addresses (references).

// If Set<E> (or Map<K,V>) is used, and
// two objects in memory represent the same identity,
// then equals() and hashCode() must be overridden in E (or K).

// Method hasCode() must be consistent with equals(),
// that is, a.equals(b) == true => a.hashCode() == b.hashCode().

// If two objects are equal, they must have the same hash code.
// If two objects have the same hash code, they may or may not be equal.

// Method compareTo() must be consistent with equals(),
// that is, a.equals(b) == true <=> a.compareTo(b) == 0.

// If equals() return true, compareTo() must return 0.
// If compareTo() return 0, equals() must return true.
