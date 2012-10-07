package ex7_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Title: Exercise 7.6 ColourPanel
 * A panel whose colour can be set by supplying
 * Red, Green and Blue components
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 23/02/2004
 */


public class ColourPanel extends JPanel
{
   private Color currColour;

   public Color getColour()
   {
      return currColour;
   }

   public void changeColour(int r, int g, int b)
   {
      currColour = new Color(r, g, b);
   }

   public void paintComponent(Graphics g)
   {
      Dimension d = getSize();
      g.setColor(currColour);
      g.fillRect(0, 0, d.width, d.height);
   }

   public ColourPanel()
   {
      currColour = new Color(0, 0, 0);
   }
}
