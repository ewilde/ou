package ex5_6;

/**
 * Title: Exercise 5.6 Main class
 * Description: Tests a class hierarchy
 * representing e-commerce articles
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 20/01/2003
 */

import java.util.*;

public class TestClass
{

   public static void main(String[] args)
   {

      // Create a Bill.
      Bill myBill = new Bill();

      // Create some items.
      Item item1 = new Book("Krakatoa", "p042", 599, "0-335-10043-0");
      Item item2 = new PrintedItem("Beside the C side", "15jq9", 599);
      Item item3 = new MusicCD("Inkspots favorites", "w12x3", 599, 5);
      Item item4 = new VideoDVD("The Java story 2", "p104x", 599, 20);
      Item item5 = new Book("Algol and I", "z090", 1599, "0-199-17730-X");

      // Add them to the bill.
      myBill.addItem(item1);
      myBill.addItem(item2);
      myBill.addItem(item3);
      myBill.addItem(item4);
      myBill.addItem(item5);

      // Whoops! Changed my mind.
      myBill.removeItem(item5);

      // Print my bill for me!
      myBill.printBill();
   }
}
