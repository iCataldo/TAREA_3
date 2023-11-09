package Gui;

import Gui.DepositoM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonVuelto extends JButton {

    public ButtonVuelto(monButton mon){
        super("Vuelto");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mon.Vuelto();
            }
        });
    }
}
