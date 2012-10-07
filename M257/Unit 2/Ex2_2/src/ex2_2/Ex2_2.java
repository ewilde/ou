package ex2_2;

/**
 * Title: Exercise 2.2 Application - incomplete
 * Description: String concatenation and escape sequences
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 7/01/2004
 */

public class Ex2_2
{
   public void output()
   {
      /**
       * Complete the string expressions printout1 and printout2 below,
       * making use of the strings name1, name2, number and street,
       * so that when this output method is invoked the display will show:
       *
       * Sherlock Holmes and Dr. Watson lived at No. 221B, Baker Street.
       * "ABC,
       * double-XYZ,"
       * she recited.
       *
       */

      String name1  = "Sherlock Holmes";
      String name2  = "Dr. Watson";
      String number = "221B";
      String street = "Baker Street.";

      // Use these variables to create output strings
      String printout1;   //first line of output
      String printout2;   //remaining lines of output

      /* Replace the empty string below with a string expression
       * to produce the first line of the required output.
       * You should use concatenation to incorporate the four strings
       * already defined above.
       */
      printout1 = "";

      System.out.println(printout1);

      /* Replace the empty string below with a string expression
       * to produce the remaining lines of the required output.
       * You will need escape sequences for the quotation marks and
       * the new lines.
       */
      printout2 = "";

      System.out.println(printout2);

      //This line is here in order to show that the method has finished
      System.out.println("End of output.");
   }
}
