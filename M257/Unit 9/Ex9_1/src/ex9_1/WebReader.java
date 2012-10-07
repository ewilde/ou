package ex9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Title: Activity 9.1 WebReader
 * Description: A Reader to connect to a webpage, and read
 * and display its contents.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0   1/10/2004
 */

public class WebReader
{
   private BufferedReader fromWebSite;
   private String webAddress;

   public WebReader(String address)
   {
      webAddress = address;
      try
      {
         System.out.println("Trying to contact " + webAddress);
         URL selectedURL = new URL(webAddress);
         fromWebSite = new BufferedReader(new InputStreamReader
            (selectedURL.openStream()));
      }
      catch (MalformedURLException me)
      {
         System.out.println("Malformed URL found " + me);
      }
      catch (IOException io)
      {
         System.out.println("Problems connecting " + io);
      }
   }

   /* Read and display source contents of web page.
   Uses BufferedReader fromWebSite, set up by constructor. */
   public void print()
   {
      String lineRead;
      System.out.println("--- URL: " + webAddress);
      try
      {
         // read from web site, one line at a time
         lineRead = fromWebSite.readLine();
         while (lineRead != null)
         {
            System.out.println(lineRead);
            lineRead = fromWebSite.readLine();
         }
         fromWebSite.close();
      }
      catch (IOException io)
      {
         System.out.println("Problems reading " + io);
      }
      System.out.println("--- End of URL: " + webAddress);
   }

}
