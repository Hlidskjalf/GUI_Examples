package GUI_Examples;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Button.app();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
