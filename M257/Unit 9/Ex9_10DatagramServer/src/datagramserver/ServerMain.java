package datagramserver;

/**
 * Title: ServerMain
 * Description: simply creates an instance of DatagramServer
 * Program execution takes place within the constructor.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 02/06/2004
 */


public class ServerMain
{
   public static void main(String[] args)
   {
      DatagramServer server = new DatagramServer();
      server.receiveData();
   }
}
