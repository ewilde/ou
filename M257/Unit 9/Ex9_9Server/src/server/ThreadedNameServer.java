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


import java.util.HashMap;
import java.net.*;
import java.util.Map;

public class ThreadedNameServer
{
   private Map<String,String> nameDatabase;

   //use a high numbered non-dedicated port
   private static final int PORT_NUMBER = 3000;

   // constructor
   public ThreadedNameServer()
   {
      System.out.println("...Name Server starting up");

      nameDatabase = setUpNameDatabase();

   } // end constructor


   //Set up name database and add sample data
   private Map<String, String> setUpNameDatabase()
   {
      Map<String, String> db = new HashMap<String, String>();

      db.put("Gareth Williams", "G.R.Williams@java2.co.uk");
      db.put("Robert Thomas", "R.Thomas@java2.co.uk");
      db.put("William Wilson", "W.Wilson@java2.co.uk");
      db.put("Anne Land", "A.Land@java2.co.uk");
      db.put("Dave Phillips", "D.Phillips@java2.co.uk");
      db.put("Kirsten Davis", "K.L.Davis@java2.co.uk");
      System.out.println("...Name database set up");

      return db;
   }

   // Loop endlessly waiting for client connections
   public void run()
   {
      //Establish a Server socket
      try
      {
         ServerSocket ss = new ServerSocket(PORT_NUMBER);

         int connectionCount = 0; //Count of client connections

         while (true)
         {
            // Wait for a connection request
            Socket socket = ss.accept();
            //Client has connected via socket
            connectionCount++;
            System.out.println("...Connection " + connectionCount + " established");

            Thread connection = new Thread(new ConnectionThread(socket, nameDatabase));
            connection.start();
         }
      }
      catch (Exception e)
      {
         System.out.println("Trouble with a connection " + e);
      }
   } // end method run

} // end class
