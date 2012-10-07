package ex7_3;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Title: Exercise 7.3 OULogo
 * Specifies a class to represent the OU logo
 * Copyright:   (c) 2004, 2005, 2011
 * Company:     The Open University
 * @author M257 Course Team
 * @version 2.0 20/01/2010
 */
public class OULogo extends JPanel
{
    static final int X = 75;
    static final int Y = 40;
    static final int LOGO_HEIGHT = 40;
    static final int LOGO_WIDTH = 50;
    static final int OFFSET = 5;
    static final int RADIUS = 30;

    public void paintComponent(Graphics g)
    {
        //U outline
        g.drawLine(X, Y + LOGO_HEIGHT, X, Y); //LHS of U
        g.drawLine(X, Y, X + LOGO_WIDTH, Y); //Top of U
        g.drawLine(X + LOGO_WIDTH, Y, X + LOGO_WIDTH, Y + LOGO_HEIGHT); //RHS of U
        g.drawArc(X, Y + LOGO_HEIGHT - LOGO_WIDTH / 2, LOGO_WIDTH, LOGO_WIDTH, 0, - 180); //Bottom of U

        //O outline within the U
        g.drawOval(X + OFFSET, Y + OFFSET, RADIUS, RADIUS);
    }
}
