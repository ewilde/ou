package ex1_3;

/**
 * Title:       TestRobot class
 * Description: Test class for simple Robot and MagicRobot classes
 *
 *              This class is incomplete.
 *              You are to complete this class following the instructions
 *              for Activity 1.3
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.0
 */

public class TestRobot
{

   public static void main(String[] args)
   {
      // Declare a variable to reference a Robot
      Robot meetoo;

      // Create a Robot object
      meetoo = new Robot(7, 7); // Initially at x=7, y=7
      System.out.println("Initially meetoo is at " + meetoo.getPosition());

      // Move the Robot named meetoo to the position x=5 and y=3
      meetoo.moveTo(5, 3);
      System.out.println("Now meetoo is at " + meetoo.getPosition());

      // Declare a variable to reference a MagicRobot
      MagicRobot gandalf;

      // Create new MagicRobot object
      gandalf = new MagicRobot();

      // Insert your code here as follows:

      // Display the initial state of the magic robot
      // - both its position and whether it is visible or not
      // - note you can print out a boolean value directly (as true or false)
      System.out.println("Magic robot position: " + gandalf.getPosition());
      System.out.println("Magic robot visibility: " + gandalf.isVisible());

      // Make the magic robot visible
      gandalf.makeVisible();

      // Move the magic robot 2 places to the North
      gandalf.moveNorth();
      gandalf.moveNorth();

      // Display the new state of the magic robot
      // - both its position and whether it is visible or not
      System.out.println("Magic robot position: " + gandalf.getPosition());
      System.out.println("Magic robot visibility: " + gandalf.isVisible());

      // Make the magic robot invisible
      gandalf.makeInvisible();

      // Move the magic robot to position x=3, y=3
      gandalf.moveTo(3, 3);

      // Display the new state of the magic robot
      // - both its position and whether it is visible or not
      System.out.println("Magic robot position: " + gandalf.getPosition());
      System.out.println("Magic robot visibility: " + gandalf.isVisible());
   }
}
