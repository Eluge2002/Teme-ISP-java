package isp.lab6.exercise1;
import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        Student s1 = new Student("123", "Jane", "Jane", new HashMap<>());
        s1.addGrade("math", 90);
        s1.addGrade("et", 80);
        s1.addGrade("ss",75);
        s1.addGrade("isp",50);
        Student s2 = new Student("124", "Bob", "Man", new HashMap<>());
        s2.addGrade("math", 85);
        s2.addGrade("et", 58);
        s2.addGrade("ss",83);
        s2.addGrade("isp",90);
        Student s3 = new Student("122", "Charles", "Bob", new HashMap<>());
        s3.addGrade("math", 95);
        s3.addGrade("et", 95);
        s3.addGrade("ss",100);
        s3.addGrade("isp",70);
        StudentRepo repo = new StudentRepo();
        System.out.println("The students are:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}

