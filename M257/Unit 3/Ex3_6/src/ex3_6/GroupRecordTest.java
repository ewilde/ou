package ex3_6;

/**
 * Title: Exercise 3.6 Main class
 * Description: This class tests that we can insert both
 * Member and CommitteeMember objects into a GroupRecord,
 * and that when we print out the objects each responds using
 * its own version of the toString method.
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
      // Set up empty membership list.
      GroupRecord theGroup = new GroupRecord();
      Member      m1, m2, m3, m4;
      
      // Create two ordinary members
      m1 = new Member("MeiLing Brown", "meiling@somesite.com",
         "62, Lime Walk");
      m2 = new Member("Pablo Grey", "pg9@webwonderland.co.uk",
         "1a, Carmelite Close");
      
      // Create two committee members
      // Use CommitteeMember_Solution here to run the solution
      m3 = new CommitteeMember("Tariq White", "tw@ouranos.net",
         "5, Greek Mews", "Treasurer");
      m4 = new CommitteeMember("Ursula Black","ursula@starmap.galactic.net",
         "Flat 4, The Old Stables", "Chair");
      
      //add the four members to the group
      theGroup.addMember(m1);
      theGroup.addMember(m2);
      theGroup.addMember(m3);
      theGroup.addMember(m4);
      
      // There are now four members, so let's inspect them
      // one after another.  (To make this possible, we have
      // added an extra method getMemberAt to GroupRecord.)
      for (int index = 0; index < theGroup.getHeadCount(); index++)
      {
         Member thisMember = theGroup.getMemberAt(index);
         
         System.out.println(thisMember.toString());
      }
   }
}
