import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonBebida_Sprite extends JButton {

    private Expendedor exp =new Expendedor(3);
    private Moneda mon;
    private Comprador com;
    ImageIcon image;
    public ButtonBebida_Sprite(Expendedor exp, monButton m, ImageIcon image){
        super(image);
        this.image=image;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSprite.precio<=m.getM()){

                    try {
                        com=new Comprador(new Moneda1000(),exp.SPRITE,exp);
                    } catch (NoHayProductoException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoInsuficienteException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                    if (com!=null) {
                        m.reducirMoneda(Expendedor.PRODUCTOS.PreSprite.precio);
                        System.out.println("Sprite");
                    }
                }
            }
        });
    }



}
