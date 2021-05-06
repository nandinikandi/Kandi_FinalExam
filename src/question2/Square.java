package question2;
/**
 *
 * @author Nandini Kandi
 */
public class Square extends GeometricObject implements Colorable {

    public Square(double length, double breadth) {
        this.value1 = length;
        this.value2 = breadth;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        if (value1 == value2)
            return value1 * value2;
        return 0;
    }
}
