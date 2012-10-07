package ex5_7;

/**
 * Title: Exercise 5.7
 * Description:
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.0 19/01/2004
 */

//Note that the 'public' modifiers here are not required
//Methods in interfaces are automatically abstract and public.
public interface Stack
{
   public void push(Object o);
   // Adds an item to the top of the stack.
   public Object pop();
   // Removes an item from the top of the stack.
   public Object peek();
   // Returns the item on the top of the stack,
   // but does not remove it.
   public boolean isEmpty();
   // Returns true if the stack is empty.
}
