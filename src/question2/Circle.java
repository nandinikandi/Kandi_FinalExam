package question2;
/**
 *
 * @author Kandi Nandini
 */
public class Circle extends GeometricObject implements Colorable {

    public Circle(double radius) {
        this.value1 = radius;
    }

    @Override
    public void howToColor() {
        System.out.println("Fill color");
    }

    public double getArea() {
        return (22 / 7) * value1 * value1;
    }
}
