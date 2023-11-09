package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Sprite extends JButton {

    private Moneda mon;
    private Comprador com;

    public ButtonBebida_Sprite(monButton m, PanelComprador beber){
        super("Sprite");
       
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSprite.precio<=m.getM()){
                    beber.getBeber().cabiotext("Sprite");
                    beber.getComprar().definirprecio(Expendedor.PRODUCTOS.PreSprite.precio);
                }
            }
        });
    }



}
