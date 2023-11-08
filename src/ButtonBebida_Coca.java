import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonBebida_Coca extends JButton {

    private Expendedor exp =new Expendedor(3);
    private Moneda mon;
    private Comprador com;
    ImageIcon image;
    public ButtonBebida_Coca(Expendedor exp, monButton m, ImageIcon image){
        super(image);
        this.image=image;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreCoca.precio<=m.getM()){

                    try {
                        com=new Comprador(new Moneda1000(),exp.COCA,exp);
                    } catch (NoHayProductoException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoInsuficienteException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                    if (com!=null) {
                        m.reducirMoneda(Expendedor.PRODUCTOS.PreCoca.precio);
                        System.out.println("Coca Cola");
                    }
                }
            }
        });
    }
}
