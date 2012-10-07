package ex1_4;

/**
 * Title:       MagicRobot class
 * Description: Models a "magic" robot which can move around on a 2-D grid
 *              but also make itself visible or invisible
 *
 *              This class is complete and you should not need to change it
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.0
 */

public class MagicRobot extends Robot
{
   private boolean visible; // true or false

   // Constructor
   public MagicRobot()
   {
      makeInvisible();
   }

   public void makeVisible()
   {
      visible = true;
   }

   public void makeInvisible()
   {
      visible = false;
   }

   public boolean isVisible()
   {
      return visible;
   }
}