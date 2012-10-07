package ex8_8;

/**
 * Title: Exercise 8.8 Player
 * Description: a thread which simulates the player of a board game
 * 
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */

public class Player extends Thread
{

   private BoardGame theGame;
   private int playerID;

   public Player(BoardGame bg, int id)
   {
      theGame = bg;
      playerID = id;
   }

   public void run()
   {
      for (int i = 0; i < 100; i++)
      {
         theGame.rollDice(playerID);
      }
   }
}
