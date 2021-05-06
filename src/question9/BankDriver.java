/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Nandini Kandi
 */
public class BankDriver {
    public static void main(String [] args) {
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Deposit $500...");
      c.deposit(500.00);
      
      try {
         System.out.println("\nWithdraw $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdraw $600...");
         c.withdraw(600.00);
      } catch (InsufficientFundsException e) {
         System.out.println("Insufficient Funds Exception $" + e.getAmount());
         e.printStackTrace();
      }
   }
}
