package ex9_3;

import java.net.InetAddress;

/**
 * Title: Exercise 9.3 HostNameFinder
 *
 * This class finds the host name
 * of the computer on which the program is running.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.1 24/05/2004
 */

public class HostNameFinder
{
   public static void main(String[] args)
   {
      try
      {
         System.out.println("Host name: " + 
            InetAddress.getLocalHost().getHostName());
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }

}
