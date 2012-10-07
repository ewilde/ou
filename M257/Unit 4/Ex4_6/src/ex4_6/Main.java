package ex4_6;

/**
 * Title: Exercise 4.6
 * Description: Main class - tests the Read_a_Sonnet class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 9/01/2004
 *
 * You should not need to change this class
 *
 */

import java.io.*;

public class Main
{

   public static void main(String[] args)
   {
      try
      {
         Read_a_Sonnet ras = new Read_a_Sonnet();
         ras.run();
      }
      // Report any IOExceptions which occur
      catch (IOException IOEx)
      {
         System.out.println("Problems reading file " + IOEx);
      }
   }
}
