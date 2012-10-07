package ex4_9;

/**
 * Title: Exercise 4.9
 * Description: The run() method of this class reads a
 * comma-delimited (csv) source file, line by line.  It extracts
 * the contents of each field into an array, which is then
 * used to assemble an appropriate output string which
 * represents a name and address in a format
 * suitable for addressing an envelope:
 *
 * <title> <initials(s)> <surname>
 * <address line 1>
 * <address line 2>
 * <address line 3>
 * <postcode>
 *
 * Once constructed, each such address is written out
 * to a destination file.
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.1 27/05/2005
 */

import java.io.*;
import java.util.StringTokenizer;

public class CSVProcessor
{
   // Declare variables for input streams...
   private FileReader fr;
   private BufferedReader br;

   // ...and output streams.
   private FileWriter fw;
   private PrintWriter pw;

   // The c.s.v. fields currently in use are:
   // PI,Surname,Forenames,Initials,Title,
   // Addr1,Addr2,Addr3,Postcode
   private int numberOfFields = 9;

   public void run(String source, String destination) throws IOException
   {
      // Open IO streams.
      openStreams(source, destination);

      // Line to be read from the source file.
      String inString;

      // Array to hold tokens extracted from input line.
      String[] fieldContents = new String[numberOfFields];

      // Line to be written to the destination file.
      String outString;

      StringTokenizer st;

      inString = br.readLine();

      // First we read the source line by line.
      while (inString != null)
      {
         /* 1. Insert code here to create a StringTokeniser.*/

         // This is an index which will step through the array.
         int i = 0;

         // Then we use the StringTokeniser to extract the tokens
         // one by one into the array fieldContents.

         /* 2. Insert a suitable while statement here.*/
         {
            /* 3. Insert a statement here which will extract a token
             *  into the correct array location.
             */

            // Increment the index as we go.
            i++;
         }
         // Then we build the address up from the tokens held in the array.

         /*  4. Insert code here which will assemble the correctly
          *  formatted address as a string for output, e.g.
          *
          *  Mrs O Black
          *  13 Seaside Street
          *  Bigtown
          *  Barset
          *  BT1 1AA
          */


         // Next we send the address to the output file.

         /* 5. Insert code here which will write the output
          *  string to the destination file.
          */

         // Finally we proceed to the next line of input.
         inString = br.readLine();
      }

      // Close IO streams.
      closeStreams();
   }

   public void openStreams(String input, String output) throws IOException
   {
      // Open input streams...
      fr = new FileReader(input);
      br = new BufferedReader(fr);
      // ...and output streams.
      fw = new FileWriter(output);
      pw = new PrintWriter(fw);
   }

   public void closeStreams() throws IOException
   {
      // Close input streams...
      fr.close();
      br.close();
      // ... and output streams.
      fw.close();
      pw.close();
   }
}
