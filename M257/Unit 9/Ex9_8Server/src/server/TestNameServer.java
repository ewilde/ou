package server;

/**
 * Title:        TestNameServer class
 * Description:  Tests the NameServer class
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version      1.0
 */

public class TestNameServer
{

   // Create a name server and have it respond to client requests
   public static void main(String[] args)
   {
      NameServer server1 = new NameServer();
      server1.run();
   } // end main

}
