package ex1_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Title:       Grid class
 * Description: Provides a graphical display of the current position of robot
 *              objects, using a different image for each class of object.
 *              It shows any moves in 'slow motion' with a controllable delay
 *              between moves.
 *              At this stage, you are not expected to understand how the
 *              display grid works - it is purely for demonstration.
 *
 *              This class is complete and you should not need to change it
 * Copyright:   Copyright (c) 2004 - 2006
 * Company:     The Open University
 * @author      M257 Course Team
 * @version     1.2 July 2010
 */
public class Grid extends JFrame
{
    private final DrawingPanel drawing;
    // Images for each type of robot
    private final Image variableSpeedRobotImage;
    private final Image standardRobotImage;
    private final Image speedRobotImage;
    private final Image magicRobotImage;
    private final List<RobotDetails> robots;   // details of all robots on the grid
    private int delayTime;      // delay time between each robot move (in 1/10 sec)
    // Constants
    private static final int DEFAULT_DELAY = 5;  // number of tenths of a second between moves
    private static final int TENTHS_OF_A_SECOND = 100; // number of 1/10 sec per millisecond
    private static final int NO_OF_X_SQUARES = 8;
    private static final int NO_OF_Y_SQUARES = 8;
    // Constants for the grid size - set in the constructor to fit the screen size
    private final int GRID_SQUARE_SIZE_Y;
    private final int GRID_SQUARE_SIZE_X;
    private final int GRID_ORIGIN_X;
    private final int GRID_ORIGIN_Y;
    private final int GRID_OVERALL_X_SIZE;
    private final int GRID_OVERALL_Y_SIZE;

    public Grid()
    {
        super("Robot Grid");

        // Set the size of the Grid Squares so the grid fits the screen
        GRID_SQUARE_SIZE_X = getGridSquareSize();
        GRID_SQUARE_SIZE_Y = GRID_SQUARE_SIZE_X;

        // Set overall size and margins of grid window to allow
        // x-margin of 1 square each side of grid
        // and y-margin of 1 square at the bottom only
        GRID_ORIGIN_X = GRID_SQUARE_SIZE_X;
        GRID_ORIGIN_Y = GRID_SQUARE_SIZE_Y * NO_OF_Y_SQUARES;

        GRID_OVERALL_X_SIZE = GRID_SQUARE_SIZE_X * (NO_OF_X_SQUARES + 2);
        GRID_OVERALL_Y_SIZE = GRID_SQUARE_SIZE_Y * (NO_OF_Y_SQUARES + 1);

        drawing = new DrawingPanel();
        getContentPane().add(new JScrollPane(drawing)); // Allow scrolling of grid

        // Load the image for each type of robot
        standardRobotImage = new ImageIcon("images/Robot.jpg").getImage();
        magicRobotImage = new ImageIcon("images/MagicRobot.jpg").getImage();
        speedRobotImage = new ImageIcon("images/SpeedRobot.jpg").getImage();
        variableSpeedRobotImage = new ImageIcon("images/VariableSpeedRobot.jpg").getImage();

        robots = new ArrayList<RobotDetails>();
        setDelayTime(DEFAULT_DELAY);  // Set speed of robot moves
        pack();                       // Set window to right size for grid
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Return appropriate size of Grid Square so the grid will fit the screen
    private int getGridSquareSize()
    {
        // Get current screen size and calculate appropriate grid sizes
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Define grid squares to fit screen with some to spare
        int possibleGridSquareSizeX = screenSize.width / (NO_OF_X_SQUARES + 3);
        int possibleGridSquareSizeY = screenSize.height / (NO_OF_Y_SQUARES + 2);
        // Force grid 'squares' to be actual squares
        // - the rest of the code does not assume this, so can be changed if need be
        int actualGridSquareSize = Math.min(possibleGridSquareSizeX,
                possibleGridSquareSizeY);
        return actualGridSquareSize;
    }

    // Set delay between display of each move
    public void setDelayTime(int delayInTenthsOfSeconds)
    {
        delayTime = delayInTenthsOfSeconds;
    }

    // Display the current state of the robot grid and wait for specified delay
    // This gives a slow motion moving effect
    public void display()
    {
        repaint();    // Display the grid and its contents
        try
        {
            Thread.sleep(delayTime * TENTHS_OF_A_SECOND);
        }
        catch (InterruptedException e)
        {
            System.out.println("problem with sleep");
            System.exit(1);
        }
    }

    // Add a robot object and its name to the list of those on the grid
    // Uses objects of inner class RobotDetails
    public void addRobot(Robot r, String name)
    {
        RobotDetails rd = new RobotDetails(r, name);
        robots.add(rd);
    }

    // Inner class to store various details for display of a robot
    public class RobotDetails
    {
        private Robot robot;       // the basic robot object
        private String robotName;  // the name of the variable which refs the object
        private Image robotImage;  // the image file for displaying the robot

        public RobotDetails(Robot r, String name)
        {
            robot = r;
            robotName = name;
            if (r instanceof MagicRobot)
            {
                robotImage = magicRobotImage;
            }
            else
            {
                if (r instanceof VariableSpeedRobot)
                {
                    robotImage = variableSpeedRobotImage;
                }
                else
                {
                    if (r instanceof SpeedRobot)
                    {
                        robotImage = speedRobotImage;
                    }
                    else
                    {
                        robotImage = standardRobotImage;   // Use Standard robot image
                    }
                }
            }
        }

        public Robot getRobot()
        {
            return robot;
        }

        public String getRobotName()
        {
            return robotName;
        }

        public Image getRobotImage()
        {
            return robotImage;
        }
    } // end of inner class RobotDetails

    // Inner class which draws the panel containing the grid
    public class DrawingPanel extends JPanel
    {
        // Define position of Robot image and title within the grid square
        private static final int ROBOT_TITLE_OFFSET_X = 10;
        private static final int ROBOT_TITLE_OFFSET_Y = 5;
        private static final int ROBOT_IMAGE_OFFSET_X = 5;
        private static final int ROBOT_IMAGE_OFFSET_Y = 15;
        private static final int ROBOT_TITLE_FONT_SIZE = 12;
        private static final int GRID_AXIS_LABEL_FONT_SIZE = 26;
        private final int ROBOT_IMAGE_SIZE_X = GRID_SQUARE_SIZE_X
                - (ROBOT_IMAGE_OFFSET_X * 2);
        private final int ROBOT_IMAGE_SIZE_Y = GRID_SQUARE_SIZE_Y
                - (ROBOT_IMAGE_OFFSET_Y + ROBOT_TITLE_OFFSET_Y);

        public DrawingPanel()
        {
            setBackground(Color.white);
            // Set preferred size to ensure scrolling works - BJQ
            setPreferredSize(new Dimension(GRID_OVERALL_X_SIZE,
                    GRID_OVERALL_Y_SIZE));
        }

        // Draw the lines for the grid and label the x and y axes
        private void drawGridLines(Graphics g, int gridSizeX, int gridSizeY)
        {
            // Horizontal grid lines
            for (int i = 0; i <= gridSizeY; i++)
            {
                g.drawLine(GRID_ORIGIN_X + 0,
                        GRID_ORIGIN_Y - GRID_SQUARE_SIZE_Y * i,
                        GRID_ORIGIN_X + GRID_SQUARE_SIZE_X * gridSizeX,
                        GRID_ORIGIN_Y - GRID_SQUARE_SIZE_Y * i);
            }
            // Vertical grid lines
            for (int j = 0; j <= gridSizeX; j++)
            {
                g.drawLine(GRID_ORIGIN_X + GRID_SQUARE_SIZE_X * j,
                        GRID_ORIGIN_Y - 0,
                        GRID_ORIGIN_X + GRID_SQUARE_SIZE_X * j,
                        GRID_ORIGIN_Y - GRID_SQUARE_SIZE_Y * gridSizeY);
            }

            // Label the y axis
            for (int i = 0; i < gridSizeY; i++)
            {
                g.drawString("" + (i + 1),
                        GRID_ORIGIN_X - GRID_SQUARE_SIZE_X / 4,
                        GRID_ORIGIN_Y - GRID_SQUARE_SIZE_Y * i
                        - GRID_SQUARE_SIZE_Y / 2);
            }
            // Label the x axis
            for (int j = 0; j < gridSizeX; j++)
            {
                g.drawString("" + (j + 1),
                        GRID_ORIGIN_X + GRID_SQUARE_SIZE_X * j + GRID_SQUARE_SIZE_X / 2,
                        GRID_ORIGIN_Y - 0 + GRID_SQUARE_SIZE_Y / 4);
            }
        }

        // This method draws the grid and the robots
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            // Set font for labelling grid axes - BJQ
            g.setFont(
                    new Font("SansSerif", Font.BOLD, GRID_AXIS_LABEL_FONT_SIZE));
            drawGridLines(g, NO_OF_X_SQUARES, NO_OF_Y_SQUARES);

            // Set font for labelling robot images - BJQ
            g.setFont(new Font("SansSerif", Font.BOLD, ROBOT_TITLE_FONT_SIZE));
            for (int i = 0; i < robots.size(); i++)
            {
                RobotDetails rd = robots.get(i);
                Robot r = rd.getRobot();

                // Calculate the coords of the bottom left of the grid square for this robot
                int squareOriginX =
                        GRID_ORIGIN_X + (r.getX() - 1) * GRID_SQUARE_SIZE_X;
                int squareOriginY =
                        GRID_ORIGIN_Y - (r.getY() - 1) * GRID_SQUARE_SIZE_Y;

                boolean invisibleRobot = ((r instanceof MagicRobot) && !(((MagicRobot) r).isVisible()));
                // do not draw image if robot is invisible, but do draw robot name
                if (!invisibleRobot)
                {
                    // Calculate the coordinates of the rectangle bounding the robot image
                    int x1 = squareOriginX + ROBOT_IMAGE_OFFSET_X;
                    int y1 = squareOriginY - ROBOT_IMAGE_OFFSET_Y - ROBOT_IMAGE_SIZE_Y;
                    int x2 = x1 + ROBOT_IMAGE_SIZE_X;
                    int y2 = y1 + ROBOT_IMAGE_SIZE_Y;
                    // Scale the robot image to fit into the bounding rectangle
                    g.drawImage(rd.getRobotImage(), x1, y1, x2, y2, 0, 0,
                            rd.getRobotImage().getWidth(this), rd.getRobotImage().getHeight(
                            this), null);
                }
                // display robot name at bottom of the robot grid square
                g.drawString(rd.getRobotName(),
                        squareOriginX + ROBOT_TITLE_OFFSET_X,
                        squareOriginY - ROBOT_TITLE_OFFSET_Y);

            } // end for

        } // end method
    } // end inner class DrawingPanel
} // end class Grid

