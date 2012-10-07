package datagramserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Title: DatagramServer
 *
 * Description: accepts datagram packets sent by clients and prints them
 * to the standard output
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 01/06/2004
 */
public class DatagramServer
{
    // Number of bytes in a UDP packet
    private static final int MAX_UDP_PACKET_SIZE = 512;
    // Port number on which datagram is expected
    private static final int PORT_NUMBER = 4000;
    // Message which indicates that the client is quitting
    private static final String CLIENT_QUITTING = "Client quitting";
    private DatagramSocket datagramSocket;        //The datagram socket

    public DatagramServer()
    {
        System.out.println("...Server starting");
        try
        {
            //Set up datagram socket on port
            datagramSocket = new DatagramSocket(PORT_NUMBER);
        }
        catch (IOException e)
        {
            System.out.println("Problem setting up DatagramSocket:" + e);
        }
    }

    public void receiveData()
    {
        String message;                     //Message from client
        DatagramPacket packet;      //The packet of data received

        // Buffer for receiving a UDP packet
        byte[] buffer = new byte[MAX_UDP_PACKET_SIZE];

        try
        {
            // Continue reading packets until exit message
            boolean morePackets = true;

            //Create an empty packet to receive the data
            //messages larger than buffer.length are truncated
            packet = new DatagramPacket(buffer, buffer.length);

            while (morePackets)
            {
                //Receive a packet from the client
                datagramSocket.receive(packet);

                message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Message received is '" + message + "'");

                morePackets = ! message.equals(CLIENT_QUITTING);
            }
            System.out.println("...Server Terminating");
        }
        catch (IOException e)
        {
            System.out.println("Problem receiving packet:" + e);
        }
    }
}
