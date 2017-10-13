package GUI_Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Radio extends JPanel implements ActionListener {

    //static String brokenCoin = "Broken Coin";
    static String cpp = "cpp_logo";
    static String ohNo = "6BPZyLG";

    JLabel picture;

    public Radio() {
        super (new BorderLayout());

        // Da Btns
        JRadioButton bcBtn = new JRadioButton(cpp);
        bcBtn.setMnemonic(KeyEvent.VK_B);
        bcBtn.setActionCommand(cpp);
        bcBtn.setSelected(true);

        JRadioButton ohNoBtn = new JRadioButton(ohNo);
        ohNoBtn.setMnemonic(KeyEvent.VK_B);
        ohNoBtn.setActionCommand(ohNo);

        // Btn Group
        ButtonGroup grp = new ButtonGroup();
        grp.add(bcBtn);
        grp.add(ohNoBtn);

        // Btn Listener
        bcBtn.addActionListener(this);
        ohNoBtn.addActionListener(this);

        // Pic Label
        picture = new JLabel(icon("Assets/" + cpp + ".png"));

        // Btn in an panel
        JPanel rpanel = new JPanel(new GridLayout(0, 1));
        rpanel.add(bcBtn);
        rpanel.add(ohNoBtn);

        add(rpanel, BorderLayout.LINE_START);
        add(picture, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

    }

    public void actionPerformed(ActionEvent e) {
        picture.setIcon(icon("Assets/" + e.getActionCommand() + ".png"));
    }

    protected static ImageIcon icon(String path) {
        java.net.URL imgURL = Radio.class.getResource(path);
        if(imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find the selected image from: " + path);
            return null;
        }
    }

    public static void app() {
        JFrame frame = new JFrame("Radio Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Content Pane
        JComponent newContent = new Radio();
        newContent.setOpaque(true);  // This is just necessary
        frame.setContentPane(newContent);

        // Display the Windah
        frame.pack();
        frame.setSize(700, 800);
        frame.setVisible(true);
    }
}
