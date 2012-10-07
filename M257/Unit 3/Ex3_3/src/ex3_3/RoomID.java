package ex3_3;

/**
 * Title: Exercise 3.3 Class RoomID - the toString(Object obj)
 * method inherited from Object is to be overridden
 *
 * Description: Models room ids consisting of the name of
 * a residential block and the number of the room within that block
 *
 * Copyright:    Copyright (c) 2003, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.0 16/12/2003
 */

public class RoomID
{
   private String blockName;
   private int    roomNumber;

   public RoomID(String block, int number)
   {
      blockName  = block;
      roomNumber = number;
   }

   public String getBlockName()
   {
      return blockName;
   }

   public int getRoomNumber()
   {
      return roomNumber;
   }

   public boolean equals(Object obj)
   {
      RoomID id = (RoomID)obj;

      return (blockName.equals(id.getBlockName()) &&
         roomNumber == id.getRoomNumber());
   }

   // Insert code for the toString() method here.
}
