package ex2_4;

/**
 * Title: Exercise 2.4 Application
 * Description: Relational and logical operators
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 7/01/2004
 */

public class Ex2_4
{
   public void checkTruthValues()
   {
      final int     A = 15;
      final int     B = 11;
      final int     C = 4;
      final boolean D = true;
      boolean       p, q, r, s, t, u;

      /** At present, all six expressions below evaluate to false.
       *  Your task is to change the relational or logical operators
       *  in the expressions so that each will evaluate to true.
       */

      p = (A < C) && D;
      q = (A != B + C) || (B == C);
      r = (4 < C) && (A != 16);
      s = !D && ((A != B) && (4 >= C));
      t = !((A != B) && (B > C));
      u = p && ((B == (A - C)) || !D);

      System.out.println("The value of p is " + p);
      System.out.println("The value of q is " + q);
      System.out.println("The value of r is " + r);
      System.out.println("The value of s is " + s);
      System.out.println("The value of t is " + t);
      System.out.println("The value of u is " + u);
   }
}
