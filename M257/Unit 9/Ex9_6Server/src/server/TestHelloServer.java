package server;


/**
 * Title:        TestHelloServer class
 * Description:  Tests the HelloServer class
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version      1.0
 */

public class TestHelloServer
{
   // Create a server and have it greet the client
   public static void main(String[] args)
   {
      HelloServer server1 = new HelloServer();
      server1.run();
   }
}
