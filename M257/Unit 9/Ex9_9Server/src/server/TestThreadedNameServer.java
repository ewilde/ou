package server;

/**
 * Title:
 * Description:
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0
 */

public class TestThreadedNameServer
{
   public static void main(String[] args)
   {
      ThreadedNameServer server1 = new ThreadedNameServer();
      server1.run();
   } // end main

}
