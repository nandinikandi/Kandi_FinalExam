package question2;
/**
 *
 * @author Nandini Kandi
 */
public class Rhombus extends GeometricObject implements Colorable {


    public Rhombus(double diagonal1, double diagonal2) {
        this.value1 = diagonal1;
        this.value2 = diagonal2;
    }

    @Override
    public void howToColor() {
        System.out.println("Color on all four sides");
    }

    public double getArea() {
        return (value1 * value2) / 2;
    }
}
