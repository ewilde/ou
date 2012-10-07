package ex4_8;

/**
 * Title: Exercise 4.8 Main class
 * Description: Allows testing of FixedSizeContractQueue class.
 *
 * The project will run without changes, but will produce an error message.
 *
 * You are to modify the attempts to add new items to ensure that the contract
 * conditions hold
 * i.e that the add operation is not invoked if the queue is full.
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
      FixedSizeContractQueue queue;

      // Test 1 of 2.
      System.out.println(
         "\nTest 1: create a queue of capacity 4 and fill it up");
      queue = new FixedSizeContractQueue(4);

      for (int i = 0; i < 4; i++)
      {
         queue.add(i * 10);      // modify this to ensure contract holds
      }
      System.out.println("Queue contents: " + queue);


      // Test 2 of 2.
      System.out.println("\nTest 2: try to add one item too many");

      queue.add(40);      // modify this to ensure contract holds

      System.out.println("Queue contents: " + queue);


   }
}
