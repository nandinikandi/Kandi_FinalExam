package question2;
/**
 *
 * @author Nandini Kandi
 */
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GeometricObject square = new Square(2, 2);
        GeometricObject rectangle = new Rectangle(3, 2);
        GeometricObject triangle = new Triangle(4, 2);
        GeometricObject rhombus = new Rhombus(3, 6);
        GeometricObject circle = new Circle(2);
        GeometricObject[] geometricObjects = new GeometricObject[]{square, rectangle, triangle, rhombus, circle};

        for (GeometricObject g : geometricObjects) {
            if (g instanceof Square) {
                System.out.println();
                System.out.println("SHAPE=SQUARE||AREA=" + ((Square) g).getArea());
                ((Square) g).howToColor();
            } else if (g instanceof Rectangle) {
                System.out.println();
                System.out.println("SHAPE=RECTANGLE||AREA=" + ((Rectangle) g).getArea());
                ((Rectangle) g).howToColor();
            } else if (g instanceof Triangle) {
                System.out.println();
                System.out.println("SHAPE=TRIANGLE||AREA=" + ((Triangle) g).getArea());
                ((Triangle) g).howToColor();
            } else if (g instanceof Rhombus) {
                System.out.println();
                System.out.println("SHAPE=RHOMBUS||AREA=" + ((Rhombus) g).getArea());
                ((Rhombus) g).howToColor();

            } else if (g instanceof Circle) {
                System.out.println();
                System.out.println("SHAPE=CIRCLE||AREA=" + ((Circle) g).getArea());
                ((Circle) g).howToColor();
            }

        }

    }
}
