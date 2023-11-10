package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonComprar extends JButton {
    private int tipo;
    private Comprador com;
    public ButtonComprar(ButtonBeber beber,monButton mon,Expendedor exp){
        super("Comprar!");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    com = new Comprador(new Moneda1000(), tipo, exp);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                if (com != null) {
                    beber.verdad();
                    mon.comprar(com.costo());
                }
            }
        });
    }
    public void definirproducto(int p){
        tipo=p;
    }

}
