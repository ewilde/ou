package ex1_2;

/**
 * Title:       Robot class
 * Description: Simple robot class
 *              Models a robot which can move around on a 2-D grid
 *
 *              This class is complete and you should not need to change it
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.0
 */

public class Robot
{
   // Instance variables
   private int x; // x-position(W-E) of robot
   private int y; // y-position(N-S) of robot

   // Constructors
   public Robot()
   {
      x = 1;
      y = 1;
   }

   public Robot(int xPos, int yPos)
   {
      x = xPos;
      y = yPos;
   }

   // Methods
   public void moveNorth()
   {
      y = y + 1;
   }

   public void moveSouth()
   {
      y = y - 1;
   }

   public void moveEast()
   {
      x = x + 1;
   }

   public void moveWest()
   {
      x = x - 1;
   }

   public int getXPosition()
   {
      return x;
   }

   public int getYPosition()
   {
      return y;
   }

   public void moveTo(int xPos, int yPos)
   {
      x = xPos;
      y = yPos;
   }

   // Returns a character string indicating the current position,
   // formatted as (x,y)
   // This is an extra method, not mentioned in the course text, but
   // added here for convenience in displaying the robot's position
   // At this stage, you do not need to understand in detail how it works
   public String getPosition()
   {
      return ("(" + x + ", " + y + ")");
   }

} // end of class
