package ex2_9;

/**
 * Title: Exercise 2_9 Class ComputerCollection
 * Description: An instance of ComputerCollection contains a
 * collection of the names on computers connected to a network.
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 4/12/2003
 */

public class ComputerCollection
{
   private int      numConnected;    //Number of currently stored computers.
   private String[] computers;       //Collection of computers.
   private int      numOfRemovals;   //number of times removal has occurred
   
   /* YOU CAN IGNORE THIS SECTION FOR NOW */
   
   // Code to initialize the instance variables.
   public ComputerCollection()
   {
      computers = new String[10];   //Space for 10 computers.
      numConnected = 0;                 //Initially, zero computers are connected.
      numOfRemovals = 0;                 //initially, no removals have happened
   }
   
   /* END OF SECTION TO BE IGNORED */
   public int getNumConnected()
   {
      return numConnected;
   }

   public int getNumOfRemovals()
   {
       return this.numOfRemovals;
   }

   public void addComputer(String addedComputer)
   {
      computers[numConnected] = addedComputer;
      
      numConnected++;
   }
   
   //this method returns the index of a computer if it is found,
   //or -1 if the computer is not found in the network
   public int indexOf(String wantedComputer)
   {
      boolean found = false;
      int     i     = 0;
      
      while ( !found && (i < numConnected))
      {
         found = wantedComputer.equals(computers[i]);
         
         i++;
      }
      
      if (found)
      {
         // i was incremented after the find
         return i - 1;
      }
      else
      {
         return -1;
      }
   }
   
   // 1. complete this method, making use of the indexOf method.
   // The method returns true if the wantedComputer is in the network
   // or false otherwise
   public boolean isInNetwork(String wantedComputer)
   {
      return this.indexOf(wantedComputer) > -1;
   }
   
   //This method removes a computer from the collection
   public void removeComputer(String unwantedComputer)
   {
      // find the index of the computer
      int i = indexOf(unwantedComputer);
      
      // if it is not -1, the computer was found
      if (i > -1)
      {
         /* Move the computers after this one to the left by one.
            The body of this loop is not executed if the computer
            is last in the collection */
         for (int j = i; j < numConnected - 1; j++)
         {
            computers[j] = computers[j + 1];
         }
         
         numConnected--;
         
         //2. Add a statement here to keep track of the number of removals
         // in the variable numOfRemovals
         numOfRemovals ++;
      }
   }
   
   //3. Complete the method getNumOfRemovals() here, which returns the
   // value of the numOfRemovals variable.
}
