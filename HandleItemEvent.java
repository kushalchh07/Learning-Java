import java.awt.event.*;
import javax.swing.*;


class HandleItemEvent  {


public static void main(String args[]){
// frame banauney

JFrame frame = new JFrame("Item Event Example");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// CHeck box and label

JCheckBox checkBox = new JCheckBox("Option 1");
JLabel label = new JLabel("Option 1 is not selected");

checkBox.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED) {
        label.setText("Option 1 is selected");
    } else {
        label.setText("Option 1 is not selected");
    }
}
});
frame.setLayout(new java.awt.BorderLayout());
frame.add(checkBox, java.awt.BorderLayout.NORTH);
frame.add(label, java.awt.BorderLayout.CENTER);
frame.setVisible(true);

}


}