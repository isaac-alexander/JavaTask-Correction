//


public class Circle {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    // method to get radius
    public int getRadius() {
        return radius;
    }

    // method to set radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Method to calculate area
    int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    // Method to calculate circumference
    int getCircumference() {
        return (int) (2 * Math.PI * radius);
    }
}
