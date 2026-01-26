import java.util.Objects;

// 6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
// and methods to calculate and update salary.
// calculate salary based on job title. doctor 2000 engineer 4000, nurse 1000
public class Employee {
    private String name;
    private  String jobTitle;
    private int salary;

    public Employee( String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = 0;
    }

    // calculate salary based on job title. doctor,2000 engineer 4000, nurse 1000
    public void calculateSalary() {
        if (Objects.equals(this.jobTitle, "doctor")){
            this.salary = 2000;
        } else if (Objects.equals(this.jobTitle, "engineer")) {
            this.salary = 4000;
        } else {
            this.salary = 1000;
        }
    }

    public void employeeDetails() {
        System.out.println("Name:" + this.name + " " + "Job Title: " + this.jobTitle + " " + "Salary: " + this.salary);
    }
}