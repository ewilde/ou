package ex9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Title: Activity 9.2 RequestSender
 *
 * Description: the run method of this class takes three arguments
 *
 * String serverURL
 * int portNumber
 * String request
 *
 * When the run method is called, a network connection is established to a
 * server at the site identified by serverURL, listening on port portNumber.
 *
 * The request is then sent to the server, and the response is read line
 * by line and displayed on the standard output.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.3 12/09/2005
 */

public class RequestSender
{
   private Socket socket; // connection to server
   private PrintWriter out; // output stream to server
   private BufferedReader in; // input stream from server

   public void run(String hostName, int portNumber, String request)
   {
      try
      {
         /* Connect to the server.*/
         socket = new Socket(hostName, portNumber);
         System.out.println("Connected to site " + hostName + 
            " on port number " + portNumber);

         sendRequest(request);

         displayResponse();

         closeConnection();
      }

      catch (IOException e)
      {
         System.out.println(e);
      }
   }

   private void sendRequest(String request) throws IOException
   {
      /* Open a writer to send a request to the server. */
      out = new PrintWriter(socket.getOutputStream(), true /* autoFlush */);

      /* Send the request. */
      out.println(request);
      out.flush();

      System.out.println("Sending request: " + request);
   }

   private void displayResponse() throws IOException
   {
      /* Open a reader to receive the response from the server. */
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      /* Receive and display the response line by line */
      String responseLine = in.readLine();
      while (responseLine != null)
      {
         System.out.println(responseLine);
         responseLine = in.readLine();
      }
   }

   // Close streams and socket linked to server
   private void closeConnection() throws IOException
   {
      out.close();
      in.close();
      socket.close();
   }

}
