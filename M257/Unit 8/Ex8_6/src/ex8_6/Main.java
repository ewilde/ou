package ex8_6;

/**
 * Title: Activity 8.6 Main
 * Description: main creates a sweet jar with some sweets in, then creates
 * two consumers and sets them running.
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
      SweetJar theJar = new SweetJar(20);
      Consumer c1 = new Consumer(1, theJar);
      Consumer c2 = new Consumer(2, theJar);
      c1.start();
      c2.start();
   }
}
