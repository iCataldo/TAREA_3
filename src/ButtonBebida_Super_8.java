import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Super_8 extends JButton {

    private Expendedor exp =new Expendedor(3);
    private Moneda mon;
    private Comprador com;
    public ButtonBebida_Super_8(Expendedor exp, monButton m){
        super("Super_8");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSuper8.precio<=m.getM()){

                    try {
                        com=new Comprador(new Moneda1000(),exp.SUPER8,exp);
                    } catch (NoHayProductoException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoInsuficienteException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                    if (com!=null) {
                        m.reducirMoneda(Expendedor.PRODUCTOS.PreSuper8.precio);
                        System.out.println("Super 8");
                    }
                }
            }
        });
    }



}
