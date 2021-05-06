/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Nandini Kandi
 */
public class UncheckedExcep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arr=new String[]{"test1","test"};
        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException

        String name = null;
        name.toString(); //NullPointerException

    }

}
