// 26- JPanels JAVA GUI JAVA SWING

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class App {
    public static void main(String[] args) throws Exception {

      ImageIcon image = new ImageIcon("image2.jpg"); // create an image

      // JLabel can only belong to one parent component at a time.
      // If you try to add a JLabel to multiple JPanels, it will be removed from its current parent
      // and added to the new one. If you want to display the same label in multiple places,
      // you can create multiple instances of the JLabel with the same text and icon.

      JLabel label = new JLabel(); // create a label
      label.setText("hi"); // set the text of the label
      label.setIcon(image); // set the image of the label
      // label.setHorizontalAlignment(JLabel.RIGHT);
      // label.setVerticalAlignment(JLabel.BOTTOM); 
      // the set allignment functions only work when we set the layout of the panel to new BorderLayout()
      label.setBounds(0, 0, 150, 75); 
      // this function is used if we want to place the label in a specific location relative to the enrire frame not just the panel
      label.setFont(new Font("Arial", Font.BOLD, 15)); // set the font of the label

      // JPanel = a GUI component that functions as a container to hold other components

      JPanel redpanel = new JPanel(); // create a panel
      redpanel.setBackground(Color.red);
      redpanel.setBounds(0, 0, 250, 250); // set the size and location of the panel
      redpanel.setLayout(null); // set the layout of the panel to null
      // redpanel.setLayout(new BorderLayout()); // set the layout of the panel to new BorderLayout()
      // we can also use Layout new BorderLayout if we want to specify the label inside a specific panel
      redpanel.add(label); // the .add function must be added after the layout is set to new BorderLayout()

      JPanel bluepanel = new JPanel(); // create a panel
      bluepanel.setBackground(Color.blue);
      bluepanel.setBounds(250, 0, 250, 250); // set the size and location of the panel
      bluepanel.setLayout(null); // set the layout of the panel to null
      
      JPanel greenpanel = new JPanel(); // create a panel
      greenpanel.setBackground(Color.green);
      greenpanel.setBounds(0, 250, 500, 250); // set the size and location of the panel
      greenpanel.setLayout(null); // set the layout of the panel to null

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation, this is what happens when you click the x button
      frame.setLayout(null); // set the layout of the frame to null
      frame.setTitle("title of JFrame"); // sets the title of the frame
      frame.setSize(750, 600); // sets the size of the frame x dimension, y dimension
      frame.add(redpanel); // add the redpanel to the frame
      frame.add(bluepanel); // add the bluepanel to the frame
      frame.add(greenpanel); // add the greenpanel to the frame
      frame.setVisible(true); // makes the frame visible
      ImageIcon icon = new ImageIcon("test.jpg"); // create an image icon
      frame.setIconImage(icon.getImage()); // change icon of frame

    }
}
