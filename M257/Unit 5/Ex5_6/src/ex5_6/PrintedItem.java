package ex5_6;

/**
 * Title: Exercise 5.6 Concrete class PrintedItem
 * Description: Part of a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

public class PrintedItem extends Item
{

   public PrintedItem(String iName, String iCode, int uPrice)
   {
      itemName = iName;
      itemCode = iCode;
      unitPrice = uPrice;
   }

   public int getUnitPrice()
   {
      return unitPrice;
   }
}
