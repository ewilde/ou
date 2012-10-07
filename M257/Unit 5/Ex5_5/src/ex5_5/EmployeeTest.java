package ex5_5;

/**
 * Title:        EmployeeTest
 * Description:  A class for testing that the completed Employee class
 *               correctly implements the Comparable interface
 *               You do not need to change this class.
 *               The project will not compile until you have completed the
 *               Employee class appropriately.
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0
 */

import java.util.*;


public class EmployeeTest
{
   public static final int NUMBER_OF_EMPLOYEES = 4;

   public static void main(String[] args)
   {
      // Create and initialise an array of Employee objects
      Employee[] staff = new Employee[NUMBER_OF_EMPLOYEES];
      staff[0] = new Employee("Mary", "2 Grub Street", 25000);
      staff[1] = new Employee("Ahmed", "10 North Street", 35000);
      staff[2] = new Employee("Johann", "15 Acacia Avenue", 20000);
      staff[3] = new Employee("Zena", "75 The Hill", 25000);

      // Check that the compareTo method returns appropriate values
      // Note that the value returned need not be -1, 0, +1.
      for (int i = 0; i < NUMBER_OF_EMPLOYEES - 1; i++)
      {
         for (int j = i + 1; j < NUMBER_OF_EMPLOYEES; j++)
         {
            System.out.println(staff[i] + "\t compared to  " + staff[j] +
               "  returns " + staff[i].compareTo(staff[j]));
         }
      }


      // Now use the static method sort from the Arrays class to sort the
      // array into the order determined by the compareTo method
      // The Arrays class requires that the array elements implement the
      // Comparable interface (which Employee does)
      System.out.println();
      System.out.println("Before sorting, staff list is:");
      for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++)
      {
         System.out.println(staff[i]);
      }

      Arrays.sort(staff);

      // The sorted order here depends on which version of the compareTo
      // method has been implemented - either by salary or by name
      System.out.println();
      System.out.println("After sorting, staff list is:");
      for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++)
      {
         System.out.println(staff[i]);
      }

   }
}
