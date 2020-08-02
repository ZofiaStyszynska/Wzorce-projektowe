public class Rectangle implements Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double countPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public double countArea() {
        return sideA * sideB;
    }


}
