package question2;
/**
 *
 * @author Nandini Kandi
 */
public class Triangle extends GeometricObject implements Colorable {

    public Triangle(double base, double height) {
        this.value1 = base;
        this.value2 = height;
    }

    @Override
    public void howToColor() {
        System.out.println("Color on all three sides");
    }

    public double getArea() {
        return 0.5 * value1 * value2;
    }
}
