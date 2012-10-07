package user;

/**
 * Title: Class User
 * Description: Models users of an applet.
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 12/12/2003
 */

public class User
{
   // These variables are not explicitly initialized
   private String userID;
   private String emailAddress;
   private int    numOfAccesses;
   
   /* Setter methods */
   public void setUserID(String usIdVal)
   {
      userID = usIdVal;
   }
   
   public void setEmailAddress(String emailAddressVal)
   {
      emailAddress = emailAddressVal;
   }
   
   /* Getter methods */
   public String getUserID()
   {
      return userID;
   }
   
   public String getEmailAddress()
   {
      return emailAddress;
   }
   
   public int getNumOfAccesses()
   {
      return numOfAccesses;
   }
   
   /* Update number of accesses by this user */
   public void updateAccesses()
   {
      numOfAccesses++;
   }
}
