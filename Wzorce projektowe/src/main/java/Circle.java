import lombok.Getter;

@Getter
public class Circle extends AbstractSuperFigure {

    private final double PI = Math.PI;
    private double radius;




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




}
