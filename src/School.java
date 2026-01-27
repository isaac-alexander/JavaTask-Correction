import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 14. Write a Java program to create a class called "School" with attributes for
// students, teachers, and classes,
// and methods to add and remove students and teachers, and to create classes.
public class School {
    private Map<String, Integer> students;
    private List<String> teachers;
    private List<String> classes;

    public School() {
        this.students = new HashMap();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(String name, Integer age) {
        this.students.put(name, age);
    }

    public void removeStudent(String name) {
        this.students.remove(name);
    }

    public boolean addTeacher(String teacher) {
        return this.teachers.add(teacher);
    }

    public boolean removeTeacher(String teacher) {
        return this.teachers.remove(teacher);
    }

    public boolean addClass(String klass) {
        return this.classes.add(klass);
    }

    public boolean removeClass(String klass) {
        return this.classes.remove(klass);
    }

    public void printStudents() {
        for (String student : this.students.keySet()) {
            System.out.println("Student's name: " + student + " age " + this.students.get(student));
        }
    }

    public void printTeachers() {
        for (String teacher : this.teachers) {
            System.out.println("Teacher's name: " + teacher);
        }
    }

    public void printClasses() {
        for (String klass : this.classes) {
            System.out.println("Class: " + klass);
        }
    }
}