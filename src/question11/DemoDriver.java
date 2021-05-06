/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Kandi Nandini
 */
public class DemoDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create two Objects for Employee class.
        Employee obj1 = new Employee("Nandini", 110);
        Employee obj2 = new Employee("Nandini", 100);

        // comparing above created Objects.
        if (obj1.hashCode() == obj2.hashCode() && obj1.equals(obj2)) {
            System.out.println("Both objects are equal. ");
        } else {
            System.out.println("Both objects are not equal. ");
        }
    }

}
