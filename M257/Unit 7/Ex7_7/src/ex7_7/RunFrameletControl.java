package ex7_7;

/**
 * Title: Exercise 7.7 RunFrameletControl
 * A main class for launching a framelet control panel.
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 11/03/2004
 */

public class RunFrameletControl
{

   public RunFrameletControl()
   {
   }

   public static void main(String[] args)
   {
      FrameletControl fc = new FrameletControl();
      fc.setVisible(true);
   }
}
