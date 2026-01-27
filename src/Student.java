// 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String grade;
    private List<String> courses;

    public  Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(String course) {
        return this.courses.add(course);
    }
    public boolean removeCourse(String course) {
        return this.courses.remove(course);
    }

    public void printCourses() {
        for (String course : courses) {
            System.out.println("Courses: " + courses);
        }
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name + "Grade: " + grade + "Courses: " + this.courses);
    }
}
