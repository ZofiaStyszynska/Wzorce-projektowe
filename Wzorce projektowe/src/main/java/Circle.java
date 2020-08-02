public class Circle implements SuperFigure {

    private final double PI = Math.PI;
    private double radius;
    private Colour colour;
    private double x;
    private double y;



    public Circle(double radius, Colour colour, double x, double y) {
        this.radius = radius;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double countArea() {
         return PI * radius * radius;
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
