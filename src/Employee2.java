// 9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

import java.time.Year;

public class Employee2 {
    private String name;
    private int salary;
    private int hireDate;

    public  Employee2(String name, int salary, int hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int yearsOfService() {
        return Year.now().getValue() - this.hireDate;
    }

    public void getWorkerDetails() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary + ", Hire Date: " + this.hireDate + " Years of Service: " + yearsOfService() );
    }
}
