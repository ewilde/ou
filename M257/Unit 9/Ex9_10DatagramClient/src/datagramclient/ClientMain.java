package datagramclient;

/**
 * Title: ClientMain
 * Description: creates an instance of DatagramClient and invokes the
 * sendDatagramPacket method on it
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 02/06/2004
 */

public class ClientMain
{
    
    public static void main(String[] args)
    {
        DatagramClient client = new DatagramClient();
        System.out.println("Socket set up - ready to send postcard");
        
        client.sendDatagramPacket("Hello Server, wish you were here");
        client.sendDatagramPacket("The weather is lovely.  Must rush, Client");
        client.sendDatagramPacket("Client quitting");
        
        System.out.println("Postcard sent - let's hope it gets there!");        
    }
}
