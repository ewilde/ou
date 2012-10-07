package ex1_4;

/**
 * Title:       TestRobot class
 * Description: Contains test code for various types of robot objects
 *              Creates robot objects of various types and invokes some
 *              of their methods.  Displays the results both as text output
 *              and graphically on a display grid in 'slow motion'.
 *              At this stage, you are not expected to understand how the
 *              display grid works - it is purely for demonstration.
 *
 *              This class is complete and you should not need to change it
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

      System.out.println("Initially artoo  is at " + artoo.getPosition());
      System.out.println("Initially deetoo is at " + deetoo.getPosition());
      System.out.println("Initially meetoo is at " + meetoo.getPosition());

      Grid grid = new Grid(); // Create a display grid
      grid.display(); // Display the initial state of the grid

      grid.addRobot(artoo, "artoo"); // Add artoo to the grid
      grid.display();

      grid.addRobot(deetoo, "deetoo"); // Add deetoo to the grid
      grid.display();

      grid.addRobot(meetoo, "meetoo"); // Add meetoo to the grid
      grid.display();

      // Move the Robot named artoo one position North
      artoo.moveNorth();
      grid.display();
      // Move the Robot named deetoo one position East and then one position South
      deetoo.moveEast();
      grid.display();
      deetoo.moveSouth();
      grid.display();
      // Move the Robot named meetoo to position x = 5 and y = 3
      meetoo.moveTo(5, 3);
      grid.display();

      System.out.println("Now artoo  is at " + artoo.getPosition());
      System.out.println("Now deetoo is at " + deetoo.getPosition());
      System.out.println("Now meetoo is at " + meetoo.getPosition());

      // Declare three variables to reference new kinds of robots
      MagicRobot gandalf;
      SpeedRobot gonzales;
      VariableSpeedRobot sillyWalker;

      // Create one of each kind of robot objects
      gandalf = new MagicRobot();
      gonzales = new SpeedRobot(5);
      sillyWalker = new VariableSpeedRobot(3);

      // Add the three new robot objects to the display grid
      // and show the state of the grid after each robot is added
      grid.addRobot(gandalf, "gandalf");
      grid.display();
      grid.addRobot(gonzales, "gonzales");
      grid.display();
      grid.addRobot(sillyWalker, "sillyWalker");
      grid.display();

      System.out.println("Initially gandalf is at " + gandalf.getPosition()
              + " and is visible: " + gandalf.isVisible());
      System.out.println("Initially gonzales is at " + gonzales.getPosition());
      System.out.println("Initially sillyWalker is at " + sillyWalker.getPosition());

      // move the robots around to demonstrate how they work
      gandalf.moveNorth();
      grid.display();
      gandalf.moveNorth();
      grid.display();
      gandalf.moveNorth();
      grid.display();
      gonzales.moveNorth();
      grid.display();
      gonzales.moveEast();
      grid.display();
      sillyWalker.moveNorth();
      grid.display();
      sillyWalker.moveNorth(4);
      grid.display();
      gandalf.makeVisible();
      grid.display();

      System.out.println("Now gandalf is at " + gandalf.getPosition()
              + " and is visible: " + gandalf.isVisible());
      System.out.println("Now gonzales is at " + gonzales.getPosition());
      System.out.println("Now sillyWalker is at " + sillyWalker.getPosition());

   }
}
