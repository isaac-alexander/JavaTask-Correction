public class CircleSub extends Shape {
    private int radius;
    public CircleSub (int radius) {
        this.radius = radius;
    }

    @Override
    // Method to calculate area
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    // Method to calculate circumference
    public int calculateCircumference() {
        return (int) (2 * Math.PI * radius);
    }
}
