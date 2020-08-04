import lombok.Getter;

@Getter
public abstract class AbstractSuperFigure implements SuperFigure{
    Colour colour;
    double x;
    double y;

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

    @Override
    public String prepareDescription() {
        return SuperFigure.super.prepareDescription()+
                "\nkolor: " + this.getColour()+
                "\nwspolrzedne figury: " + this.getX() +", " + this.getY();
    }
}
