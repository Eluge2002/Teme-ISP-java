package isp.lab6.exercise1;
import java.util.ArrayList;
import java.util.List;
public class StudentRepo {
    private List<Student> students;

    public StudentRepo() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void updateStudent(Student oldStudent, Student newStudent) {
        int index = this.students.indexOf(oldStudent);
        if (index != -1) {
            this.students.set(index, newStudent);
        }
    }

    public double getAverageGrade(Student student) {
        return student.getAverageGrade();
    }

    public List<Student> getStudents() {
        return this.students;
    }

}
