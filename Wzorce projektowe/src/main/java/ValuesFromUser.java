import java.util.Scanner;

public class ValuesFromUser {
    public static void main(String[] args) {

        Figure[] figures = new Figure[4];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość promienia koła: ");
        double radiusFromUser = scanner.nextDouble();
        Circle circle = new Circle(radiusFromUser);
        figures[0] = circle;

        System.out.println("Podaj długości boków prostokąta. Bok a: ");
        double sideAFromUser = scanner.nextDouble();
        System.out.println("Bok b: ");
        double sideBFromUser = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(sideAFromUser, sideBFromUser);
        figures[1] = rectangle;

        System.out.println("Podaj długości boku kwadratu: ");
        double sideFromUser = scanner.nextDouble();
        Square square = new Square(sideFromUser);
        figures[2] = square;

        for (Figure figure : figures) {
            //System.out.println(figure.getClass().toString()+ " Pole: " + figure.countArea() + ", obwód: " + figure.countPerimeter() );
            System.out.println(figure.prepareDescription());
        }


    }
}
