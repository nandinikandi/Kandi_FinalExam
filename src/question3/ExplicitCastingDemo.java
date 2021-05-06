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
public class ExplicitCastingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int test = 20.00; -- This will error out, cause range of int is less than double, so casting fails. To fix this we need to clearly say that we need to cast value from double to int, like shown below.
        int test = (int) 20.00;
        //Few more example include
        //long test1 = 50.00;  --  This fails cause range of long is less than double, to fix this we need to do casting explicitly.
        long test1 = (long) 50.00;   //This is explicit casting

        //int test2 = 60f; --  This fails cause range of int is less than float, to fix this we need to do casting explicitly.
        int test2 = (int) 60f;  //This is explicit casting

        System.out.println("Output:" + test + " " + test1 + " " + test2);

    }

}
