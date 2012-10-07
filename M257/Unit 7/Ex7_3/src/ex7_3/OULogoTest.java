package ex7_3;

/**
 * Title: Exercise 7.3 OULogoTest
 * Creates an instance of the PictureFrame and makes it visible
 * Copyright:   (c) 2004, 2005, 2011
 * Company:     The Open University
 * @author M257 Course Team
 * @version 2.0 20/01/2011
 */

public class OULogoTest
{
   public static void main(String[] args)
   {
       OULogo logo = new OULogo();
       logo.setOpaque(true); //may be needed on some platforms
       
       new PictureFrame(logo);
   }
}
