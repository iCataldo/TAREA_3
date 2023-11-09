package Gui;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Super_8 extends JButton {
    private Expendedor exp =new Expendedor(3);
    private Moneda mon;
    private Comprador com;
    ImageIcon image;
    public ButtonBebida_Super_8( monButton m, PanelComprador beber, ImageIcon image){
        super(image);
        this.image = image;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSuper8.precio<=m.getM()){
                    beber.getBeber().cabiotext("Super 8");
                    beber.getComprar().definirprecio(Expendedor.PRODUCTOS.PreSuper8.precio);
                }
            }
        });
    }



}
