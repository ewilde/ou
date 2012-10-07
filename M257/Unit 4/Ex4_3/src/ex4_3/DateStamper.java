package ex4_3;

/**
 * Title: Exercise 4.3
 * Description: Incomplete class.
 * The run(String) method of this class is to write a
 * date-stamp to the file specified by String.  The date-stamp
 * is provided by a static method of class DateStamp
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 10/01/2004
 */

import java.io.*;

public class DateStamper
{
   private PrintWriter pw;

   public void openStreams(String filename) throws IOException
   {
      /* Insert code here to open a PrintWriter (using filename)
      */
   }

   public void run(String filename) throws IOException
   {
      // Open output streams.
      openStreams(filename);

      // Create the date-stamp.
      String stamp = DateStamp.getFullDate();

      // Inform the user what date-stamp will be
      // written to which file.
      System.out.println("File " + filename + " will be date-stamped " + stamp);

      /* Insert code here to write the date-stamp, along
      with an appropriate message, out to filename.*/     


      // Close output streams.
      closeStreams();
   }

   public void closeStreams() 
   {
      pw.close();
   }
}
