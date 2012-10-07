package ex8_7;

/**
 * Title: Activity 8.7 StorageTank
 * Description: a reservoir which holds up to capacity units of liquid.  If
 * the tank overflows or is empty an exception is thrown.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */

public class StorageTank
{
   private int capacity;
   private int contents;

   public StorageTank(int cap)
   {
      capacity = cap;
   }

   public synchronized void in() throws Exception
   {
      contents++;
      if (contents > capacity)
      {
         throw new Exception("The tank has overflowed!");
      }
      System.out.println("One unit added - contents now " + contents);
   }

   public synchronized void out() throws Exception
   {
      contents--;
      if (contents < 0)
      {
         throw new Exception("The tank is empty!");
      }
      System.out.println("One unit subtracted - contents now " + contents);
   }
}
