package ex8_4;

/**
 * Title: Activity 8.4 GoodThread
 * Description: the good thread obediently uses the synchronized
 * method to access the data.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 09/04/2004
 */


public class GoodThread extends Thread
{
   private BankAccount account;

   public GoodThread(BankAccount ba)
   {
      account = ba;
   }

   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         account.methodA();
      }
   }
}
