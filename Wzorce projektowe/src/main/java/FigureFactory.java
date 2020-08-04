public class FigureFactory {
    private static final Colourable.Colour DEFAULT_COLOUR = Colourable.Colour.GREEN;
   public static enum FigureType{
       CIRCLE, SQUARE, TRIANGLE, RECTANGLE;
   }


    public static SuperFigure crateFigure(FigureType figureType, double size){
       switch (figureType){

           case CIRCLE:
               break;
           case SQUARE:
               break;
           case TRIANGLE:
               return new Triangle.Builder()
                       .withSideA()
               break;
           case RECTANGLE:
               break;
       }

        return null;
    }
}
