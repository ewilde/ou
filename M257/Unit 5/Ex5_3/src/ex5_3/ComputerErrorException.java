package ex5_3;

/**
 * Title: Exercise 5.2 ComputerErrorException
 * Description: A user-defined exception class
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 13/01/2004
 */

public class ComputerErrorException extends Exception
{

   public ComputerErrorException()
   {
   }

   public ComputerErrorException(String message)
   {
      super(message);
   }
}
