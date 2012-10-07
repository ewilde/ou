package ex7_5;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Title: Exercise 7.5 Logo
 * A class which represents a moveable OU logo
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 2.0 14/03/2004
 */

public class Logo
{

   private int xCoor;
   private int yCoor;

   private double scale;

   private static final int HEIGHT = 40;
   private static final int WIDTH = 50;

   private static final int OFFSET = 5;
   private static final int RADIUS = 30;

   public Logo() // Zero-argument constructor.
   {
      scale = 0.25; // Sets default value which is 1/4 scale.
   }

   public void goToPosition(int x, int y)
   {
      xCoor = x;
      yCoor = y;
   }

   public void setScale(double s)
   {
      scale = s;
   }

   private void move(int xChange, int yChange)
   {
      goToPosition(xCoor + xChange, yCoor + yChange);
   }

   public void right()
   {
      move(1, 0);
   }

   public void left()
   {
      move(-1, 0);
   }

   public void up()
   {
      move(0, -1);
   }

   public void down()
   {
      move(0, 1);
   }

   public void paint(Graphics g)
   {
      // Calculate the scaled dimensions.
      int height = (int)(HEIGHT * scale);
      int width = (int)(WIDTH * scale);
      int offset = (int)(OFFSET * scale);
      int radius = (int)(RADIUS * scale);

      // Draw the logo.
      g.setColor(Color.blue);
      g.fillArc(xCoor, yCoor + height - width / 2, width, width, 0, -180);
      g.fillRect(xCoor, yCoor, width, height);
      g.setColor(Color.yellow);
      g.fillOval(xCoor + offset, yCoor + offset, radius, radius);
   }
}
