package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonComprar extends JButton {
    private int precio;
    public ButtonComprar(ButtonBeber beber,monButton mon){
        super("Comprar!");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beber.verdad();
                mon.comprar(precio);
            }
        });
    }
    public void definirprecio(int p){
        precio=p;
    }
}
