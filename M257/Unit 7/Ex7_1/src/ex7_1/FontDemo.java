package ex7_1;

/**
 * Title: Exercise 7.1 FontDemo
 * Description: A program to demonstrate fonts -
 * user interface only.  Event handling has yet
 * to be added.
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 25/02/2004
 */

import java.awt.*;
import javax.swing.*;
/**************** (A) IMPORT EXTRA package HERE  ***************/

public class FontDemo extends JFrame
{
   private JMenuBar menuBar;
   private JMenu helpMenu;
   private JMenuItem aboutItem;

   private JLabel fontChoiceLabel;
   private JComboBox fontChoices;

   private JLabel sizeChoiceLabel;
   private JTextField size;
   private JScrollPane scrollPane;

   private JLabel styleChoiceLabel;
   private JCheckBox bold;
   private JCheckBox italic;

   private JTextArea textBox;

   private JButton displayButton;

   private JPanel topPanel;
   private JPanel bottomPanel;

   // Variables to hold the font parameters.
   private Font currentFont;
   private int currentSize;
   private int currentStyle;
   private boolean isBold;
   private boolean isItalic;

   public FontDemo()
   {
      setSize(400, 240);
      setTitle("Font demo");
      setLocation(100, 100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Initalise the font parameters.
      fontInit();

      Container contentPane = getContentPane();
      contentPane.setLayout(new GridLayout(2,1));

      menuBar = new JMenuBar();
      helpMenu = new JMenu("Help");
      aboutItem = new JMenuItem("About");

      /**************** (B) ADD A LISTENER TO aboutItem ***************/
      helpMenu.add(aboutItem);
      menuBar.add(helpMenu);
      setJMenuBar(menuBar);

      topPanel = new JPanel();
      bottomPanel = new JPanel();

      fontChoiceLabel = new JLabel("Font family");
      fontChoices = new JComboBox();
      fontChoices.addItem("SansSerif");
      fontChoices.addItem("Serif");
      fontChoices.addItem("Monospaced");
      topPanel.add(fontChoiceLabel);
      topPanel.add(fontChoices);

      sizeChoiceLabel = new JLabel("Size");
      topPanel.add(sizeChoiceLabel);
      size = new JTextField(3);
      size.setText(Integer.toString(currentSize));
      topPanel.add(size);

      styleChoiceLabel = new JLabel("Style");
      topPanel.add(styleChoiceLabel);
      bold = new JCheckBox("Bold");
      italic = new JCheckBox("Italic");
      topPanel.add(bold);
      topPanel.add(italic);

      displayButton = new JButton("Show font");

      /****************  (C) ADD A LISTENER TO displayButton ***************/
      topPanel.add(displayButton);


      textBox = new JTextArea("The cat sat on the mat.");
      scrollPane = new JScrollPane(textBox);
      bottomPanel.setLayout(new BorderLayout());
      bottomPanel.add(scrollPane, BorderLayout.CENTER);

      contentPane.add(topPanel);
      contentPane.add(bottomPanel);
   }

   /****************  (D) INSERT AN INNER LISTENER CLASS HERE  ***************/

   // Helper methods follow.

   // Initalises the font parameters.
   private void fontInit()
   {
      currentSize = 12;
      currentStyle = Font.PLAIN;
      currentFont = new Font("SansSerif", currentStyle, currentSize = 12);
      isBold = false;
      isItalic = false;
   }

   // Displays a pop-up dialog box.
   private void aboutDialog()
   {
      JOptionPane.showMessageDialog(null, "", 
         "This is a User Interface from M257", JOptionPane.INFORMATION_MESSAGE);
   }

   /** When invoked:
    *  Finds the font name currently selected in the
    *  drop down list.
    *  Reads the font size and converts it to an integer.
    *  Determines if bold and/or italic are selected.
    *  Construct a new font object from this information.
    *  Sets this to be the font of the text sample displayed
    *  in the scrollable text area.
    */
   private void updateFontSample()
   {
      String fontName = (String)fontChoices.getSelectedItem();

      currentSize = Integer.parseInt(size.getText());

      isBold = bold.isSelected();
      isItalic = italic.isSelected();
      currentStyle = Font.PLAIN;

      if (isBold)
      {
         currentStyle = currentStyle + Font.BOLD;
      }
      if (isItalic)
      {
         currentStyle = currentStyle + Font.ITALIC;
      }

      currentFont = new Font(fontName, currentStyle, currentSize);

      textBox.setFont(currentFont);
   }
}
