// 28- If we want to show a label only when the button is pressed JAVA SWING

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    public static void main(String[] args) {
        new MyFrame();
    }
    
    JButton button; // create a button
    JLabel label; // create a label
    
    //constructor
    MyFrame(){


        ImageIcon icon = new ImageIcon("image2.jpg"); // create an image icon
        ImageIcon icon2 = new ImageIcon("image1.png"); // create an image icon

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton("Hi, I'm a button");
        button.setBounds(200, 100, 200, 100);
        button.setFont(new Font("Arial", Font.BOLD, 16)); // set font of text inside button
        button.setBackground(Color.lightGray); // set background color of button
        button.setForeground(Color.WHITE); // set text color of button
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        // button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        // button.setBorder(null); // get rid of border around button
        // button.setBorder(BorderFactory.createEtchedBorder()); // set border of button
        // button.setIconTextGap(-10); // set gap between text and icon
        button.setFocusable(false); // get rid of border around text of button
        button.addActionListener(this); // add an action listener (when you click the button)
        button.setIcon(icon); // set icon of button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation, this is what happens when you click the x button
        this.setTitle("title of JFrame"); // sets the title of the frame
        this.setSize(500, 500); // sets the size of the this x dimension, y dimension
        this.setLayout(null);
        this.setVisible(true); // makes the this visible
        this.add(button); // add the button to the frame
        this.add(label); // add the label to the frame

        ImageIcon image = new ImageIcon("test.jpg"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("You clicked mee!");
            // button.setEnabled(false); // if we want to disable the button after we click it
            label.setVisible(true); // make the label visible once we click the button
        }
    }
}