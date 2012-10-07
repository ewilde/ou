package ex2_5;

/**
 * Title: Exercise 2.5 Application missing some code
 * Description: Accessing an array
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 3/12/2003
 */

import java.util.Scanner; //this class is discussed in Unit 4

public class Ex2_5
{
   public void selectAPlanet()
   {
      /* The planets array contains the names of the planets in order of their
       * distance from the Sun.
       * For example, Mercury is closest to the sun, followed by Venus.
       *
       * The program asks the user to enter a number, representing the position
       * of the planet in order of distance from the Sun. For example, Mercury
       * is 1st, in terms of its distance from the Sun and Neptune is 8th
       *
       * The programmer didn't list Pluto, which is 9th from the Sun 
	   (though not technically a planet).
       */

      //(3) Add Pluto as furthest from the Sun
      String[] planets =
      {
         "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
         "Neptune"
      };

      System.out.println("THE SOLAR SYSTEM");

      Scanner scn = new Scanner(System.in);

      // Prompts the user to input a value from the keyboard.
      System.out.println("Which number planet do you choose (1 - " +
         planets.length + ")?");
      System.out.println("Type your choice and press ENTER.");

      int choice = scn.nextInt();

      // (2) Complete the if condition below so that it also checks
      // that the entered choice is within the length of the planets array
      if (choice < 1 /*Code missing*/)
      {
         System.out.println("Sorry, there is no such planet.");
      }
      else

      // (2) complete the string so that it prints the planet
      // at the chosen position of distance from the Sun
      {
         System.out.println("Your chosen planet was " /*Code missing*/ + ".");
      }
   }
}
