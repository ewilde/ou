package ex4_5;

/**
 * Title: Exercise 4.5
 * Description: Read_a_Sonnet
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 10/01/2004
 *
 * The run() method of this class will read lines
 * of a sonnet (a 14-line poem) from a text file and print them out one by one,
 * stopping when the end of file is encountered.
 *
 * You are to modify the method readLines so that it throws an
 * exception of type EOFException if the file does not contain at
 * least 14 lines.
 *
 * Modify the run method so that it catches and reports this EOFexception.
 * You should also add a finally clause to the run method, to ensure that
 * the file is closed after use, whether or not an exception occurs.
 */

import java.io.*;

public class Read_a_Sonnet
{
   private FileReader fr;
   private BufferedReader br;
   final static int LINES_IN_SONNET = 14;


   public void run() throws IOException
   {
      openFile("sonnet1.txt");
      // embed the call to readLines in a try-catch statement
      readLines(LINES_IN_SONNET);

      // catch and report any EOFException here

      closeFile();
   }


   // open the specified file
   private void openFile(String fileName) throws IOException
   {
      fr = new FileReader(fileName);
      br = new BufferedReader(fr);
      System.out.println("== File " + fileName + " opened OK"); // just for testing
   }


   // read and display the specified number of lines from text file
   // modify this method so that it throws an EOFException
   // if the file has less lines than required
   private void readLines(int numberOfLines) throws IOException, EOFException
   {
      String nextLine = br.readLine();
      while (nextLine != null)
      {
         System.out.println(nextLine);
         nextLine = br.readLine();
      }

   }

   // close the text file
   private void closeFile() throws IOException
   {
      br.close();
      fr.close();
      System.out.println("== File closed OK"); // just for testing
   }

}
