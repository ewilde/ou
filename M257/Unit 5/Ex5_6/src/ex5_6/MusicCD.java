package ex5_6;

/**
 * Title: Exercise 5.6 Concrete class MusicCD
 * Description: Part of a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

public class MusicCD extends MultimediaItem
{

   public MusicCD(String iName, String iCode, int uPrice, int dpc)
   {
      super(iName, iCode, uPrice, dpc);
   }

   public int getUnitPrice()
   {
      return unitPrice - unitPrice * discountPercentage / 100;
   }
}
