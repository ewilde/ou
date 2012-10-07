package ex3_3;

/**
 * Title: Exercise 3.3 main class
 * Description: Tests the toString() method of RoomID
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 16/12/2003
 */

public class RoomIDTest
{
   public static void main(String[] args)
   {
      RoomID firstID  = new RoomID("Seaward", 37);
      RoomID secondID = new RoomID("Windward", 48);

      System.out.println();
      System.out.println(firstID.toString());
      System.out.println(secondID.toString());
   }
}
