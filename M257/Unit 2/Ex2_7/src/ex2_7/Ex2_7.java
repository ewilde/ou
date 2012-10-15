package ex2_7;

/**
 * Title: Exercise 2.7 Application - incomplete
 * Description: Plotting a bar graph using print statements
 * controlled by for loops
 *
 * The data comes from Horstmann, C. and Cornell, G.(2003),
 * Core Java 2, Sun Microsystems Press
 *
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 7/01/2004
 */

class Ex2_7
{
   //This method is used by plotGraph (below) to print out the correct
   //number of hash marks (#) for the version number passed as an argument
   public void printHashMarks(int version)
   {
      // The numbers of classes in versions
      // 1.0, 1.1, 1.2, 1.3 and 1.4 of Java, in units of 100
      int[] classes = { 2, 5, 18, 21, 30 };

      /* 1. Write a for-loop here that will print the number
         of hash marks (#) indicated by the values in the classes array
         For example, when version = 0, the loop prints two
         hash marks. Then print a newline character
       */
      
          for (int j = 0; j < classes[version]; j++)
          {
              System.out.print('#');
          }

          System.out.println();            
   }

   //This is the method a user calls to plot the graph
   public void plotGraph()
   {
      // Labels for successive versions of the Java Standard Edition API.
      String[] labels = { "1.0", "1.1", "1.2", "1.3", "1.4" };

      // A legend for the horizontal graph axis.
      String legend = "Hundreds of classes in successive versions of Java";

      // Print a blank line, to give some space above the graph
      System.out.println();

      // Control variable i steps through the successive
      // versions of Java as stored in the labels array
      // Here 0 means version 1.0, 1 means version 1.1 and so on
      // 2. You need to insert an appropriate condition in the for loop,
      // replacing the incorrect condition, i < 1
      for (int i = 0; i < labels.length; i++)
      {
         //First we print the label and axis.
         //We use a tab character \t before the axis |
         //so that we can align the axis marks
         //Notice that we do not start a new line in the statement below
         //so that any further printout comes to the right of the |
         System.out.print(labels[i] + "\t|");

         // Next we draw the corresponding bar, built from # characters.
         // Control variable i arranges for the right number of #'s to be printed.
         // You will need to complete the code for the method printHashMarks, above
         printHashMarks(i);

         //After each bar is plotted we draw another piece of axis
         System.out.println("   \t|");
      }

      //When all the bars are printed, we plot the horizontal axis.
      System.out.println(
         "   \t|----|----|----|----|----|----|----|----|----|----|");

      //Finally we print the legend.
      System.out.println("   \t" + legend);
   }
}