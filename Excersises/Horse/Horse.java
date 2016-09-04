package Horse;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by Adroso360 on 5/09/2016.
 */
public class Horse {
    public String hname = getInput("Horse Name pls");
    public String hcolor = getInput("Horse Colour Pls");
    public String hborn = getInput("Horse Birth Year pls");


    private String getInput(String message) {
        String input = JOptionPane.showInputDialog(null, message);

        return input;
    }
    public void display(){

        System.out.println("Horse Details" + hname + hcolor + hborn);

    }
}