package server;

/**
 * Title:        NameServer class
 * Description:  Server that maintains a list of names which can be looked up
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version      1.0
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class NameServer
{
   private Map<String,String> nameDatabase;
   private ServerSocket ss;
   private Socket socket;

   //Streams for connections
   private InputStream is;
   private OutputStream os;
   private PrintWriter toClient;
   private BufferedReader fromClient;

   //use a high numbered non-dedicated port
   private static final int PORT_NUMBER = 3000;

   // Protocol definitions
   private static final String CLIENT_QUITTING = "Exit";          // Sent by client
   private static final String USER_NOT_FOUND = "User not known"; // Sent by server

   // constructor
   public NameServer()
   {
      System.out.println("...Name Server starting up");

      nameDatabase = setUpNameDatabase();

      //Establish a Server socket
      try
      {
         ss = new ServerSocket(PORT_NUMBER);
      }
      catch (Exception e)
      {
         System.out.println("Trouble with ServerSocket on port " + PORT_NUMBER +
            ": " + e);
      }
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


   public void run()
   {
      int connectionCount = 0; //Count of client connections
      try
      {
         //Loop endlessly waiting for client connections
         while (true)
         {
            // Wait for a connection request
            socket = ss.accept();
            //Client has connected
            connectionCount++;
            System.out.println("...Connection " + connectionCount + " established");

            openStreams();

            processClientRequests();

            closeStreams();
            socket.close();

         }
      }
      catch (Exception e)
      {
         System.out.println("Trouble with a connection " + e);
      }
   }

   // set up streams for communicating with the client
   private void openStreams() throws IOException
   {
      final boolean AUTO_FLUSH = true;
      is = socket.getInputStream();
      fromClient = new BufferedReader(new InputStreamReader(is));
      os = socket.getOutputStream();
      toClient = new PrintWriter(os, AUTO_FLUSH);
      System.out.println("...Streams set up");
   }

   // process a series of client requests
   // until client terminates the connection
   private void processClientRequests() throws IOException
   {
      String userName;  //Name request from client
      String userEmail;
      String reply;     //Reply sent to client

      userName = fromClient.readLine(); // get request from client
      while (!(userName.equals(CLIENT_QUITTING)))
      {
         userEmail = nameDatabase.get(userName);
         if (userEmail == null)
         {
            reply = USER_NOT_FOUND;
         }
         else
         {
            reply = userEmail;
         }
         toClient.println(reply);  //Send reply to client

         userName = fromClient.readLine(); // get next request
      }
   }


   private void closeStreams() throws IOException
   {
      toClient.close();
      os.close();
      fromClient.close();
      is.close();
      System.out.println("...Streams closed down");
   }

} // end class
