import javax.swing.*;
import java.awt.*;

public class PanelMatriz extends JPanel {
    public PanelMatriz(Expendedor exp, monButton mon){
        FlowLayout izquierda = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(izquierda);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        
        //BOTÓN COCA COLA
        ImageIcon image1 = new ImageIcon("iconococa.png");
        ButtonBebida_Coca botoncoca = new ButtonBebida_Coca(exp, mon, image1);
        panel.add(botoncoca);

        //BOTÓN SPRITE
        ImageIcon image2 = new ImageIcon("iconosprite.png");
        ButtonBebida_Sprite botonsprite = new ButtonBebida_Sprite(exp, mon, image2);
        panel.add(botonsprite);

        //BOTÓN SNICKERS
        ImageIcon image3 = new ImageIcon("iconosnickers.png");
        ButtonBebida_Snicker botonsnicker = new ButtonBebida_Snicker(exp, mon, image3);
        panel.add(botonsnicker);

        //BOTÓN SUPER8
        ImageIcon image4 = new ImageIcon("iconosuper8.png");
        ButtonBebida_Super_8 botonsuper8 = new ButtonBebida_Super_8(exp, mon, image4);
        panel.add(botonsuper8);
        this.add(panel);
    }
}
