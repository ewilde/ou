package ex5_6;

/**
 * Title: Exercise 5.6 Abstract class MultimediaItem
 * Description: Part of a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

public abstract class MultimediaItem extends Item
{

   protected int discountPercentage;
   // There is usually discount on multimedia items!

   public MultimediaItem(String iName, String iCode, int uPrice, int dpc)
   {
      itemName = iName;
      itemCode = iCode;
      unitPrice = uPrice;
      discountPercentage = dpc;
   }
   // An abstract class can define a constructor(s).  Of course
   // this cannot be used to intialise an instance of the abstract
   // class itself, since no such instance can exist.  However the
   // constructor(s) can be invoked from the constructor(s) of
   // concrete subclasses, which may be useful if it avoids the
   // subclass constructors having to duplicate code.

}
