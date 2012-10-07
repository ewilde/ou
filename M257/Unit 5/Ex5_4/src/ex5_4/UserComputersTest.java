package ex5_4;

/**
 * Title: Exercise 5.4 Main class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 19/01/2004
 */

public class UserComputersTest
{

   public static final int INITIAL_TABLE_CAPACITY = 5;

   public static void main(String[] args)
   {
      //  Create a UserComputers instance...
      UserComputers usersAndComputers = new UserComputers 
         (INITIAL_TABLE_CAPACITY);

      // ...and add some links to it.
      System.out.println("Making links");
      System.out.println
         ("Mr X - B2\nMs Y - C1\nMs W - D0\nMr Z - A3\nMs V - A3");
      System.out.println("A3 is shared!\n");

      usersAndComputers.addLink("Mr X", "B2");
      usersAndComputers.addLink("Ms Y", "C1");
      usersAndComputers.addLink("Ms W", "D0");
      usersAndComputers.addLink("Mr Z", "A3");
      usersAndComputers.addLink("Ms V", "A3");

      //  Now test the methods defined in UserComputers.
      System.out.println("Testing methods");
      System.out.println("The computer used by Mr X is " +
         usersAndComputers.getComputer("Mr X"));
      System.out.println("The computer used by Mr Z is " +
         usersAndComputers.getComputer("Mr Z"));
      System.out.println("The computer used by Ms V is " +
         usersAndComputers.getComputer("Ms V"));

      System.out.println("Is there such a user as Ms W?");
      System.out.println(usersAndComputers.isThereAUser("Ms W"));
      System.out.println("Is there such a user as Mr U?");
      System.out.println(usersAndComputers.isThereAUser("Mr U"));

      System.out.println("Is there such a computer as D0?");
      System.out.println(usersAndComputers.isThereAComputer("D0"));
      System.out.println("Is there such a computer as A1?");
      System.out.println(usersAndComputers.isThereAComputer("A1"));

   }
}
