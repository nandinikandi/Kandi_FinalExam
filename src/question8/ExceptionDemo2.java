/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Nandini Kandi
 */
public class ExceptionDemo2 {
    
    public static void main(String args[]) {
      try {
         int a[] = new int[3];
         System.out.println("Get element Four :" + a[4]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
    
}
