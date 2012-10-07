package ex8_3;

/**
 * Title: Activity 8_3 FlyingLogoTest
 * Creates two frames with moveable logos against a starry sky,
 * makes the frames visible and sets the logos
 * in motion.
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.1 15/03/2004
 * @based on Ex7_5
 */

public class FlyingLogoTest
{
   public static void main(String[] args)
   {
      FlyingLogo world = new FlyingLogo("Open in space");
      world.setVisible(true);

      FlyingLogo world2 = new FlyingLogo("Open in space again");
      world2.setLocation(500, 100);
      world2.setVisible(true);

      world.squareMove();
      world.figureOfEight();

      world2.squareMove();
      world2.figureOfEight();

   }
}
