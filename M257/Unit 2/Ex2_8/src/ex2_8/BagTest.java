package ex2_8;

/**
 * Title: Exercise 2.8 Class BagTest
 * Description: This class contains the main() method.  Its purpose is
 * to test the implementation of the Bag class.
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 4/12/2003
 */

public class BagTest
{
   public static void main(String[] args)
   {
      Bag bg = new Bag();
      
      //Add two 9's, an 8, three more 9's and a 2 to the bag
      bg.addToBag(9);
      bg.addToBag(9);
      bg.addToBag(8);
      bg.addToBag(9);
      bg.addToBag(9);
      bg.addToBag(9);
      bg.addToBag(2);
      System.out.println("Bag counts from 0 to 9");
      
      //should show 0 0 1 0 0 0 0 0 1 5
      bg.printCounts();
      
      //remove two 9's from the bag
      bg.removeFromBag(9);
      bg.removeFromBag(9);
      
      //there should now be three 9's in the bag
      System.out.println("After two removals the 9 count is " +
         bg.findNum(9));
      
      // remove any remaining 9's and 2's from the bag
      bg.removeAllFromBag(9);
      bg.removeAllFromBag(2);
      System.out.println("Bag counts from 0 to 9");
      
      //should show 0 0 0 0 0 0 0 0 1 0
      bg.printCounts();
      
      //empty the bag completely
      bg.emptyBag();
      System.out.println("Bag counts from 0 to 9");
      
      //should show 0 0 0 0 0 0 0 0 0 0
      bg.printCounts();
   }
}
