package ex3_6;

/**
 * Title: Exercise 3.10 Class Member
 * Description:  Instances of Member represent members of
 * a local conservation group
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 19/12/2003
 * @since Ex3_4
 */

public class Member
{
   private String name;
   private String emailAddress;
   private String homeAddress;
   
   public Member(String nam, String ema, String adr)
   {
      name         = nam;
      emailAddress = ema;
      homeAddress  = adr;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getEmailAddress()
   {
      return emailAddress;
   }
   
   public String getHomeAddress()
   {
      return homeAddress;
   }
   
   public String toString()
   {
      return getName() + ", email address " + getEmailAddress() +
         ", home address " + getHomeAddress();
   }
   
   public boolean equals(Object o)
   {
      Member mem = (Member) o;
      boolean boo = name.equals(mem.getName()) &&
         emailAddress.equals(mem.getEmailAddress()) &&
         homeAddress.equals(mem.getHomeAddress());

      //Local variable boo is introduced merely for readability.
      return boo;
   }
}
