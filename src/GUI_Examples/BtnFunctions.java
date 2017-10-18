package GUI_Examples;

import javax.swing.*;
import java.io.IOException;

public class BtnFunctions {

    //TODO: Take this concept and expand to allow for changing site identifiers

    public static void thingToRun() {
        String thing = JOptionPane.showInputDialog("Input Dialog?");

        System.out.println(thing);
    }

    public static void pingEx() {
        String cmd = "";
        cmd += "cmd /c start cmd.exe /K ping fce-1008 -t";
        try {
            Process p = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
