public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double countPerimeter() {
        return 4 * side;
    }

    @Override
    public double countArea() {
        return side * side;
    }
}
