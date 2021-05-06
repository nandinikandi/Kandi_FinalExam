/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Kandi Nandini
 */
public class ArraysProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*100);
        }

        System.out.print("Enter the index of the array: ");
        try {
            // Display the corresponding element value
            System.out.println("The corresponding element value: " + a[input.nextInt()]);
        } 
        catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Out of Bounds!");
        }

    }

}
