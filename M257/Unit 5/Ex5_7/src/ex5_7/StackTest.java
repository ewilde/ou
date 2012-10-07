package ex5_7;

/**
 * Title: Exercise 5.7
 * Description: Main class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.1 03/07/2005
 */

public class StackTest
{

   public static void main(String[] args)
   {
      Stack s = new LinkedStack();

      // Add three items to the stack, taking a peek each time.
      System.out.println("First put some elements on the stack...");
      s.push('C');
      System.out.println(s.peek() + " now on top.");

      s.push(12);
      System.out.println(s.peek() + " now on top.");

      s.push('H');
      System.out.println(s.peek() + " now on top.");

      System.out.println("It is " + s.isEmpty() + " that the stack is empty.");

      System.out.println();

      // Now take the items back off the stack.  At the end;
      // check that it is now empty.
      System.out.println("...then remove them again.");
      System.out.println(s.pop() + " taken off.");
      System.out.println(s.pop() + " taken off.");
      System.out.println(s.pop() + " taken off.");
      System.out.println("It is " + s.isEmpty() + " that the stack is empty.");
   }

}
