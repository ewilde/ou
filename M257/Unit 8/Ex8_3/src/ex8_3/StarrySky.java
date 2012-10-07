package ex8_3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Title: Activity 8.3 StarrySky
 * A dark sky, an array of stars and a method to paint them.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 06/03/2004
 */

public class StarrySky extends JPanel
{
   // How many stars?
   private int numberOfStars;

   // How big's the sky?
   private int width;
   private int height;

   // Arrays to hold location and brightness of stars.
   private int[] starsX;
   private int[] starsY;
   private int[] starsMagnitude;

   public StarrySky(int nofstar, int w, int h)
   {
      numberOfStars = nofstar;

      // Find dimensions of panel.
      width = w;
      height = h;
      // Populate arrays with random stars.
      starsX = new int[numberOfStars];
      starsY = new int[numberOfStars];
      starsMagnitude = new int[numberOfStars];

      for (int i = 0; i < numberOfStars; i++)
      {
         starsX[i] = (int)(Math.random() * width);
         starsY[i] = (int)(Math.random() * height);
         starsMagnitude[i] = (int)(Math.random() * 4);
      }
   }

   // Paint the stars!
   public void paint(Graphics g)
   {
      // Background sky is black.
      g.setColor(Color.black);
      g.fillRect(0, 0, width, height);

      // Now add the stars.
      g.setColor(Color.white);

      for (int i = 0; i < numberOfStars; i++)
      {
         g.fillOval(starsX[i], starsY[i], starsMagnitude[i], starsMagnitude[i]);
      }
   }
}
