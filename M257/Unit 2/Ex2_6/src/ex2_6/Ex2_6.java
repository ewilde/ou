package ex2_6;

/**
 * Title: Exercise 2.6 Application missing some code
 * Description: Uses for loops
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 3/12/2003
 */

public class Ex2_6
{
   public void countDownFrom(int startingValue)
   {
      System.out.println("First task: counting down from " + startingValue + ".");

      for (int i = startingValue; i >= 0; i--)
      {
          System.out.println(i);
      }
   }

   public void totalFromOneTo(int finalValue)
   {
      int total = 0;

      System.out.println(
         "Second task: finding the total of the numbers from 1 to " +
         finalValue + ".");

      for (int i = 1; i <= finalValue; i++)
      {
         total = total + i;
      }

      System.out.println("The result is " + total + ".");
   }

   public void howManySquaresUpTo(int limit)
   {
      int count = 0;   // use this to count how many squares are no bigger than limit

      System.out.println("Third task: finding the number of squares up to " + 
         limit + ".");

      for (int i = 1; i <= limit; i++)
      {
         if (i * i <= limit)
         {
             count++;
         }
         else{
             break;
         }
      }

      System.out.println("There are " + count +
         " numbers whose squares are no bigger than " + limit + ".");
   }
}
