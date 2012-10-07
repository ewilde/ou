package ex2_8;

/**
 * Title: Exercise 2_8 Bag Class
 * Description: A bag is a collection of data that keeps track
 * of the number of times each item occurs in it.  In this case
 * the items are digits 0 - 9.
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 4/12/2003
 */

public class Bag
{
   // bagVals is the array containing the count of each digit
   // Initially, the bag is empty.
   private int[] bagVals =
   {
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0
   };
   
   public void addToBag(int toBeAdded)
   {
      bagVals[toBeAdded]++;
   }
   
   public int findNum(int numToBeLookedFor)
   {
      return bagVals[numToBeLookedFor];
   }
   
   //Complete the method void removeFromBag(int tobeRemoved) at this point.
   //This method should reduce the number of occurrences of the
   //digit toBeRemoved from the bag by one
   public void removeFromBag(int toBeRemoved)
   {
   }
   
   //Complete the method void removeAllFromBag(int toBeRemoved) here
   //This method should remove all occurrences of the
   //digit toBeRemoved from the bag
   public void removeAllFromBag(int toBeRemoved)
   {
   }
   
   //Complete the method void emptyBag() here
   public void emptyBag()
   {
   }
   
   //Complete the method printCounts, which prints out
   //the number of each digit in the bag.
   //Make use of the findNum method defined in this class
   public void printCounts()
   {
   }
}
