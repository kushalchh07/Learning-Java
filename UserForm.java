import javax.swing.*;
import java.awt.*;

public class UserForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        Container container = frame.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // gbc.insets = new Insets(5, 5, 5, 5); // padding
        // gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name Label 
        gbc.gridx = 0;
        gbc.gridy = 0;
        container.add(new JLabel("Name:"), gbc);

        // Name Text Field
        gbc.gridx = 1;
        gbc.gridy = 0;
        container.add(new JTextField(20), gbc);

        // Email Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        container.add(new JLabel("Email:"), gbc);

        // Email Text Field
        gbc.gridx = 1;
        gbc.gridy = 1;
        container.add(new JTextField(20), gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 2;
        container.add(new JLabel("Password:"), gbc);

        // Password Field
        gbc.gridx = 1;
        gbc.gridy = 2;
        container.add(new JPasswordField(20), gbc);

        // Submit Button
        gbc.gridx = 0;
        gbc.gridy = 3;
        container.add(new JButton("Submit"), gbc);

        // Cancel Button
        gbc.gridx = 1;
        gbc.gridy = 3;
        container.add(new JButton("Cancel"), gbc);

        frame.setVisible(true);
    }
}
