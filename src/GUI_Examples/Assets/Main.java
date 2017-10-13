package GUI_Examples.Assets;

import GUI_Examples.Radio;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Radio.app();
            }
        });
    }
}
