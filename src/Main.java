void main(String[] args) {
    // PERSON TASK 1
    Person male = new Person("Dave", 27);
    Person female = new Person("Uche", 27);

    male.printPerson();
    female.printPerson();

    // DOG TASK 2
    // Creating two Dog objects using the constructor
    Dog dog1 = new Dog("Sky", "Rottweiler");
    Dog dog2 = new Dog("Kujo", "Bulldog");

    // Updating attributes using setter methods
    dog1.setName("Kiba");
    dog1.setBreed("German Shepherd");

    dog2.setName("Max");
    dog2.setBreed("Bloodhound");

    // Printing updated values
    System.out.println("Dog1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
    System.out.println("Dog2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

    // RECTANGLE TASK 3
    // create instance of rectangle
    Rectangle rectangle = new Rectangle(5, 5);
    rectangle.rectangleDetails();

    // CIRCLE TASK 4
    Circle circle = new Circle(5);
    circle.setRadius(10);

    System.out.println("Circle - Radius: " + circle.getRadius());
    System.out.println("The area of the circle is: " + circle.getArea());
    System.out.println("The circumference of the circle is: " + circle.getCircumference());

    // BOOK
    Book book1 = new Book("Old Life", "Some Body", 90041);
    Book book2 = new Book("New Life", "Some Body", 90041);
    Book book3 = new Book("Next Life", "Some Body", 90041);

    boolean isBookAdded = book1.addBook(book1);
    System.out.println("is book added = " + isBookAdded);
    book1.addBook(book2);
    book1.addBook(book3);

    book1.printBooks();

    System.out.println("===");
    boolean isBookRemoved = book1.removeBook(book1);
    System.out.println("is book removed = " + isBookRemoved);

    isBookRemoved = book1.removeBook(book1);
    System.out.println("is book removed = " + isBookRemoved);

    book1.printBooks();

    // EMPLOYEE
    Employee employee = new Employee("Frank Martins", "doctor");
    Employee employee2 = new Employee("John Jones", "engineer");
    Employee employee3 = new Employee("Kate Martins", "nurse");
    employee.employeeDetails();
    employee2.employeeDetails();
    employee3.employeeDetails();

    System.out.println("====");
    employee.calculateSalary();
    employee2.calculateSalary();
    employee3.calculateSalary();

    employee.employeeDetails();
    employee2.employeeDetails();
    employee3.employeeDetails();

    // BANK
    Bank bank = new Bank();

    Account account1 = new Account("stephen", "08021212121");
    Account account2 = new Account("Alex", "09012121212");
    bank.addAccount(account1);
    bank.addAccount(account2);

    bank.displayAccounts();

    System.out.println("===");
    bank.removeAccount(account1);
    bank.removeAccount(account2);
    bank.displayAccounts();
    bank.depositMoney(account1, 2000);
    bank.depositMoney(account2, 8000);
    bank.displayAccounts();

    System.out.println("===");
    bank.withdrawMoney(account1, 600);
    bank.withdrawMoney(account2, 800);
    bank.displayAccounts();
}