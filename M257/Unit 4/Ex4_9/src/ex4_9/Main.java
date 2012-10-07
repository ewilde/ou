package ex4_9;

/**
 * Title: Exercise 4.9
 * Description: Main class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 12/01/2004
 */

import java.io.*;

public class Main
{

   public static void main(String[] args)
   {
      CSVProcessor testInstance = new CSVProcessor();
      try
      {
         testInstance.run("sample3.txt", "sample4.txt");
         System.out.println("Look in the file sample4.txt in folder " + 
            "Unit4\\Ex4_9 to see the result.");
      }
      catch (IOException e)
      {
         System.out.println(e);
      }
      catch (Exception e)
      {
         System.out.println(e);
         System.out.println("Class Tester may still be incomplete.");
      }
   }
}
