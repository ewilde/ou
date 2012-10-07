package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;

/**
 * Title:
 * Description:
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0
 */

public class ConnectionThread implements Runnable
{
   private Socket socket;
   private Map<String,String> nameDatabase;

   //Streams for connections
   private InputStream is;
   private OutputStream os;
   private PrintWriter toClient;
   private BufferedReader fromClient;

   // Protocol definitions
   private static final String CLIENT_QUITTING = "Exit";          // Sent by client
   private static final String USER_NOT_FOUND = "User not known"; // Sent by server


   public ConnectionThread(Socket s, Map<String,String> nameData)
   {
      socket = s;
      nameDatabase = nameData;
   }

   public void run()
   {
      try
      {
         openStreams();

         processClientRequests();

         closeStreams();
         socket.close();
      }
      catch (Exception e)
      {
         System.out.println("Trouble with a connection " + e);
      }
   }


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
      String userName;        // String read from client
      String userEmail;       // Result from name database
      String reply;           // Reply sent to client

      userName = fromClient.readLine();
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
         toClient.println(reply);

         userName = fromClient.readLine();
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

}
