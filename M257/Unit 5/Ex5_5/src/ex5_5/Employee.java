package ex5_5;

/**
 * Title:        Employee
 * Description:  A class holding personnel details for an employee.
 *               The class needs to be completed to implement the Comparable
 *               interface, following the instructions for Activity 5.5
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0
 */

public class Employee
{
   // Modify the class header appropriately

   private String name;
   private String address;
   private int salary;

   public Employee(String aName, String anAddress, int aSalary)
   {
      name = aName;
      address = anAddress;
      salary = aSalary;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String aName)
   {
      name = aName;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress(String anAddress)
   {
      address = anAddress;
   }

   public int getSalary()
   {
      return salary;
   }

   public void setSalary(int aSalary)
   {
      salary = aSalary;
   }

   public String toString()
   {
      return (name + ":" + address + ":" + salary);
   }

   public int compareTo(Object obj)
   {
      // Add your implementation code here
   }

}
