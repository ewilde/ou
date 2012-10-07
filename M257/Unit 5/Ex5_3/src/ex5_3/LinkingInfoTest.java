package ex5_3;

/**
 * Title: Exercise 5.3 Main class
 * Description:
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 13/01/2004
 */

public class LinkingInfoTest
{
   public static void main(String[] args)
   {
      // Creating a node.
      LinkingInfo node = new LinkingInfo("Dandelion");

      try
      {
         // Adding three linked computers.
         System.out.println("Test 1: Add three linked computers.");
         node.addComputer("Marigold");
         node.addComputer("Bluebell");
         node.addComputer("Hyacinth");
      }
      catch (ComputerErrorException e)
      {
         System.out.println(e.getMessage());
      }
      // Checking the list.
      node.listLinkedComputers();

      try
      {
         // Removing an item.
         System.out.println("Test 2: Remove Bluebell.");
         node.removeComputer("Bluebell");
      }
      catch (ComputerErrorException e)
      {
         System.out.println(e.getMessage());
      }
      // Checking the list.
      node.listLinkedComputers();

      try
      {
         // Now try duplicating an element.
         System.out.println("Test 3: Attempt to duplicate an item.");
         node.addComputer("Marigold");
      }
      catch (ComputerErrorException e)
      {
         System.out.println(e.getMessage());
      }
      // Checking the list.
      node.listLinkedComputers();

      try
      {
         // Now try removing an element that is not present.
         System.out.println(
            "Test 4: Attempt to remove an item that is not present.");
         node.removeComputer("Peony");
      }
      catch (ComputerErrorException e)
      {
         System.out.println(e.getMessage());
      }
      // Checking the list.
      node.listLinkedComputers();

   }
}
