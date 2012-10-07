package ex9_2;

/**
 * Title: Activity 9.2 Main
 *
 * Creates an instance of RequestSender and invokes its run method to send
 * a request to an HTTP server.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 16/05/2004
 */

public class Main
{
   public static void main(String[] args)
   {
      RequestSender rs = new RequestSender();
      
      rs.run("www.open.ac.uk", 80, "GET / HTTP/1.0" + "\r\n\r\n" 
         /* The extra characters are required by the HTTP protocol */);
   }
}
