package Gui;

import javax.swing.*;
import java.awt.*;

public class pop extends JFrame {
    public pop(String text){
        JLabel mensaje = new JLabel("Bebiste/Comiste: "+text);
        mensaje.setFont(new Font("arial",Font.PLAIN,15));
        this.add(mensaje);

        this.setLocationRelativeTo(null);
        this.setSize(230, 100);
        this.setVisible(true);
        this.setTitle("Bebida");
    }
}
