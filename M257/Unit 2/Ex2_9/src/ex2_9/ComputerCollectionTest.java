package ex2_9;

/**
 * Title: Exercise 2.9 Class CollectionTest.
 * Description: This class contains the main() method.  Its purpose is
 * to test the implementation of the ComputerCollection class.
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 4/12/2003
 */

public class ComputerCollectionTest
{
   public static void main(String[] args)
   {
      ComputerCollection cc = new ComputerCollection();
      
      cc.addComputer("ZX81");
      cc.addComputer("3600A");
      cc.addComputer("3600B");
      
      //expect three computers connected
      System.out.print("There are " + cc.getNumConnected());
      System.out.println(" computers currently registered.");
      
      //expect this computer to be in the network
      if (cc.isInNetwork("3600B"))
      {
         System.out.println("The computer 3600B is registered.");
      }
      
      cc.removeComputer("3600B");
      
      //expect 3600B to be not registered anymore
      if (!cc.isInNetwork("3600B"))
      {
         System.out.println("The computer 3600B is now not registered.");
      }
      
      //expect one removal to have been counted
      System.out.println("There have been " + cc.getNumOfRemovals() + 
         " removals.");
      
      //expect ZX81 to be in the network (true)
      System.out.println("ZX81 is in the network is " +
         cc.isInNetwork("ZX81"));
   }
}
