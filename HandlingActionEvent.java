
import java.awt.event.*;
import javax.swing.*;

public class HandlingActionEvent{
    public static void main(String args[]){

        //create Frame
      JFrame frame = new JFrame("Action Event Example");
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

//create Button

JButton button = new JButton("Click Here");
JLabel label = new JLabel("Button Unclicked",SwingConstants.CENTER);

button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked");
    }
});
frame.setLayout(new java.awt.BorderLayout());
frame.add(button, java.awt.BorderLayout.SOUTH);// button added to the south of the frame

frame.add(label, java.awt.BorderLayout.CENTER);// label added to the center of the frame
 frame.setVisible(true);
}
}