import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("MouseAdapter Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Click anywhere in the window", SwingConstants.CENTER);
        frame.add(label);

        // Add mouse listener using MouseAdapter
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
