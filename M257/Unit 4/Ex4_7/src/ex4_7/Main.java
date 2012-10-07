package ex4_7;

/**
 * Title: Exercise 4.7 Main class
 * Description: Allows testing of FixedSizeQueue class.
 *              No changes are needed to this class.
 *              The project will not compile until you have made changes to
 *              the FixedSizeQueue class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 18/03/2004
 */

public class Main
{

   public static void main(String[] args)
   {
      FixedSizeQueue queue;

      // Test 1 of 2.
      System.out.println( 
         "\nTest 1: create a queue of capacity 4 and fill it up");
      queue = new FixedSizeQueue(4);

      for (int i = 0; i < 4; i++)
      {
         System.out.println("Item added to queue: " + queue.add(i * 10));
      }
      System.out.println("Queue contents: " + queue);


      // Test 2 of 2.
      System.out.println("\nTest 2: try to add one item too many");
      System.out.println("Item added to queue: " + queue.add(40));
      System.out.println("Queue contents: " + queue);


   }
}
