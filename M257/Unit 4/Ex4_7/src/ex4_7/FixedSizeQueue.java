package ex4_7;

/**
 * Title: Exercise 4.7
 * Description: A class which implements a very simple queue of integers.
 * Items can only be added to the queue (since we are mainly interested in
 * exploring errors due to a full queue).  A fuller implementation would
 * have other methods for removing elements and so on, but you do not need
 * to add these here.
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 18/03/2004
 *
 * Complete the isFull method and modify the add method to guard against
 * attempts to add too many items, using the defensive programming approach
 * outlined in the course text.
 */


public class FixedSizeQueue
{
   private int maxItems;      // maximum number of items in the queue
   private int numberOfItems; // current number of items in the queue
   private int[] queue;       // the queue items

   // Constructor - create a queue of specified capacity
   public FixedSizeQueue(int capacity)
   {
      maxItems = capacity;
      numberOfItems = 0;
      queue = new int[capacity];
   }

   // add a new item to the end of the queue
   // ** modify this method to protect against adding too many items
   public boolean add(int newItem)
   {
      queue[numberOfItems] = newItem;
      numberOfItems++;
      return true;
   }


   // returns true if the number of items in the queue is at its maximum
   private boolean isFull()
   {
      // ** add your code here
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
