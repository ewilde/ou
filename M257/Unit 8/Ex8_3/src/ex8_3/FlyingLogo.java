package ex8_3;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Title: Activity 8_3 FlyingLogo
 * A frame which has a moving logo object, set against
 * a starry background.
 *
 * This frame is located at (100,100).
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 05/03/2004
 * @based on Ex7_5
 */

public class FlyingLogo extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 400;
   private static int delayTime = 5;
   private Logo logo;
   private StarrySky starrySky = new StarrySky(200, FRAME_WIDTH, FRAME_HEIGHT);

   public FlyingLogo(String title)
   {
      super(title);
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setLocation(100, 100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add the logo...
      logo = new Logo();
      logo.goToPosition(100, 100);

      // ...and the starry background.      
      add(starrySky);
   }

   public void paint(Graphics g)
   {
      super.paint(g);
      logo.paint(g);
   }

   public void squareMove()
   {
      // First leg.
      for (int i = 0; i < 200; i++)
      {
         logo.right();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
      // Second leg.
      for (int i = 0; i < 200; i++)
      {
         logo.down();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
      // Third leg.
      for (int i = 0; i < 200; i++)
      {
         logo.left();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
      // Fourth and final leg.
      for (int i = 0; i < 200; i++)
      {
         logo.up();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
   }
   public void downRight()
   {
      for (int i = 0; i < 50; i++)
      {
         logo.down();
         logo.right();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
   }
   public void downLeft()
   {
      for (int i = 0; i < 50; i++)
      {
         logo.down();
         logo.left();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
   }
   public void upRight()
   {
      for (int i = 0; i < 50; i++)
      {
         logo.up();
         logo.right();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
   }
   public void upLeft()
   {
      for (int i = 0; i < 50; i++)
      {
         logo.up();
         logo.left();
         repaint();
         try
         {
            Thread.sleep(delayTime);
         }
         catch (Exception e)
         {
            System.exit(0);
         }
      }
   }
   public void figureOfEight()
   {
      downRight();
      downLeft();
      downLeft();
      downRight();
      upRight();
      upLeft();
      upLeft();
      upRight();
   }
}
