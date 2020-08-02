public class Rectangle implements SuperFigure {
    private double sideA;
    private double sideB;
    private Colour colour;
    private double x;
    private double y;


    public Rectangle(double sideA, double sideB, Colour colour, double x, double y) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

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


    @Override
    public Colour addColour(Colour colour) {
        return colour;
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
