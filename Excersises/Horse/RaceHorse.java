package Horse;

import javax.swing.*;

/**
 * Created by Adroso360 on 5/09/2016.
 */
public class RaceHorse extends Horse {
    public int hraces = getinput("How many races has this thing done?");

    private int getinput(String s) {
        String temp = JOptionPane.showInputDialog(null, s);
        return Integer.parseInt(temp);
    }
    public void display(){

        System.out.println("Horse Details" + hname + hcolor + hborn + "it has then raced" + hraces);
    }

}
