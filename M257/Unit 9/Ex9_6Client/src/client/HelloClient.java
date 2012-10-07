package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Title:        HelloClient class
 * Description:  Client that connects to a server, receives and displays a
 *               message and then terminates
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version      1.0
 */
public class HelloClient
{
    //Streams used for communicating with server
    private InputStream is;
    private BufferedReader fromServer;
    private Socket socket;    //Socket to server
    private static final int SERVER_PORT_NUMBER = 3000;

    public void run()
    {
        //set up connection to the server
        try
        {
            //These are other forms of local address you could use
            //instead of using getLocalHost() when creating the Socket
            //private static final String SERVER_ADDRESS = "127.0.0.1";
            //private static final String SERVER_ADDRESS = "localhost";
            
            InetAddress SERVER_ADDRESS = InetAddress.getLocalHost();
            System.out.println("Attempting to contact " + SERVER_ADDRESS);
            socket = new Socket(InetAddress.getLocalHost(), SERVER_PORT_NUMBER);
            openStreams();

            String messageFromServer = fromServer.readLine();
            System.out.println("Server said: " + messageFromServer); //display message

            closeStreams();
            socket.close();
        }
        catch (IOException e)
        {
            System.out.println("\nTrouble contacting the server " + e);
            System.out.println("Perhaps you need to start the server?");
        }
    }

    // open streams for communicating with the server
    private void openStreams() throws IOException
    {
        is = socket.getInputStream();
        fromServer = new BufferedReader(new InputStreamReader(is));
    }

    // close streams to server
    private void closeStreams() throws IOException
    {
        fromServer.close();
        is.close();
    }
} // end class

