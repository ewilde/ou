package ex8_4;

/**
 * Title: Activity 8.4 Main
 * Description: creates a bank account, then creates a good and a bad thread
 * that share the bank account, then starts the two threads.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 09/04/2004
 */

public class Main
{
   public static void main(String[] args)
   {
      BankAccount ba = new BankAccount();
      GoodThread gt = new GoodThread(ba);
      BadThread bt = new BadThread(ba);
      gt.start();
      bt.start();
   }
}
