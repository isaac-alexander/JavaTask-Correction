// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. 2 methods to calculate the area and perimeter of the rectangle.

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // method to get width
    public int getWidth() {
        return this.width;
    }

    // method to get height
    public int getHeight() {
        return this.height;
    }

    // Method to calculate area
    int getArea() {
        return this.width * this.height;
    }

    // Method to calculate perimeter
    int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void rectangleDetails() {
        System.out.println("The width is: " + this.width + ", the height is: " + this.height);
        System.out.println("The area is: " + this.getArea());
        System.out.println("The perimeter is: " + this.getPerimeter());
    }

}
