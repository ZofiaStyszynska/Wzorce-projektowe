public class Circle implements Figure {

    private final double PI = Math.PI;
    private double radius;

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

    public double getRadius() {
        return radius;
    }
}
