package ex8_6;

/**
 * Title: Activity 8.6 SweetJar
 * Description: a container for sweets - incomplete, because one consumer
 * can gobble all the sweets
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 09/04/2004
 */

public class SweetJar
{
   private int numberOfSweets;
   // Introduce a new variable here to keep track of whose go it is.

   public SweetJar(int sweets)
   {
      numberOfSweets = sweets;
   }

   public int countSweets()
   {
      return numberOfSweets;
   }

   // Declare the eatSweet method synchronized
   public void eatSweet(int id)
   {
      // Add code here which makes a consumer wait while it's not its turn.
      System.out.println("Consumer " + id + " eats sweet " + numberOfSweets + 
         " - yummy!");
      numberOfSweets--;
      // Add code here which makes it the other consumer's turn
      // and wakes up other threads if they are blocked.
   }
}
