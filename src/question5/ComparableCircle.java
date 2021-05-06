/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Kandi Nandini
 */
public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle(int radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object arg0) {
        Circle circle = (Circle) arg0;
        if (this.area() < circle.area()) {
            return -1;
        } else if (this.area() > circle.area()) {
            return 1;
        }
        return 0;
    }

}
