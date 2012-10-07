package ex4_3;

/**
 * Title: Exercise 4.3
 * Description: Main class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 10/01/2004
 */


import java.io.*;

public class Main
{

   public static void main(String[] args) throws IOException
   {
      DateStamper stamper = new DateStamper();
      stamper.run("sample2.txt");
   }
}
