import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuExample extends JFrame {

    JTextArea textArea;

    public MenuExample() {
        setTitle("Menu and Toolbar Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // === Text Area ===
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // === Menu Bar ===
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F

        JMenuItem newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newItem.setToolTipText("Create a new file");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");

        JCheckBoxMenuItem wrapItem = new JCheckBoxMenuItem("Word Wrap");
        wrapItem.addActionListener(e -> textArea.setLineWrap(wrapItem.isSelected()));

        JRadioButtonMenuItem light = new JRadioButtonMenuItem("Light");
        JRadioButtonMenuItem dark = new JRadioButtonMenuItem("Dark");

        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(light);
        themeGroup.add(dark);
        light.setSelected(true);

        editMenu.add(wrapItem);
        editMenu.addSeparator();
        editMenu.add(light);
        editMenu.add(dark);

        // Add menus to bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        // === Toolbar ===
        JToolBar toolBar = new JToolBar();
        JButton newBtn = new JButton("New");
        JButton saveBtn = new JButton("Save");
        newBtn.setToolTipText("Create new document");
        saveBtn.setToolTipText("Save current document");

        toolBar.add(newBtn);
        toolBar.add(saveBtn);
        add(toolBar, BorderLayout.NORTH);

        // === Popup Menu ===
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        textArea.setComponentPopupMenu(popupMenu); // Right-click menu on text area
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuExample().setVisible(true));
    }
}
