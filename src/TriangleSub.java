public class TriangleSub extends Shape {
    private int side1;
    private int side2;
    private int side3;
    public TriangleSub(int side1, int side2, int side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public int calculateArea() {
        int side = (side1 + side2 + side3) / 2;
        return (int) Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    }

    @Override
    public int calculatePerimeter() {
            return side1 + side2 + side3;
    }

}
