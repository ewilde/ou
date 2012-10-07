package ex5_6;

/**
 * Title: Exercise 5.6 Abstract class Item
 * Description: The top level of a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

public abstract class Item
{

   String itemName;
   String itemCode;
   int unitPrice;
   // unitPrice cannot be private, because it must accessible to
   // subclasses which may implement getUnitPrice() in varying ways.
   // Here all the data fields are given the default access level.

   public String getItemName()
   {
      return itemName;
   }

   public String getItemCode()
   {
      return itemCode;
   }

   public void setItemName(String name)
   {
      itemName = name;
   }

   public void setItemCode(String code)
   {
      itemCode = code;
   }

   public abstract int getUnitPrice();
}
