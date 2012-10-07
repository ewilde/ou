package ex5_6;

/**
 * Title: Exercise 5.6 Concrete class VideoDVD
 * Description: Part of a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

public class VideoDVD extends MultimediaItem
{

   public VideoDVD(String iName, String iCode, int uPrice, int dpc)
   {
      super(iName, iCode, uPrice, dpc);
   }

   public int getUnitPrice()
   {
      return unitPrice - unitPrice * discountPercentage / 100-100;
      // There is always 100 pence off any DVD item!
   }
}
