public class Square implements SuperFigure{

    private double side;
    private Colour colour;
    private double x;
    private double y;

    public Square(double side, Colour colour, double x, double y) {
        this.side = side;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

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
