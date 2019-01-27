package figure;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        /*Square kwadrat = new Square(6);
        out.println(kwadrat.calculateArea());

        try {
            Square kwadrat2 = new Square(-7);
        } catch (RuntimeException e) {
            out.println(e.getMessage());
        }
        Square square = new Square(8);
        out.println(square);
        out.println(square.toString());
        out.println(square.hashCode());

        out.println(0.1 + 0.2);

        Figure triangle = new Triangle(8, 4);
        Figure rectangle = new Rectangle(5, 4);
        Figure square3 = new Square(7);

        out.println(triangle.calculateArea());
        out.println(rectangle.calculateArea());
        out.println(square3.calculateArea());*/

        Alcohol whiskey = new Whiskey();
        Alcohol beer = new Beer();

        out.println(whiskey.getName() + " " + whiskey.getPercentage());
        out.println(beer.getName() + " " + beer.getPercentage());

        Bottle<Beer> bottle = new Bottle<>();
        bottle.fill((Beer) beer);
        bottle.describe();


    }
}
