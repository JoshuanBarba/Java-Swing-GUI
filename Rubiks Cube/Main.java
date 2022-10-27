import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame();

        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.white);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.black);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);
        
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.yellow);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.orange);

        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.blue);
                
        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.blue);

        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.green);

        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.black);

        Container pane = jFrame.getContentPane();
        pane.setLayout(new GridLayout(3,3));

        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);
        pane.add(panel5);
        pane.add(panel6);
        pane.add(panel7);
        pane.add(panel8);
        pane.add(panel9);

        jFrame.setVisible(true);
    }
    
  public static void main(String[] args) {
    createAndShowGUI();
  }
}
