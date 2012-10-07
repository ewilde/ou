package ex9_1;

/**
 * Title: Activity 9.1 TestWebReader
 * Description: Class to create a webreader which will connect to
 * the open unviersity webpage.
 * 
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0   1/10/2004
 */


public class TestWebReader
{
   public static void main(String[] args)
   {
      WebReader wr = new WebReader("http://www.open.ac.uk");
      wr.print();
   }
}
