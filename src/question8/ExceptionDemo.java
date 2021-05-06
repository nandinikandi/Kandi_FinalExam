/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Kandi Nandini
 */
public class ExceptionDemo {
    
       public void transfer(double amount) throws InsufficientFunds {
      // Method implementation
      throw new InsufficientFunds();
   }
   // Remainder of class definition

    private void RecipientNotFoundException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
