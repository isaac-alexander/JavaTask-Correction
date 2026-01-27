void main(String[] args) {
    // PERSON TASK 1
    Person male = new Person("Dave", 27);
    Person female = new Person("Uche", 27);

    male.printPerson();
    female.printPerson();
    System.out.println("=======");
    System.out.println("=======");

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

    System.out.println("=======");
    System.out.println("=======");

    // RECTANGLE TASK 3
    // create instance of rectangle
    Rectangle rectangle = new Rectangle(5, 5);
    rectangle.rectangleDetails();

    System.out.println("=======");
    System.out.println("=======");

    // CIRCLE TASK 4
    Circle circle = new Circle(5);
    circle.setRadius(10);

    System.out.println("Circle - Radius: " + circle.getRadius());
    System.out.println("The area of the circle is: " + circle.getArea());
    System.out.println("The circumference of the circle is: " + circle.getCircumference());

    System.out.println("=======");
    System.out.println("=======");

    // BOOK 5
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

    System.out.println("=======");
    System.out.println("=======");

    // EMPLOYEE TASK 6
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

    System.out.println("=======");
    System.out.println("=======");

    // BANK TASK 7
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

    System.out.println("=======");
    System.out.println("=======");


    // TRAFFIC LIGHT TASK 8

    TrafficLight trafficLight = new TrafficLight("Red", 30);

    trafficLight.checkColor();

    trafficLight.setColor("Green");

    trafficLight.checkColor();

    System.out.println("=======");
    System.out.println("=======");

    // EMPLOYEE2 TASK 9
    Employee2 worker = new Employee2("Jake", 10_000, 2016);
    Employee2 worker2 = new Employee2("Mike", 15_000, 2011);
    Employee2 worker3 = new Employee2("Luke", 5_000, 2020);
    worker.yearsOfService();
    worker2.yearsOfService();
    worker3.yearsOfService();

    worker.getWorkerDetails();
    worker2.getWorkerDetails();
    worker3.getWorkerDetails();

    System.out.println("=======");
    System.out.println("=======");


    // STUDENT TASK 10
    Student student = new Student("John Jones", "A1");
    student.addCourse("Java");
    student.addCourse("CSS");
    student.addCourse("HTML");
    student.addCourse("Maths");

    student.printCourses();
    System.out.println("===");

    student.removeCourse("Maths");
    student.printCourses();
    student.printStudentDetails();

    System.out.println("=======");
    System.out.println("=======");

    // LIBRARY TASK 11
    Library library = new Library();
    library.addBook("Java");
    library.addBook("CSS");
    library.addBook("HTML");
    library.addBook("Maths");
    library.printBooks();
    library.removeBook("Maths");
    System.out.println("===");
    library.printBooks();

    System.out.println("=======");
    System.out.println("=======");


    // AIRPLANE TASK 12
    Airplane airplane = new Airplane(99, "New York", "March, 13, 2026");
    Airplane airplane2 = new Airplane(199, "New York", "March, 13, 2026");
    Airplane airplane3 = new Airplane(299, "New York", "March, 13, 2026");
    Airplane airplane4 = new Airplane(400, "New York", "March, 13, 2026");

    airplane.checkFlightStatus();
    airplane2.checkFlightStatus();
    airplane3.checkFlightStatus();
    airplane4.checkFlightStatus();

    airplane.printFlightInfo();
    airplane2.printFlightInfo();
    airplane3.printFlightInfo();
    airplane4.printFlightInfo();

    System.out.println("=======");
    System.out.println("=======");


    // INVENTORY TASK 13
    Inventory inventory = new Inventory();
    inventory.addProduct("Phones");
    inventory.addProduct("Laptops");
    inventory.addProduct("Smartwatch");
    inventory.addProduct("Camera");
    inventory.checkInventory();

    System.out.println("===");
    inventory.removeProduct("Camera");
    inventory.removeProduct("Laptops");

    inventory.checkInventory();

    System.out.println("=======");
    System.out.println("=======");


    // SCHOOL TASK 14
    School school = new School();
    school.addStudent("Alex", 15);
    school.addStudent("Jake", 17);

    school.printStudents();
    System.out.println("===");

    school.removeStudent("Alex");
    school.printStudents();


    school.addTeacher("Mr Paul");
    school.addTeacher("Mr Saul");
    school.printTeachers();

    System.out.println("===");
    school.removeTeacher("Mr Paul");
    school.printTeachers();

    school.addClass("SS1B");
    school.addClass("SS3A");
    school.printClasses();

    System.out.println("===");
    school.removeClass("SS3A");
    school.printClasses();

    System.out.println("=======");
    System.out.println("=======");


    // MUSIC LIBRARY TASK 15
    MusicLibrary musicLibrary = new MusicLibrary();
    musicLibrary.addSong(1, "Good Song");
    musicLibrary.addSong(2, "Slow Song");
    musicLibrary.addSong(3, "Better Song");
    musicLibrary.addSong(4, "Old Song");
    musicLibrary.addSong(5, "New Song");
    musicLibrary.addSong(6, "Fast Song");

    musicLibrary.playRandomSong();

    System.out.println("=======");
    System.out.println("=======");


    //Shape
    RectangleSub rectangleSub = new RectangleSub(5, 10);
    System.out.println("Rectangle Perimeter: " + rectangleSub.calculatePerimeter());
    System.out.println("Rectangle Area: " + rectangleSub.calculateArea());
    CircleSub circleSub = new CircleSub(7);

    System.out.println("Circle Circumference: " + circleSub.calculateCircumference());
    System.out.println("Circle Area: " + circleSub.calculateArea());


    TriangleSub triangleSub =  new TriangleSub(3, 4, 5);
    System.out.println("Triangle Area: " + triangleSub.calculateArea());
    System.out.println("Triangle Perimeter: " + triangleSub.calculatePerimeter());

    System.out.println("=======");
    System.out.println("=======");

    // MOVIE TASK 17
    Movie movie = new Movie("Witcher");
    movie.addReview("Good Movie");
    movie.addReview("Interesting Movie");
    movie.addReview("It's Okay");

    movie.reviewDetails();

    System.out.println("=======");
    System.out.println("=======");

    // BANK ACCOUNT
    BankAccount bankAccount = new BankAccount("Alexander", "9812123312");
    bankAccount.depositMoney(3000);
    bankAccount.depositMoney(290);
    bankAccount.displayBalance();

    System.out.println("=======");
    bankAccount.withdrawMoney(3000);
    bankAccount.displayBalance();

    System.out.println("=======");
    SavingsAccount savingsAccount = new SavingsAccount("Alexander", "9812123312", 5.0);
    System.out.println("Account Holder: " + savingsAccount.accountName);
    System.out.println("Account Number: " + savingsAccount.accountNumber);

    savingsAccount.depositMoney(2000);
    savingsAccount.displayBalance();
    savingsAccount.applyInterest();
    savingsAccount.displayBalance();

}