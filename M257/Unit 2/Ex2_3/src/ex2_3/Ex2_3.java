package ex2_3;

import java.util.Scanner; //this class is discussed in Unit 4

/**
 * Title: Exercise 2.3 Application - incomplete
 * Description: nested if statements
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 2/12/2003
 */

public class Ex2_3
{
   public void checkLicence()
   {
      // stored values for the user ID and registration code.
      int userID           = 2854;
      int registrationCode = 56027107;
      int id;     // the id entered by the user
      int code;   // the registration code entered by the user

      /*
       * The next lines prompt the user to type in an ID and
       * registration code.
       */
      Scanner scn = new Scanner(System.in);

      // obtain the user's id
      System.out.println("Please enter your user identification.");
     
      id = scn.nextInt();
 
      // obtain the user's registration code
      System.out.println("Please enter your registration code.");

      code = scn.nextInt();

      /*
       * Insert code here to check the inputs against the values
       * stored in userID and registrationCode, and replace the println
       * statement below according to the following specification:
       *
       * If the numbers the user has entered both agree with the corresponding
       * stored value the method should print out "Your registration is accepted."
       *
       * Otherwise the method should either print out
       *     "Sorry, your registration code was incorrect. Please try  again"
       * or  "Sorry, your userID was incorrect. Please try again."
       */
      System.out.println("Replace this println statement");
   }
}
