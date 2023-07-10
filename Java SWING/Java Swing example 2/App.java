// 25- Labels in GUI JAVA SWING

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class App {
    public static void main(String[] args) throws Exception {

       //JLabel is a GUI display area for a string of text, an image, or both.

       ImageIcon image = new ImageIcon(new ImageIcon("testicon.jpg").getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)); // scale the image to 100x100 pixels
       // this previous line merges these next 3 lines
       //ImageIcon originalImage = new ImageIcon("testicon.jpg"); // create an image icon
       // Image scaledImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // scale the image to 100x100 pixels
       // ImageIcon scaledIcon = new ImageIcon(scaledImage); // create a new ImageIcon from the scaled image

        Border border = BorderFactory.createLineBorder(Color.green, 3, false);

       JLabel mylabel = new JLabel(); // create a label
       mylabel.setText("Do you even code, Bro?"); // set the text of the label
       mylabel.setIcon(image); // here you may find that the image has taken up the entire label, to fix this, set the horizontal and vertical alignment of the image

       mylabel.setHorizontalAlignment(JLabel.CENTER); // set the horizontal position of the image, LEFT, CENTER, RIGHT, of text
       mylabel.setVerticalAlignment(JLabel.CENTER); // set the vertical position of the image, TOP, CENTER, BOTTOM, of text
       mylabel.setIconTextGap(30); // set the gap between the text and the image
       mylabel.setHorizontalTextPosition(JLabel.CENTER); // set the horizontal position of the text, LEFT, CENTER, RIGHT, of imageIcon
       mylabel.setVerticalTextPosition(JLabel.TOP); // set the vertical position of the text, TOP, CENTER, BOTTOM, of imageIcon
       mylabel.setForeground(new Color(0x00FF00)); // set the foreground color of the text
       mylabel.setBackground(Color.black);
       mylabel.setOpaque(true); // display the background color by setting the label to opaque
       mylabel.setFont(new Font("MV Boli", Font.ITALIC, 25));
       mylabel.setBorder(border); // set the border of the label
       mylabel.setVerticalAlignment(JLabel.CENTER); // set the vertical position of the iocn+text within label
       mylabel.setHorizontalAlignment(JLabel.CENTER); // set the horizontal position of the iocn+text within label
    //    mylabel.setBounds(0, 100, 250, 250); // set the bounds of the label, x, y, width, height

       //MyFrame frame = new MyFrame();
       //frame.add(mylabel);
       JFrame frames = new JFrame();
       frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation, this is what happens when you click the x button
       frames.setTitle("title of JFrame"); // sets the title of the frame
       // frames.setSize(600, 550); // sets the size of the frame x dimension, y dimension
       frames.setVisible(true); // makes the frame visible
       frames.add(mylabel); // add the label to the frame
       // frames.setLayout(null); // set the layout of the frame to null
       ImageIcon icon = new ImageIcon("test.jpg"); // create an image icon
       frames.setIconImage(icon.getImage()); // change icon of frame
       frames.pack(); // resize the frame automatically to fit the components within it
       // pack method must be added after all components have been added

    }
}

///////////////////////////////////////////////////////////////

class MyFrame extends JFrame{
    
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation, this is what happens when you click the x button
        this.setTitle("title of JFrame"); // sets the title of the frame
        this.setSize(500, 500); // sets the size of the this x dimension, y dimension
        this.setResizable(false); // sets whether the this is resizable or not
        this.setVisible(true); // makes the this visible

        ImageIcon image = new ImageIcon("testicon.jpg"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of this
        // this.getContentPane().setBackground(new Color(123, 50, 250)); // change color of background
        // this.getContentPane().setBackground(Color.red); // change color of background

        // public void add(JLabel label) {
        //     this.getContentPane().add(label);
        // }
    }
}