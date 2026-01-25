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
}