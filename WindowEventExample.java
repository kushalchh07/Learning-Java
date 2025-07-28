import javax.swing.*;
import java.awt.event.*;

public class WindowEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Event Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Handle close manually

        JLabel label = new JLabel("Perform window actions (like close, minimize, etc.)", SwingConstants.CENTER);
        frame.add(label);

        // Add WindowListener using WindowAdapter
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    frame.dispose(); // Close window
                }
            }

            public void windowOpened(WindowEvent e) {
                label.setText("Window Opened");
            }

            public void windowIconified(WindowEvent e) {
                label.setText("Window Minimized");
            }

            public void windowDeiconified(WindowEvent e) {
                label.setText("Window Restored");
            }
        });

        frame.setVisible(true);
    }
}
