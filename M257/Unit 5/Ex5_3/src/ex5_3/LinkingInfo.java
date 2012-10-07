package ex5_3;

/**
 * Title: Exercise 5.3 LinkingInfo - incomplete
 * Description: An instance of LinkingInfo contains the name of a computer
 * on a local network, together with the names of all the computers to
 * which it is linked.  The names of the linked computers are held
 * in an ArrayList.
 *
 * Copyright:   Copyright (c) 2004, 2005, 2010
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.2 July 2010
 */

import java.util.ArrayList;
import java.util.List;

public class LinkingInfo
{

   private String computer;
   private List<String> linkedComputers;

   public LinkingInfo(String computerName, int capacity)
   {
      linkedComputers = new ArrayList<String>(capacity);
      computer = computerName;
   }

   public LinkingInfo(String computerName)
   {
      linkedComputers = new ArrayList<String>();
      computer = computerName;
   }

   public String getComputerName()
   {
      return computer;
   }

   public int getNumberOfLinks()
   {
      return linkedComputers.size();
   }

   public boolean isLinked(String comp1)
   {
      return linkedComputers.contains(comp1);
   }

   public void addComputer(String comp1) throws ComputerErrorException
   {
      // Insert code for method here.
   }

   public void removeComputer(String comp1) throws ComputerErrorException
   {
      // Insert code for method here.
   }

   public void listLinkedComputers()
   // Method to print a list of linked computers.
   {
      System.out.println("Computers linked to node " + 
         this.getComputerName() + ":");

      for (int i = 0; i < this.getNumberOfLinks(); i++)
      {
         System.out.println(linkedComputers.get(i));
      }

      System.out.println("End of list.\n");
   }
}
