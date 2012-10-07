package ex8_5;

/**
 * Title: Activity 8.5 BankAccount - modified version
 * Description: this modified bank account has a single attribute balance,
 * and a single synchronized method to access it.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 09/04/2004
 */

public class BankAccount
{
   private int balance = 0;

   public synchronized void accessBalance(int threadID)
   {
      System.out.println("Thread " + threadID + 
         " entering access method - the balance is " + balance);
      balance++;
      delay(50);
      balance--;
      System.out.println("Thread " + threadID + " exiting access method");
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
