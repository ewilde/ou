package ex3_4;

/**
 * Title: Exercise 3.4 Main class
 * Description: This class tests the class Member
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 19/12/2003
 */

public class MemberTest
{
   public static void main(String[] args)
   {
      //create three Member objects
      Member m1 = new Member("Tariq White", "tw@ouranos.net", 
         "5, Greek Mews");
      Member m2 = new Member("Werner Blue", "werner9@ulife.edu", 
         "42, Foxhall Gardens");
      Member m3 = new Member("Tariq White", "tw@ouranos.net", 
         "5, Greek Mews");
      
      //Show their string representations
      System.out.println(m1.toString());
      System.out.println(m2.toString());
      System.out.println(m3.toString());
      
      //find out if the first is equal to the third (should be true)
      if (m1.equals(m3))
      {
         System.out.println(
            "The first and the third represent the same member.");
      }
   }
}
