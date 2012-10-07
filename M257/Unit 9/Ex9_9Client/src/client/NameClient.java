package client;

/**
 * Title:         NameClient class
 * Description:   A client program that uses a GUI to communicate with server
 *
 * Copyright:   (c) 2004, 2005
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.0
 * Amendment history
 * 12/7/04  BJQ Changed layout to have separate button panel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.net.*;

public class NameClient extends JFrame implements ActionListener
{
   private TextField userName;         // For entry of user name
   private TextField userEmailAddress; // Displays email address of user
   private JButton goButton;           // Button to start processing
   private JButton quitButton;         // Button to close down client

   // Streams used for connecting to server
   private InputStream is;
   private OutputStream os;
   private PrintWriter toServer;
   private BufferedReader fromServer;

   private Socket socket;              // Socket to server


   // Use local host address for server
   private static final String SERVER_ADDRESS = "127.0.0.1";
   private static final int SERVER_PORT_NUMBER = 3000;

   // Protocol definitions
   private static final String CLIENT_QUITTING = "Exit";          // Sent by client
 
   public NameClient(String title)
   {
      super(title);
      setUpGUI();
      connectToServer();
   }

   // Set up client graphical user interface
   private void setUpGUI()
   {
      final int CLIENT_WINDOW_WIDTH = 260;
      final int CLIENT_WINDOW_HEIGHT = 250;
      final int TEXTFIELD_WIDTH = 20;

      userName = new TextField(TEXTFIELD_WIDTH);
      userEmailAddress = new TextField(TEXTFIELD_WIDTH);
      goButton = new JButton("Go");
      quitButton = new JButton("Quit");

      Container content = getContentPane();
      content.setLayout(new GridLayout(5, 1));

      content.add(new Label("User name"));
      content.add(userName);
      content.add(new Label("Email address"));
      content.add(userEmailAddress);

      JPanel buttonPanel = new JPanel();
      buttonPanel.add(goButton);
      buttonPanel.add(quitButton);
      content.add(buttonPanel);

      //Register button listeners
      goButton.addActionListener(this);
      quitButton.addActionListener(this);

      setSize(CLIENT_WINDOW_WIDTH, CLIENT_WINDOW_HEIGHT);
      setVisible(true);
   }

   // Set up connection to the server
   private void connectToServer()
   {
      try
      {
         socket = new Socket(SERVER_ADDRESS, SERVER_PORT_NUMBER);
         openStreams();
      }
      catch (IOException e)
      {
         System.out.println("Trouble contacting the server " + e);
      }
   }

   // Open streams for input and output
   private void openStreams() throws IOException
   {
      final boolean AUTO_FLUSH = true;
      is = socket.getInputStream();
      fromServer = new BufferedReader(new InputStreamReader(is));
      os = socket.getOutputStream();
      toServer = new PrintWriter(os, AUTO_FLUSH);
   }
   // Close streams to and from the server
   private void closeStreams() throws IOException
   {
      toServer.close();
      os.close();
      fromServer.close();
      is.close();
   }


   // Select an action depending on which button was pressed
   public void actionPerformed(ActionEvent ae)
   {
      Object buttonClicked = ae.getSource();
      try
      {
         if (buttonClicked.equals(goButton))
         {
            processGo();   // respond to GO button
         }
         else if (buttonClicked.equals(quitButton))
         {
            processQuit(); // respond to QUIT button
         }
      }
      catch (IOException e)
      {
         System.out.println("Problem with the server " + e);
      }
   }


   // Respond to GO button - User has requested an email address
   private void processGo() throws IOException
   {
      String usName;
      String emailAddress;

      usName = userName.getText();            // Get the name of the user
      toServer.println(usName);               // Send it to the server
      emailAddress = fromServer.readLine();   // Receive reply
      userEmailAddress.setText(emailAddress); // Display email address
   }

   // Respond to QUIT button
   private void processQuit() throws IOException
   {
      toServer.println(CLIENT_QUITTING); // Tell server client is closing down
      closeStreams();             // Close streams to server
      socket.close();             // Close socket connection to server
      System.exit(0);             // Close down client program
   }

} // end class
