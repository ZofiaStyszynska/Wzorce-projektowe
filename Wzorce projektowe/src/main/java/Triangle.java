public class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(this.sideA * this.sideA + this.sideB * this.sideB);

    }

    @Override
    public double countPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double countArea() {
        return 0.5 * sideA * sideB;
    }
}
