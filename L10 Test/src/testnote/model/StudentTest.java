package testnote.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void constructStudent() {
        // arrange

        // act
        Student student = new Student("Jane Jensen", 22);

        // assert
        assertEquals("Jane Jensen", student.getName());
        assertEquals(22, student.getAge());
        assertEquals(List.of(), student.getGrades());
    }

    @Test
    void averageGrade() {
        // Arrange
        Student student = new Student("Jene Jensen", 22);
        student.addGrade(7);
        student.addGrade(12);
        student.addGrade(2);

        // Act
        double actualResult = student.averageGrade();

        // Assert
        assertEquals(7, actualResult, 0.0001);
    }

    @Test
    public void addGrade() {
        // arrange
        Student student = new Student("Jane Jensen", 22);

        // act
        student.addGrade(7);
        student.addGrade(12);
        student.addGrade(2);

        // assert
        List<Integer> expected = List.of(7, 12, 2);
        assertEquals(expected, student.getGrades());
    }

    @Test
    public void addGradeThrowsException() {
        // Arrange
        Student student = new Student("Jane Jensen", 22);
        student.addGrade(7);
        student.addGrade(12);
        student.addGrade(2);
        student.addGrade(7);
        student.addGrade(12);
        student.addGrade(2);
        student.addGrade(7);
        student.addGrade(12);
        student.addGrade(2);
        student.addGrade(7);

        // Act & Assert
        Exception exception = assertThrows(
            TooManyGradesException.class, () -> student.addGrade(12)
        );
        assertEquals("For mange karakterer givet", exception.getMessage());
    }
}
