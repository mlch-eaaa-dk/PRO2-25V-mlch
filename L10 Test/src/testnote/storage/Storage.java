package testnote.storage;

import testnote.model.Student;
import testnote.model.Team;

import java.util.HashSet;
import java.util.Set;

public class Storage {
    private final Set<Team> teams = new HashSet<>();
    private final Set<Student> students = new HashSet<>();

    public void addTeam(Team team) {
        teams.add(team);
    }
    
    public Set<Team> getAllTeams() {
        return Set.copyOf(teams);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    
    public Set<Student> getAllStudents() {
        return Set.copyOf(students);
    }
}
