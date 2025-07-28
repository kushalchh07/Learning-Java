import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Key Event Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        JLabel label = new JLabel("Press any key...", SwingConstants.CENTER);
        frame.add(label);

        // Make the frame focusable
        frame.setFocusable(true);

        // Add KeyListener to the frame
        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                // Called when a key is typed (pressed and released)
                label.setText("Key Typed: " + e.getKeyChar());
            }

            public void keyPressed(KeyEvent e) {
                // Called when a key is pressed
                label.setText("Key Pressed: " + e.getKeyChar());
            }

            public void keyReleased(KeyEvent e) {
                // Called when a key is released
                label.setText("Key Released: " + e.getKeyChar());
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
