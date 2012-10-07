package ex9_5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Title:        HelloServer class
 * Description:  Server that says "Hello Walrus" to a client and then terminates
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version      1.0
 */

public class HelloServer
{

   private ServerSocket serverSocket;
   private Socket socket;

   // streams for communication to client
   private OutputStream os;
   private PrintWriter toClient;

   // use a high numbered non-dedicated port
   private static final int PORT_NUMBER = 3000;
   private static final String MESSAGE_TO_CLIENT = "Hello Walrus";

   // constructor
   public HelloServer()
   {
      System.out.println("...Server starting up");

      try
      {
         // create a ServerSocket object to listen on the port
         serverSocket = new ServerSocket(PORT_NUMBER);
      }
      catch (IOException e)
      {
         System.out.println("Trouble with ServerSocket on port " + PORT_NUMBER +
            ": " + e);
      }
   } // end constructor


   public void run()
   {
      try
      {
         // wait for a connection request
         socket = serverSocket.accept();
         System.out.println("...Connection established");

         openStreams();

         toClient.println(MESSAGE_TO_CLIENT);

         closeStreams();
         socket.close();
      }
      catch (IOException e)
      {
         System.out.println("Trouble with a connection " + e);
      }
   }

   // set up streams for communicating with the client
   private void openStreams() throws IOException
   {
      final boolean AUTO_FLUSH = true;
      os = socket.getOutputStream();
      toClient = new PrintWriter(os, AUTO_FLUSH);
      System.out.println("...Streams set up");
   }

   // close output streams to client
   private void closeStreams() throws IOException
   {
      toClient.close();
      os.close();
      System.out.println("...Streams closed down");
   }

} // end class
