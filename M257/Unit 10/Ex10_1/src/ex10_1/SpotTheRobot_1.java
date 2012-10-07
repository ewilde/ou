package ex10_1;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;


/*
 * SpotTheRobot_1.java
 *
 * Created on 03 September 2007, 15:39
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */
public class SpotTheRobot_1 extends Applet
{
    private Image magicRobotImage;
    private static final int WINDOW_X_SIZE = 800;
    private static final int WINDOW_Y_SIZE = 600;
    private Font messageFont;
    private Random random;
    private int mouseXPosition;
    private int mouseYPosition;
    private int robotWidth;
    private int robotHeight;
    private boolean starting;

    // initialize the applet
    public void init()
    {
        URL imageLoc;

        // Load the magic robot image.
        // Assumes that the image is stored in a subfolder 'images'
        // within the Source packages folder src.

        System.out.println("codebase " + getCodeBase());

        try
        {
            imageLoc = new URL(getCodeBase() + "images/MagicRobot.jpg");

            // This method ensures that all pixels have been loaded before returning
            magicRobotImage = new ImageIcon(imageLoc).getImage();
        }
        catch (Exception e)
        {
            System.out.println("bad url " + e);
        }

        robotWidth = magicRobotImage.getWidth(this);
        robotHeight = magicRobotImage.getHeight(this);

        System.out.println("magic " + robotWidth + " " + robotHeight);

        resize(WINDOW_X_SIZE, WINDOW_Y_SIZE);
        messageFont = new Font("Sanserif", Font.BOLD, 16);
        random = new Random();

        this.addMouseListener(new MouseTrap());
        mouseXPosition = 0;
        mouseYPosition = 0;

    } //end init

    public void start()
    {
        starting = true; // indicates starting or re-starting
    }

    public void paint(Graphics g)
    {
        int robotXPosition, robotYPosition;

        super.paint(g);
        g.setFont(messageFont);
        g.drawString("Click where you think the magic robot will appear next",
                20, 40);

        // Just display opening message first time
        if (starting)
        {
            starting = false;
        }
        else  // not the first time, so display robot and mouse click
        {
            // Choose a random position for the robot
            robotXPosition = random.nextInt(WINDOW_X_SIZE - robotWidth);
            robotYPosition = random.nextInt(WINDOW_Y_SIZE - robotHeight);

            // Display the robot
            g.drawImage(magicRobotImage, robotXPosition, robotYPosition, null);

            // Show where the mouse was when last clicked
            g.drawString("X", mouseXPosition, mouseYPosition);

            // Check whether the user clicked in the right place
            Rectangle imageRectangle = new Rectangle(robotXPosition,
                    robotYPosition, robotWidth, robotHeight);
            if (imageRectangle.contains(mouseXPosition, mouseYPosition))
            {
                g.drawString("Well done, you found the magic robot!", 20, 80);
                starting = true;
            }
            else
            {
                g.drawString("Bad luck, you missed...  Try again", 20, 60);
            }
        }
    } //end paint

    // inner class - keeps track of position of mouse clicks
    class MouseTrap extends MouseAdapter
    {
        // record position of mouse click and redraw the applet
        public void mouseClicked(MouseEvent e)
        {
            mouseXPosition = e.getX();
            mouseYPosition = e.getY();
            repaint(); // invokes the applet paint method
        }
    } // end MouseTrap
}
