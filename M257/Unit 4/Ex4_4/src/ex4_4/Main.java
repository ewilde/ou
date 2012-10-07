package ex4_4;

/**
 * Title: Exercise 4.4 Test class
 * Description: A class to run the application
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 8/01/2004
 */

public class Main
{
   public static void main(String[] args)
   {
      GreedyClass testInstance = new GreedyClass();
      System.out.println("Activity 4.4");

      final int AMOUNT = 1000 * 1000 * 1000;

      System.out.println("Try to allocate memory for " + AMOUNT + " ints");
      testInstance.grabSomeMemory(AMOUNT);
      System.out.println("Successfully allocated");

   }
}
