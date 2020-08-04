import lombok.Getter;

@Getter
public class Rectangle extends AbstractSuperFigure {
    private double sideA;
    private double sideB;

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



}
