public interface Colourable {

    Colour addColour(Colour colour);


//    default void addColour(Colour colour, Figure figure) {
//        System.out.println(figure.getClass().getSimpleName() + "is " + colour);


    enum Colour {
        BLUE, GREEN, RED, WHITE;

    }
}
