package Gui;
import javax.swing.*;
import java.awt.*;

public class PanelMatriz extends JPanel {
    public PanelMatriz( monButton mon, PanelComprador com){
        FlowLayout izquierda = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(izquierda);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));

        ImageIcon image1 = new ImageIcon("iconococa.png");
        panel.add(new ButtonBebida_Coca(mon,com, image1));

        ImageIcon image2 = new ImageIcon("iconosprite.png");
        panel.add(new ButtonBebida_Sprite(mon,com, image2));

        ImageIcon image3 = new ImageIcon("iconosnicker.png");
        panel.add(new ButtonBebida_Snicker(mon,com, image3));

        ImageIcon image4 = new ImageIcon("iconosuper8.png");
        panel.add(new ButtonBebida_Super_8(mon,com, image4));
        
        this.add(panel);
    }
}
