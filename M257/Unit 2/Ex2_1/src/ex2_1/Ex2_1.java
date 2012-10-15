package ex2_1;

/**
 * Title: Exercise 2.1 Application
 * Description: Arithmetic operations and order of evaluation
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author  M257 Course Team
 * @version 1.1 7/01/2004
 */

public class Ex2_1
{
   /**
    * Method calculate
    *
    *
    */

   public void calculate()
   {
      final int A = 8;
      final int B = 89;
      final int C = 5;
      final int D = 13;
      final int E = 21;
      int       result;   //used to store the value of the calculated expression

      /**
       * Edit the next line of code to make the result as big as possible.
       * You must use each of A, B, C, D and E exactly once, in any order,
       * but without changing their values, and each of the four arithmetic
       * operators +, -, * and / just once.  Use brackets to ensure the order
       * of evaluation is the one you intend.
       *
       * Your target is to achieve a value greater than 3000!
       */

      result = ((A + B) - C) * (D / E);

      // The following statement produces the program output
      // including the value stored in the result variable
      System.out.println("The result is " + result);
   }
}
