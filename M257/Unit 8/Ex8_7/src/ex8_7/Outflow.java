package ex8_7;

/**
 * Title: Activity 8.7 Outflow
 * Description: a sink thread which runs forever and tries to decrement the
 * volume of liquid stored in a tank.   Eventually the tank may be empty,
 * causing an exception to be thrown!
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */

public class Outflow extends Thread
{
   private StorageTank theTank;

   public Outflow(StorageTank st)
   {
      theTank = st;
   }

   public void run()
   {
      while (true)
      {
         try
         {
            theTank.out();
         }
         catch (Exception e)
         {
            System.out.println(e);
            System.exit(0);
         }
      }
   }
}
