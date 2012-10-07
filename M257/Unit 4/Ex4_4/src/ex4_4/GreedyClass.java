package ex4_4;

/**
 * Title: Exercise 4.4
 * Description: A class which will throw a fairly unusual exception!
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 8/01/2004
 */
public class GreedyClass
{
   int [] greedy;

   public void grabSomeMemory(int n)
   {
      greedy = new int[n];
   }
}
