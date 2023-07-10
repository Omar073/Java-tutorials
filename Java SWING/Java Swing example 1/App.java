// 24- basics GUI JAVA SWING

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


public class App {
    public static void main(String[] args) throws Exception {
    
        JFrame frame = new JFrame(); // creates a frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation, this is what happens when you click the x button
        frame.setTitle("title of JFrame"); // sets the title of the frame
        frame.setSize(500, 500); // sets the size of the frame x dimension, y dimension
        frame.setResizable(false); // sets whether the frame is resizable or not
        frame.setVisible(true); // makes the frame visible

        ImageIcon image = new ImageIcon("testicon.jpg"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame
        // frame.getContentPane().setBackground(new Color(123, 50, 250)); // change color of background
        frame.getContentPane().setBackground(Color.red); // change color of background

    }
}
