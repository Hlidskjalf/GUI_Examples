package GUI_Examples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Button extends JPanel implements ActionListener {

    protected JButton b1;

    public Button() {

        //TODO Create a series of buttons (9) to replicate the Util program, and an exit btn

        // Button 1 parameters
        b1 = new JButton("Button");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("button1");

        // Button ActionListeners
        b1.addActionListener(this);

        // Tool Tips
        b1.setToolTipText("Press to run a thing");

        // Add Buttons to be displayed
        add(b1);

    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("button1")) {
            thingToRun();
        }
    }

    /**
     * Manage this in a separate file, redesign actionPerformed to allow for
     * many functions, and use this as a template to rebuild FCE Util in Java
     */

    public void thingToRun() {
        JOptionPane.showMessageDialog(this, "You should not have pressed that.");
    }

    protected static void app() {
        JFrame frame = new JFrame("Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button newContentPane = new Button();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }
}
