package Gui;

import Gui.pop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBeber extends JButton {
    private String texto;

    public ButtonBeber(){
        falso();
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new pop(texto);
                texto=null;
                falso();
            }
        });
    }
    public void falso(){
        this.setEnabled(false);
    }
    public void verdad(){
        this.setEnabled(true);
    }
    public void cabiotext(String texto){
        this.setText(texto);
        this.texto=texto;
    }


}
