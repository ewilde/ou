package ex4_8;

/**
 * Title: Exercise 4.8
 * Description: A class which implements a very simple queue of integers.
 * Items can only be added to the queue (since we are mainly interested in
 * exploring errors due to a full queue).  A fuller implementation would
 * have other methods for removing elements and so on.
 *
 * This queue works by "Design by Contract".
 * It guarantees to add an item only if the queue is not full
 * before the add operation.  If the queue is full, the contract does not hold
 * and "anything" can happen.
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 18/03/2004
 *
 * You do not need to change anything in this class.
 */


public class FixedSizeContractQueue
{
   private int maxItems;      // maximum number of items in the queue
   private int numberOfItems; // current number of items in the queue
   private int[] queue;       // the queue items

   // Constructor - create a queue of specified capacity
   public FixedSizeContractQueue(int capacity)
   {
      maxItems = capacity;
      numberOfItems = 0;
      queue = new int[capacity];
   }

   // add a new item to the end of the queue
   // precondition: the queue must not be full
   public void add(int newItem)
   {
      queue[numberOfItems] = newItem;
      numberOfItems++;
   }

   // returns true if the number of items in the queue is at its maximum
   public boolean isFull()
   {
      return (numberOfItems >= maxItems);
   }

   // return contents of queue in string format
   public String toString()
   {
      String queueString = "";
      for (int i = 0; i < numberOfItems; i++)
      {
         queueString += (queue[i] + " ");
      }
      return queueString;
   }
}
