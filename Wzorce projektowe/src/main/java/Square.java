import lombok.Getter;

import java.io.BufferedWriter;
@Getter
public class Square extends AbstractSuperFigure {

    private double side;


    private Square(Builder builder) {
        this.side = side;

    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double countPerimeter() {
        return 4 * side;
    }

    @Override
    public double countArea() {
        return side * side;
    }



    public static class Builder {

        private Square instance;
        public Builder(){
            instance = new Square();
        }

        Square build() {
            if (instance.side<=0){
                throw new IllegalStateException("Square side must be longer than 0");
            }
            return instance;
        }

        Builder withSide(double side) {
            instance.side=side;


            return this;
        }

        Builder withColour(Colour colour) {
            instance.colour = colour;

            return this;
        }

        Builder withCoordinates(double x, double y) {
            instance.putInPosition(x,y);

            return this;

        }
    }
}

