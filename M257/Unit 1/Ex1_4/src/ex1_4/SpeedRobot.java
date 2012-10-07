package ex1_4;

/**
 * Title:       SpeedRobot class
 * Description: Models a "speed" robot which can move around on a 2-D grid
 *              a fixed number of grid squares with each move
 *
 *              This class is incomplete.
 *              You are to complete this class following the instructions
 *              for Activity 1.4
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.0
 */

public class SpeedRobot extends Robot
{
   // Additional instance variable
   private int speed; // step size for moves

   // Constructor
   public SpeedRobot(int initialSpeed)
   {
      speed = initialSpeed;
   }

   // Additional methods
   public void setSpeed(int newSpeed)
   {
      speed = newSpeed;
   }

   public int getSpeed()
   {
      return speed;
   }

   // Complete the code for the following methods
   // Each is a new version, OVERRIDING the inherited method of the same name
   // Each method should move the robot by the number of grid squares
   // specified by the instance variable 'speed' (see above)
   public void moveNorth()
   {
      // add your code here
   }

   public void moveSouth()
   {
      // add your code here

   }

   public void moveEast()
   {
      // add your code here
   }

   public void moveWest()
   {
      // add your code here
   }
}