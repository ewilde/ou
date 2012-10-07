package ex6_4;

/**
 * Title: Exercise 6.4 SwingClass
 * Description: A base class to which we will
 * sucessively add a range of Swing components.
 *
 * Copyright:   (c) 2003, 2005
 * Company:     The Open University
 *
 * @author M257 Course Team
 * @version 1.0 19/12/2003
 */

import java.awt.*;
import javax.swing.*;

class SwingClass extends JFrame
{
   protected JPanel topPanel, botPanel;

   public SwingClass()
   {
      setSize(400, 400);
      setTitle("User Interface");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Added so the program will exit when the
      // window is closed.

      topPanel = new JPanel();
      botPanel = new JPanel();

      // Add the panels to the frame
      // Note that although you can do this
      //using getContentPane(), it is
      //no longer necessary to do so -
      //the content pane will be accessed automatically.
      
      add(topPanel, BorderLayout.NORTH);
      add(botPanel, BorderLayout.SOUTH);
   }
}
