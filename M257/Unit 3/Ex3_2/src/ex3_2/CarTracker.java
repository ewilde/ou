package ex3_2;

/**
 * Title: Exercise 3.2 Class CarTracker
 * Description: A class for tracking the position of a car
 * using grid coordinates, with methods for calculating the
 * straight-line distance between two positions, and checking
 * whether the latter is greater than a specified number.
 *
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 18/01/2004
 */

public class CarTracker
{
   private int startX, startY, finishX, finishY;

   // A four-argument constructor.
   public CarTracker(int startXValue, int startYValue, int finishXValue, 
                     int finishYValue)
   {
      startX  = startXValue;
      startY  = startYValue;
      finishX = finishXValue;
      finishY = finishYValue;
   }

   // Setter methods.
   public void setStartCoords(int newX, int newY)
   {
      startX = newX;
      startY = newY;
   }

   public void setFinishCoords(int newX, int newY)
   {
      finishX = newX;
      finishY = newY;
   }

   // Getter methods.
   public int getStartXValue()
   {
      return startX;
   }

   public int getStartYValue()
   {
      return startY;
   }

   public int getFinishXValue()
   {
      return finishX;
   }

   public int getFinishYValue()
   {
      return finishY;
   }

   /* A method to find the distance between starting and ending points
      of the car's position. */
   public double journeyDistance()
   {
      return Math.sqrt(Math.pow(finishX - startX, 2.0) +
                       Math.pow(finishY - startY, 2.0));
   }

   /* A method to tell if the distance between the starting and
   ending points is greater than a specified length. */
   public boolean greaterThan(double distance)
   {
      return (journeyDistance() > distance);
   }
}
