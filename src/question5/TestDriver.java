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
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ComparableCircle circle1 = new ComparableCircle(4);
        ComparableCircle circle2 = new ComparableCircle(7);
        
        if (circle1.compareTo(circle2) == 1)
        {
            System.out.println("circle1 is big!");
        }
        else if (circle1.compareTo(circle2) == -1)
        {
            System.out.println("circle2 is big!");
        }
        
    }
    
}
