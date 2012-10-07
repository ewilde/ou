package ex8_8;

/**
 * Title: Exercise 8.8 Main
 * Description: creates a board game and three players, then starts the players off!
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 10/04/2004
 */


public class TestBoardGame
{
   public static void main(String[] args)
   {
      BoardGame theGame = new BoardGame();

      Player p1 = new Player(theGame, 1);
      Player p2 = new Player(theGame, 2);
      Player p3 = new Player(theGame, 3);

      p1.start();
      p2.start();
      p3.start();
   }
}
