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

    // VEHICLE TASK 21

    Car car = new Car("Ford, ", "F-150,", "2019, ", "350LTR");
    car.displayVehicleDetails();

    Truck truck1 = new Truck("Ford, ", "F-150, ", "2019, ", "1200KG");
    truck1.displayVehicleDetails();

    //CUSTOMER TASK 22

    Customer customer1 = new Customer("Alex", "alex@mail.com");
    customer1.addPurchase(3000);
    customer1.addPurchase(1000);

    System.out.println("Customer Total Spent: " + customer1.totalExpenditure());

    LoyalCustomer customer2 = new LoyalCustomer("Isaac", "isaac@mail.com", 0.10);
    customer2.addPurchase(4000);
    customer2.addPurchase(1500);

    System.out.println("Loyal Customer Total Spent: " + customer2.totalExpenditure());
    System.out.println("After Discount: " + customer2.getDiscountedTotal());

    //COURSE TASK 23

    Course course = new Course("HTML", "Logan Fish", 2);
    course.displayDetails();

    System.out.println();

    // Online courses
    OnlineCourse onlineCourse1 = new OnlineCourse("CSS", "Mary Drinkwater", 4, "YouTube", 15);

    OnlineCourse onlineCourse2 = new OnlineCourse("Bootstrap", "Mark Mediolas", 3, "FaceBook", 7);

    // Display details
    onlineCourse1.displayDetails();
    System.out.println();

    onlineCourse2.displayDetails();
    System.out.println();

    // Certificate check for first course
    onlineCourse1.isEligibleForCertificate();
    onlineCourse2.isEligibleForCertificate();

    // ELECTRONIC PRODUCT TASK 24
    ElectronicsProduct electronicsProduct = new ElectronicsProduct(1, "LG Blender", 19.99);

    electronicsProduct.printProductDetails();

    electronicsProduct.getDiscount();

    electronicsProduct.calculateFinalPrice();

    electronicsProduct.printProductDetails();

    WashingMachine washingMachine = new WashingMachine(2, "Hisense Washing Machine", 299.99, 1);

    washingMachine.printProductDetails();

    washingMachine.extendWarranty();

    washingMachine.printProductDetails();


    //BUILDING TASK 25
    ResidentialBuilding residential = new ResidentialBuilding("20 Eleyele", 3, 400, 12, 8000);

    System.out.println("Residential Building:");
    residential.displayDetails();

    CommercialBuilding commercial = new CommercialBuilding("3 RingRoad", 12, 1000, 50, 1500);

    System.out.println("====");

    System.out.println("Commercial Building:");
    commercial.displayDetails();

    //EVENT TASK 26
    Seminar seminar = new Seminar("Tech Seminar", "2026-02-01", "Lagos", 5);

    seminar.displayDetails();
    MusicalPerformance concert = new MusicalPerformance("Jazz Night", "2026-02-01", "Lagos");
    concert.addPerformer("Dave");
    concert.addPerformer("Giggs");

    concert.displayDetails();

    seminar.hasConflict(concert);

}
