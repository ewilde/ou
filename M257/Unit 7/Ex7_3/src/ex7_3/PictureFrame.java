/**
 * Title: Exercise 7.3 PictureFrame
 * Creates a frame to hold a panel on which we will draw the OU logo
 * Copyright:   (c) 2004, 2005, 2011
 * Company:     The Open University
 * @author M257 Course Team
 * @version 2.0 20/01/2011
 */
package ex7_3;

import javax.swing.JFrame;

public class PictureFrame extends JFrame
{
   public PictureFrame(OULogo theLogo)
   {
      setSize(200, 200);
      setLocation(200, 200);
      setTitle("Open");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      add(theLogo);
      
      setVisible(true);
   }
}