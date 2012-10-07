package ex8_4;

/**
 * Title: Activity 8.4 BankAccount
 * Description: a bank account has a single attribute balance, and two methods
 * which simply increment the balance by 1, wait a bit, then decrement the
 * balance by 1, so that it ends back where it started.  Print statements
 * report when the method is entered and when it is exited and the balance.
 *
 * One of these methods, method A, is declared synchronized.  The other,
 * method B, is unsynchronized.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 09/04/2004
 */


public class BankAccount
{
   private int balance = 0;
   
   public synchronized void methodA()
   {
      System.out.println("Entering A - the balance is " + balance);
      balance++;
      delay(50);
      balance--;
      System.out.println("Exiting A");
   }

   public void methodB() // This method is not synchronized!
   {
      System.out.println("Entering B  - the balance is " + balance);
      balance++;
      delay(50);
      balance--;
      System.out.println("Exiting B");
   }

   private void delay(int n)
   {
      try
      {
         Thread.sleep(n);
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }
}
