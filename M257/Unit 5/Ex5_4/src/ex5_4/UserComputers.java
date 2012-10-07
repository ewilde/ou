package ex5_4;

import java.util.Map;

/**
 * Title: Exercise 5.4 Class UserComputers - incomplete
 * Description: Maps computer users to the computer they use,
 * using a HashMap.  Both user and computer are represented
 * by strings.
 *
 * Copyright:   Copyright (c) 2004, 2005, 2010
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.1 19/01/2010
 */

// Import appropriate package here. Note that you can use right-click and Fix Imports!

class UserComputers
{

   private Map<String, String> userTable;

   public UserComputers(int capacity)
   {
      // Constructor creates a hash map,
      // 'capacity' specifies its initial capacity.
   }

   public void addLink(String userName, String computerName)
   {
      // Adds the information that user userName is
      // associated with computer computerName.
   }

   public String getComputer(String userName)
   {
      // Returns the name of the computer associated with user userName.

   }

   public boolean isThereAUser(String userName)
   {
      // Returns true if there is a user
      // userName, false otherwise.
   }

   public boolean isThereAComputer(String computerName)
   {
      // Returns true if there is a
      // computer computerName, false otherwise.
   }
}
