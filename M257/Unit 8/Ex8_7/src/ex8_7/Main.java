package ex8_7;

/**
 * Title: Activity 8.7 Main
 * Description: creates a storage tank, then creates
 * an inflow and outflow and starts them executing
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */

public class Main
{
   public static void main(String[] args)
   {
      StorageTank st = new StorageTank(20);
      // 20 is the capacity of the storage tank.
      Inflow in = new Inflow(st);
      Outflow out = new Outflow(st);

      in.start();
      out.start();
   }
}
