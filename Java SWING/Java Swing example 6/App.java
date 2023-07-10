// 29- sub panels (a panel within a panel) panelception :) JAVA SWING

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class App {
  public static void main(String[] args) throws Exception {

    // Layout Manager = Defines the natural layout for components within a container
    // common managers:
    // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER. All extra space is placed in the center area.
    // FlowLayout = The FlowLayout is used to arrange components in a line, one after another (in a flow). It is the default layout of applet or panel.
    // GridLayout = The GridLayout is used to arrange the components in rectangular grid. One component is displayed in each rectangle.
    // GridBagLayout = The GridBagLayout is used to arrange the components in rectangular grid. But it is flexible than GridLayout and GridBagLayout.
    // CardLayout = The CardLayout is used to swap between multiple components where only one component is visible at a time.
    // GroupLayout = The GroupLayout is used to arrange the components in a Container. It is an improvement over the GridBagLayout.
    // SpringLayout = The SpringLayout is used to arrange the components in a Container. It is an improvement over the GridBagLayout.
    // NullLayout = The NullLayout is the layout manager which doesn't care about the size or position of the components on the screen. It simply uses whatever size and position are given to it.
    // BoxLayout = A BoxLayout lays out a container's components either vertically or horizontally. It then resizes the components in their own bounds (rather than to fill the entire container, as GridLayout does).

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setLayout(new BorderLayout(10,10)); // vertical gap, horizontal gap

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    panel1.setBackground(Color.red);
    panel2.setBackground(Color.green);
    panel3.setBackground(Color.magenta);
    panel4.setBackground(Color.yellow);
    panel5.setBackground(Color.blue);

    panel5.setLayout(new BorderLayout());

    panel1.setPreferredSize(new Dimension(50, 50));
    panel2.setPreferredSize(new Dimension(50, 50));
    panel3.setPreferredSize(new Dimension(50, 50));
    panel4.setPreferredSize(new Dimension(50, 50));
    panel5.setPreferredSize(new Dimension(50, 50));

    //---------------- sub panels ----------------

    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();

    panel6.setBackground(Color.black);
    panel7.setBackground(Color.darkGray);
    panel8.setBackground(Color.gray);
    panel9.setBackground(Color.lightGray);
    panel10.setBackground(Color.white);

    panel5.setLayout(new BorderLayout());

    panel6.setPreferredSize(new Dimension(50, 50));
    panel7.setPreferredSize(new Dimension(50, 50));
    panel8.setPreferredSize(new Dimension(50, 50));
    panel9.setPreferredSize(new Dimension(50, 50));
    panel10.setPreferredSize(new Dimension(50, 50));

    panel5.add(panel6, BorderLayout.NORTH);
    panel5.add(panel7, BorderLayout.SOUTH);
    panel5.add(panel8, BorderLayout.WEST);
    panel5.add(panel9, BorderLayout.EAST);
    //panel5.add(panel10, BorderLayout.CENTER);

    //------------------ sub panels ------------------
    
    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.WEST);
    frame.add(panel3, BorderLayout.EAST);
    frame.add(panel4, BorderLayout.SOUTH);
    frame.add(panel5, BorderLayout.CENTER);

  }
}