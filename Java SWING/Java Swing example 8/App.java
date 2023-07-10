// 31- GridLayout JAVA SWING

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class App {
  public static void main(String[] args) throws Exception {

    // Layout Manager = Defines the natural layout for components within a container
    // common managers:
    // GridLayout = arranges components in a grid of rows and columns (cells)
    // each component takes all the available space within its cell, and each cell is same size

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new GridLayout(3,3,10,10)); // 3 rows, 3 columns, horizontal gap 10, vertical gap 10

    frame.add(new JButton("1")); // create a new button and add it to frame
    frame.add(new JButton("2"));
    frame.add(new JButton("3"));
    frame.add(new JButton("4"));
    frame.add(new JButton("5"));
    frame.add(new JButton("6"));
    frame.add(new JButton("7"));
    frame.add(new JButton("8"));
    frame.add(new JButton("9"));
      
    frame.setVisible(true);

  }
}