package GUI_Examples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Button extends JPanel implements ActionListener {

    protected JButton b1;

    public Button() {

        //TODO Create a series of buttons (7) to replicate the Util program, and an exit btn

        // Button 1 parameters
        // Try different TextPosition attributes
        b1 = new JButton("Button");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("button1");

        /**
         * To build out the FCE-UTIL Program, we will need buttons for:
         *  Changing the store #
         *  Running the clean up script
         *  Terminating MWS
         *  Rebooting the PC
         *  Running a constant ping on the site
         *  Terminating a custom process
         *  Launching a VNC Viewer pre-loaded with site connection options
         */

        // Button ActionListeners
        b1.addActionListener(this);

        // Tool Tips
        b1.setToolTipText("Press to run a thing");

        // Add Buttons to be displayed
        add(b1);

    }


    /* TODO: Read about actionPerformed and how it would be best to implement multiple-selection statements for the series of buttons */

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("button1")) {
            BtnFunctions.thingToRun();
        }
    }

    protected static void app() {
        JFrame frame = new JFrame("Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button newContentPane = new Button();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
