package ex8_4;

/*
 * Title: Activity 8.4 BadThread
 * Description: the bad thread defiantly uses the unsynchronized
 * method to access the data.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 09/04/2004
 */

public class BadThread extends Thread
{
   private BankAccount account;

   public BadThread(BankAccount ba)
   {
      account = ba;
   }

   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         account.methodB();
      }
   }
}
