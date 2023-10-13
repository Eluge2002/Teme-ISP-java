package isp.lab6.exercise1;
import java.util.HashMap;


public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, Integer> grades;

    public Student(String id, String firstName, String lastName, HashMap<String, Integer> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public void addGrade(String subject, Integer grade) {
        this.grades.put(subject, grade);
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void removeGrade(String subject) {
        grades.remove(subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}';
    }

}