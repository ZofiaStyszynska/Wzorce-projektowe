public class Triangle implements SuperFigure {

    private double sideA;
    private double sideB;
    private double sideC;
    private Colour colour;
    private double x;
    private double y;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(this.sideA * this.sideA + this.sideB * this.sideB);

    }

    public Triangle(double sideA, double sideB, double sideC, Colour colour, double x, double y) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    @Override
    public double countPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double countArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public Colour addColour(Colour colour) {
        return this.colour;
    }

    @Override
    public void putInPosition(double x, double y) {
        this.x = x;
        this.y = y;

    }
    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
}
