import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String args[]) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new FlowLayout( FlowLayout.LEADING, 10, 10)); // Uses FlowLayout by default

        // Add buttons
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));

        frame.add(panel); // Add panel to frame
        frame.setVisible(true);
    }
}
