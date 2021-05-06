/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Nandini Kandi
 */
public class ImplicitCastingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //double has more range than int, so casting is automatic which is implicit casting.
        double test = 10;

        //double has more range than float, so casting is automatic which is implicit casting.
        double test1 = 15.0f;

        //double has more range than long, so casting is automatic which is implicit casting.
        double test2 = 20L;
        
        System.out.println("Output:" +test +" " + test1 + " " + test2);

    }

}
