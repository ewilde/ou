package ex3_1;

/**
 * Title: Exercise 3.1 Class UserTest
 * Description: UserTest lets us create some User objects
 * and invoke methods on them
 *
 * Copyright:    Copyright (c) 2003, 2006, 2010
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1
 */

import user.*;   //the User class is in the package called user


public class UserTest
{
   public static void main(String[] args)
   {
      /* Sample statements.*/
      String ema;    // a string reference
      User   ivan;   // a User reference
      
      ivan = new User();   // create a User object referenced by ivan
      
      ivan.setEmailAddress("ivan@nonsuch.com");
      
      ema = ivan.getEmailAddress();   //initialize the string reference
      
      // Check that the string referenced by ema is what we expect
      System.out.println("The email address is " + ema);
      
      /* Add code below here to do the tasks in Ex3_1 */
   }
}
