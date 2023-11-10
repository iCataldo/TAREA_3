package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor( monButton mon, PanelComprador com){
        FlowLayout izquierda = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(izquierda);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        panel.add(new ButtonBebida_Coca(mon,com));
        panel.add(new ButtonBebida_Sprite(mon,com));
        panel.add(new ButtonBebida_Snicker(mon,com));
        panel.add(new ButtonBebida_Super_8(mon,com));
        panel.add(new JButton("Nada_0"));
        panel.add(new JButton("Nada_1"));
        panel.add(new JButton("Nada_2"));
        panel.add(new JButton("Nada_3"));

        this.add(panel);
    }
}

