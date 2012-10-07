package ex8_8;

/**
 * Title: Activity 8.8 BoardGame
 * Description: simulates a board game in which players take turns
 * to roll a pair of dice
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */

public class BoardGame
{
   private int turn = 1;

   // Simulates the rolling of two cubical dice.
   public synchronized void rollDice(int playerID)
   {
      while (turn != playerID) // If this player is out of turn they must be blocked!
      {
         try
         {
            wait();
         }
         catch (Exception e)
         {
            System.out.println(e);
         }
      }

      // Simulate the scores when the dice are rolled.
      int score1 = ((int)(Math.random() * 6)) + 1;
      int score2 = ((int)(Math.random() * 6)) + 1;
      int total = score1 + score2;

      System.out.println("Player " + playerID + " scores " + total);
      // Cyclically increment turn.
      turn = turn + 1;
      if (turn == 4)
      {
         turn = 1;
      }
      notifyAll();
   }
}
