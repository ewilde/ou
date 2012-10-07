package ex4_1;

/**
 * Title: Exercise 4.1
 * Description: Incomplete version of a class
 * to demonstrate simple keyboard input
 *
 * Copyright:   Copyright (c) 2004, 2005, 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 2.0 30/06/2006
 */

import java.util.Scanner;

public class Greeter
{
   public void run()
   {
      String yourName;
      
      // Create a Scanner instance here.
      
      System.out.println("What is your name?");
      
      yourName = sc.nextLine();
      
      while (!yourName.equals("Bye"))
      {
         // Insert code to print a suitable greeting, then
         // prompt again for the name and read the next line
         // of input.
      }
      
      System.out.println("Goodbye for now");
      
      sc.close();
   }
}
