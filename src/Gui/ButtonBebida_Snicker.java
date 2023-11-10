package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Snicker extends JButton {

    private String Nombre= "Snicker";
    private Comprador com;
    public ButtonBebida_Snicker( monButton m, PanelComprador beber){
        super("Snicker");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSniker.precio<=m.getM()){
                    beber.getBeber().cabiotext("Snicker");
                    beber.getComprar().definirproducto(3);
                }
            }
        });
    }

    public String getNombre() {
        return Nombre;
    }
}
