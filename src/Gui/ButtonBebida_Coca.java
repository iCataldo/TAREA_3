package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Coca extends JButton {

    private Expendedor exp =new Expendedor(3);
    private Moneda mon;
    private Comprador com;
    public ButtonBebida_Coca( monButton m, PanelComprador beber){
        super("Coca");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreCoca.precio<=m.getM()){
                    beber.getBeber().cabiotext("Coca Cola");
                    beber.getComprar().definirproducto(1);
                }
            }
        });
    }
}

