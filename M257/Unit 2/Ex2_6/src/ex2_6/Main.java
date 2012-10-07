package ex2_6;

/**
 * Title: Exercise 2.6 Main class
 * Description:
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 3/12/2003
 */

public class Main
{
   public static void main(String[] args)
   {
      int testValue = 101;
      Ex2_6 test = new Ex2_6();

      test.countDownFrom(testValue);
      test.totalFromOneTo(testValue);
      test.howManySquaresUpTo(testValue);
   }
}
