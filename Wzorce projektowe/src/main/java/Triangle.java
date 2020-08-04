import lombok.Getter;

@Getter
public class Triangle extends AbstractSuperFigure {

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

    public Triangle(Builder builder) {
        this.sideA = builder.sideA;
        this.sideB = builder.sideB;
        this.colour = builder.colour;
        this.x = builder.x;
        this.y = builder.y;
        this.sideC= Math.sqrt(this.sideA * this.sideA + this.sideB * this.sideB);
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



    public static class Builder{
        private double sideA;
        private double sideB;
        private Colour colour;
        private double x;
        private double y;

        Triangle build(){
            if (sideB <=0 || sideA <=0){
                throw new IllegalStateException("Base and high must be greater than 0");
            }
            return new Triangle(this);
        }

        Builder withSideA(double sideA){
            this.sideA = sideA;
            return this;
        }
        Builder withsideB(double sideB){
            this.sideB = sideB;
            return this;
        }

        Builder withColour (Colour colour){
            this.colour = colour;
            return this;

        }
        Builder withCoordinates (double x, double y){
            this.x = x;
            this.y = y;
            return this;
        }


    }
}
