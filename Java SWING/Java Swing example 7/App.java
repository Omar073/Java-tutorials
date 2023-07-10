// 30- FLowLayout manager JAVA SWING

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class App {
  public static void main(String[] args) throws Exception {

    // Layout Manager = Defines the natural layout for components within a container
    // common managers:
    // FlowLayout = The FlowLayout is used to arrange components in a line, one after another (in a flow).
    // If the horizontal space in the container is too small, the FlowLayout class uses the next available row.

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new FlowLayout());
    // frame.setLayout(new FlowLayout(FlowLayout.LEADING)); // left align
    // frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); // right align

    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(150, 150));
    panel.setBackground(Color.lightGray);
    panel.setLayout(new FlowLayout());

    panel.add(new JButton("1")); // create a new button and add it to panel
    panel.add(new JButton("2"));
    panel.add(new JButton("3"));
    panel.add(new JButton("4"));
    panel.add(new JButton("5"));
    panel.add(new JButton("6"));
    panel.add(new JButton("7"));
    panel.add(new JButton("8"));
    panel.add(new JButton("9"));
      
    frame.add(panel);
    frame.setVisible(true);
  }
}
