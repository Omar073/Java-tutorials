// 27- JAVA GUI Button using lambda expressions JAVA SWING

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame{

    public static void main(String[] args) {
        new MyFrame();
    }
    
    JButton button; // create a button
    
    //constructor
    MyFrame(){

        ImageIcon icon = new ImageIcon("image2.jpg"); // create an image icon

        button = new JButton("Hi, I'm a button");
        button.setBounds(200, 100, 200, 100);
        button.setFont(new Font("Arial", Font.BOLD, 16)); // set font of text inside button
        button.setBackground(Color.RED); // set background color of button
        button.setForeground(Color.WHITE); // set text color of button
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        // button.setBorder(BorderFactory.createEtchedBorder()); // set border of button
        // button.setIconTextGap(-10); // set gap between text and icon
        button.setFocusable(false); // get rid of border around text of button
        button.addActionListener(e -> System.out.println("you clicked mee!")); // add an action listener (when you click the button)
        button.setIcon(icon); // set icon of button


        // I wanted to set the button to always be at the cente rof the frame so in order to do that I had to create a vertical box and a horizontal box
        // I know that this method is not the best way to do it but it works for now until i can find a better way to do it
        // create a horizontal box
        Box hbox = Box.createHorizontalBox();
        hbox.add(Box.createHorizontalGlue()); // add horizontal glue to center the button
        hbox.add(button); // add the button to the box
        hbox.add(Box.createHorizontalGlue()); // add horizontal glue to center the button

        // create a vertical box
        Box vbox = Box.createVerticalBox();
        vbox.add(Box.createVerticalGlue()); // add vertical glue to center the button
        vbox.add(hbox); // add the horizontal box to the vertical box
        vbox.add(Box.createVerticalGlue()); // add vertical glue to center the button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation, this is what happens when you click the x button
        this.setTitle("title of JFrame"); // sets the title of the frame
        this.setSize(500, 500); // sets the size of the this x dimension, y dimension
        this.setLayout(new BorderLayout());

        this.setVisible(true); // makes the this visible
        this.add(vbox, BorderLayout.CENTER); // add the vertical box to the frame

        ImageIcon image = new ImageIcon("test.jpg"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame

    }
}

