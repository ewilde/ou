package ex3_5;

/**
 * Title: Exercise 3.5 Main class
 * Description: This class tests the class GroupRecord
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 20/12/2003
 */

public class GroupRecordTest
{
   public static void main(String[] args)
   {
      GroupRecord theGroup = new GroupRecord();

      // Create and add two members.
      Member m1 = new Member("MeiLing Brown", "meiling@somesite.com",
         "62, Lime Walk");
      Member m2 = new Member("Pablo Grey", "pg9@webwonderland.co.uk",
         "1a, Carmelite Close");

      theGroup.addMember(m1);
      theGroup.addMember(m2);

      // We can check the details of these members, using their toString method
      System.out.println("The two members added are:\n" + m1 + ", and\n" + m2);

      // Now retrieve selected details.
      System.out.println("\nNow we retrieve selected details:");
      System.out.println("MeiLing Brown's email address is " +
         theGroup.getEmailAddressForMember("MeiLing Brown"));
      System.out.println("Pablo Grey's home address is " +
         theGroup.getHomeAddressForMember("Pablo Grey"));
   }
}
