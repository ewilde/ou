package ex7_7;

/**
 * Title: Exercise 7.7 FrameletControl - partial implementation
 * A control panel to create Framelets in one of a range
 * of attractive pastel colours.
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 11/03/2004
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrameletControl extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 120;

   private static final int DEFAULT_LOCATION_X = 600;
   private static final int DEFAULT_LOCATION_Y = 400;

   private static final int NUMBER_OF_COLOURS = 6;

   /* (A) Add a class variable to keep count of Framelet instances created. */

   /****************  INSERT A LINE OF CODE HERE  ***************/

   private Color currentColour;

   private static final String [] COLOUR_NAMES =
      { "pink", "green", "blue", "yellow", "mauve", "steel" };

   /* (B) Supply the corresponding RGB colours you noted from Exercise 7.6. */
   private static final Color [] COLOURS =
   {
      /****************  INSERT COLOURS HERE  ***************/
   };

   private JButton newFrameletButton;
   private JButton exitProgramButton;

   private JLabel colourSwatchLabel;
   private JPanel colourSwatchPanel;

   private JMenuBar menuBar;
   private JMenu colourMenu;
   private JMenuItem [] colourItems = new JMenuItem[NUMBER_OF_COLOURS];

   // This is the constructor.
   public FrameletControl()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setLocation(DEFAULT_LOCATION_X, DEFAULT_LOCATION_Y);
      setTitle("Framelet control panel");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Get the content pane and set the layout.
      Container contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());

      // Set a default colour.
      currentColour = COLOURS[0];

      colourSwatchLabel = new JLabel("Current colour");
      colourSwatchPanel = new JPanel();
      colourSwatchPanel.setBackground(currentColour);

      newFrameletButton = new JButton("Create new Framelet");
      newFrameletButton.addActionListener(new NewFrameletButtonListener());

      exitProgramButton = new JButton("Exit program");
      exitProgramButton.addActionListener(new ExitProgramButtonListener());

      menuBar = new JMenuBar();
      colourMenu = new JMenu("Colours");

      // Set the icon image on the title bar.
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("notelet.GIF");
      setIconImage(image);

      /* (C) Write code to populate the menu.  Each item should have its
      background set to the corresponding colour, using setBackground().  */

      /****************  INSERT CODE HERE  ***************/

      menuBar.add(colourMenu);
      setJMenuBar(menuBar);

      // Add the components to the content pane.
      contentPane.add(newFrameletButton);
      contentPane.add(exitProgramButton);
      contentPane.add(colourSwatchLabel);
      contentPane.add(colourSwatchPanel);
   }

   /**  (D) Write code for the inner class NewFrameletButtonListener.
    *   When invoked, the actionPerformed method should update the
    *   count of framelets created, then instantiate a  framelet with
    *   the current colour and serial number.  Lastly the framelet
    *   should be made visible.
    */

   /****************  INSERT AN INNER CLASS HERE  ***************/

   /**  (E) Write code for the inner class ExitProgramButtonListener.
    *   When invoked, the actionPerformed method should terminate
    *   the program.
    */

   /****************  INSERT AN INNER CLASS HERE  ***************/

   /**  (F) Write code for the inner class ColourMenuListener.
    *   When invoked, the actionPerformed method should loop through
    *   the array of menu items, comparing each with the source of
    *   the action event.  When the item concerned is identified, the
    *   current colour should be set to the colour which corresponds
    *   to the menu item.  The current colour should then be used to
    *   update the background of the colour swatch panel.
    */

   /****************  INSERT AN INNER CLASS HERE  ***************/

}
