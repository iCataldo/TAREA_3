package Gui;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Snicker extends JButton {

    private Expendedor exp =new Expendedor(3);
    private String Nombre= "Snicker";
    private Comprador com;
    ImageIcon image;
    public ButtonBebida_Snicker( monButton m, PanelComprador beber, ImageIcon image){
        super(image);
        this.image = image;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSniker.precio<=m.getM()){
                    beber.getBeber().cabiotext("Snicker");
                    beber.getComprar().definirprecio(Expendedor.PRODUCTOS.PreSniker.precio);
                }
            }
        });
    }

    public String getNombre() {
        return Nombre;
    }
}
