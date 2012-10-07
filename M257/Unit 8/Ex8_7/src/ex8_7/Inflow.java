package ex8_7;

/**
 * Title: Activity 8.7 Inflow
 * Description: a source thread which runs forever and tries to increment the
 * volume of liquid stored in a tank.  Eventually the tank may overflow,
 * causing an exception to be thrown.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */

public class Inflow extends Thread
{
   private StorageTank theTank;

   public Inflow(StorageTank st)
   {
      theTank = st;
   }

   public void run()
   {
      while (true)
      {
         try
         {
            theTank.in();
         }
         catch (Exception e)
         {
            System.out.println(e);
            System.exit(0);
         }
      }
   }
}
