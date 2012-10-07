package ex4_6;

/**
 * Title: Exercise 4.6
 * Description: Read_a_Sonnet
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 10/01/2004
 *
 * The run() method of this class will attempt to read a sonnet
 * (a 14-line poem) from a text file and print out each line in turn
 *
 * The method readLines currently throws an exception of type EOFException
 * if the file does not contain at least 14 lines.
 *
 * Modify the readLines and run methods so that they use the user-defined
 * exception FileFormatException instead of EOFexception.
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

      try
      {
         readLines(LINES_IN_SONNET);
      }
      catch (EOFException ex)
      {
         System.out.println("Wrong number of lines in poem. " + ex);
      }
      finally
      {
         closeFile();
      }
   }


   // open the specified file
   private void openFile(String fileName) throws IOException
   {
      fr = new FileReader(fileName);
      br = new BufferedReader(fr);
      System.out.println("== File " + fileName + " opened OK"); // just for testing
   }


   // read and display the specified number of lines from text file
   // modify this method so that it throws a FileFormatException rather
   // than EOFException, if the file has less lines than required
   private void readLines(int numberOfLines) throws IOException, EOFException 
   // Note: not strictly necessary to list EOFException here.
   // But we do need to list FileFormatException separately.
   {
      String nextLine;
      int lineCount;

      nextLine = br.readLine();

      lineCount = 0;
      while (nextLine != null && lineCount < numberOfLines)
      {
         lineCount++;
         System.out.println(nextLine);
         nextLine = br.readLine();
      }

      if (lineCount < numberOfLines)
      {
         throw new EOFException("read " + lineCount + " lines");
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
