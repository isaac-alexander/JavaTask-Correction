public class RectangleSub extends Shape {
    private int width;
    private int height;
    public RectangleSub(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return this.width * this.height;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public void rectangleDetails() {
        System.out.println("The width is: " + this.width + ", the height is: " + this.height);
        System.out.println("The area is: " + this.calculateArea());
        System.out.println("The perimeter is: " + this.calculatePerimeter());
    }
}
