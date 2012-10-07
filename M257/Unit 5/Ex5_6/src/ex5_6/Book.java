package ex5_6;

/**
 * Title: Exercise 5.6 Concrete class Book
 * Description: Part of a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

public class Book extends PrintedItem
{

   private String isbn;

   public Book(String iName, String iCode, int uPrice, String bookNumber)
   {
      super(iName, iCode, uPrice);
      isbn = bookNumber;
   }

   public String getIsbn()
   {
      return isbn;
   }
}
