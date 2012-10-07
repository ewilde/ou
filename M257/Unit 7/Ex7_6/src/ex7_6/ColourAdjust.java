package ex7_6;

import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

/**
 * Title: Exercise 7.6 ColourAdjust
 * An application that demonstrates the combination of
 * Red, Green and Blue components to create a custom colour
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0 23/02/2004
 */

public class ColourAdjust extends JFrame
{
   private JPanel bottom;

   private int greenValue;
   private int redValue;
   private int blueValue;

   private ColourPanel greenCanvas;
   private ColourPanel redCanvas;
   private ColourPanel blueCanvas;

   private ColourPanel colCanvas;

   private JTextField greenText;
   private JTextField blueText;
   private JTextField redText;

   private JScrollBar redSlider;
   private JScrollBar blueSlider;
   private JScrollBar greenSlider;


   public ColourAdjust()
   {
      setTitle("Colour Adjust");
      setSize(300, 300);

      // In the centre of a 1024 x 768 screen. May need adjusting.
      setLocation(362, 234);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      bottom = new JPanel();
      colCanvas = new ColourPanel();

      redCanvas = new ColourPanel();
      greenCanvas = new ColourPanel();
      blueCanvas = new ColourPanel();

      bottom.setLayout(new GridLayout(4, 3));

      redSlider = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
      greenSlider = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
      blueSlider = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);

      redText = new JTextField("0000", 4);
      greenText = new JTextField("0000", 4);
      blueText = new JTextField("0000", 4);

      bottom.add(redSlider);
      bottom.add(redText);
      bottom.add(redCanvas);
      bottom.add(greenSlider);
      bottom.add(greenText);
      bottom.add(greenCanvas);
      bottom.add(blueSlider);
      bottom.add(blueText);
      bottom.add(blueCanvas);

      getContentPane().setLayout(new GridLayout(2, 1));
      getContentPane().add(colCanvas);
      getContentPane().add(bottom);

      redSlider.addAdjustmentListener(new ColSlide());
      greenSlider.addAdjustmentListener(new ColSlide());
      blueSlider.addAdjustmentListener(new ColSlide());
   }


   private class ColSlide implements AdjustmentListener
   {
      public void adjustmentValueChanged(AdjustmentEvent e)
      {

         if ((e.getAdjustable()) == redSlider)
         {
            redValue = redSlider.getValue();
            //redSlider.setValue(redValue);
            redText.setText(Integer.toString(redValue));
            redCanvas.changeColour(redValue, 0, 0);
            redCanvas.repaint();
         }
         if ((e.getAdjustable()) == greenSlider)
         {
            greenValue = greenSlider.getValue();
            //greenSlider.setValue(greenValue);
            greenText.setText(Integer.toString(greenValue));
            greenCanvas.changeColour(0, greenValue, 0);
            greenCanvas.repaint();
         }

         if ((e.getAdjustable()) == blueSlider)
         {
            blueValue = blueSlider.getValue();
            //blueSlider.setValue(blueValue);
            blueText.setText(Integer.toString(blueValue));
            blueCanvas.changeColour(0, 0, blueValue);
            blueCanvas.repaint();
         }

         colCanvas.changeColour(redValue, greenValue, blueValue);
         colCanvas.repaint();
      }
   }
}
