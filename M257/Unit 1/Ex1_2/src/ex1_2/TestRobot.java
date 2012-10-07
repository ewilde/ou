package ex1_2;

/**
 * Title:       TestRobot class
 * Description: Test class for simple Robot class
 *
 *              This class is incomplete.
 *              You are to complete this class following the instructions
 *              for Activity 1.2
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.0
 */

public class TestRobot
{

   public static void main(String[] args)
   {

      // Declare three variables to reference Robots
      Robot artoo;
      Robot deetoo;
      Robot meetoo;

      // Create three Robot objects
      artoo = new Robot(); // Default starting position (1,1)
      deetoo = new Robot(2, 5); // Initially at x=2, y=5
      meetoo = new Robot(7, 7); // Initially at x=7, y=7

      // Display current position of each robot
      System.out.println("Initially artoo  is at " + artoo.getPosition());
      System.out.println("Initially deetoo is at " + deetoo.getPosition());
      System.out.println("Initially meetoo is at " + meetoo.getPosition());

      // Add method invocations here to do the following:
      //    Move the Robot named artoo one position North

      //    Move the Robot named deetoo one position East and then one position South

      //    Move the Robot named meetoo to the position with x and y coordinates
      //    5 and 3 respectively

      // Add code here to display new current position of each robot


   }
}
