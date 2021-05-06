package question2;
/**
 *
 * @author Nandini Kandi
 */
public class Rectangle extends GeometricObject implements Colorable {


    public Rectangle(double length, double breadth) {
        this.value1 = length;
        this.value2 = breadth;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        return value1 * value2;
    }

}
