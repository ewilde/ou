package datagramclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Title: DatagramClient
 *
 * Description: sends datagram packets to a server
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 01/06/2004
 */

public class DatagramClient
{
   private static final int MAX_UDP_PACKET_SIZE = 512;
   private static final int PORT_NUMBER = 4000;

   private DatagramSocket datagramSocket;

   public DatagramClient()
   {
      try
      {
         /* Set up datagram socket. */
         datagramSocket = new DatagramSocket();
      }
      catch (IOException e)
      {
         System.out.println("Trouble setting up datagram socket" + e);
      }
   }

   public void sendDatagramPacket(String message)
   {
      DatagramPacket packet;
          
      //messsages larger than MAX_UDP_PACKET_SIZE 
      //will be truncated on the server side
      if(message.length() > MAX_UDP_PACKET_SIZE)
      { 
          System.out.println("warning: this message will be truncated to " + MAX_UDP_PACKET_SIZE +  " bytes");
      }
      
      byte[] toBeSent = message.getBytes();

      try
      {
         /* Packet contains the data, total length of data,
         destination IP address and destination port. */
         packet = new DatagramPacket(toBeSent, toBeSent.length,
            InetAddress.getLocalHost(), PORT_NUMBER);

         datagramSocket.send(packet);
      }
      catch (IOException e)
      {
         System.out.println("Trouble sending datagram packet" + e);
      }
   }
}
