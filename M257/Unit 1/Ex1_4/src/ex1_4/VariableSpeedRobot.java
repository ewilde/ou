package ex1_4;

/**
 * Title:       VariableSpeedRobot class
 * Description: Models a "variable speed" robot which normally moves around
 *              on a 2-D grid by a fixed number of grid squares with each move,
 *              but can vary this 'move size' when necessary
 *
 *              You are to complete this class following the instructions
 *              for Activity 1.4
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.0
 */
public class VariableSpeedRobot extends SpeedRobot
{

   // Constructor
   public VariableSpeedRobot(int initialSpeed)
   {
      // Invoke the constructor of the superclass, SpeedRobot
      // We need to do this explicitly because it has an argument
      // At this stage you do not need to understand the use of the keyword 'super'
      // This is explained in a later unit
      super(initialSpeed);
   }
   
   // Complete the code for the following methods
   // Each is a new version, OVERLOADING the inherited method of the same name
   // Each method should move the robot by the number of grid squares
   // specified by the argument 'theSpeed'
   public void moveNorth(int theSpeed)
   {
      this.setY(this.getY() + theSpeed);
   }

   public void moveSouth(int theSpeed)
   {
      this.setY(this.getY() - theSpeed);
   }

   public void moveEast(int theSpeed)
   {
      this.setX(this.getX() + theSpeed);
   }

   public void moveWest(int theSpeed)
   {
      this.setX(this.getX() - theSpeed);
   }

}
