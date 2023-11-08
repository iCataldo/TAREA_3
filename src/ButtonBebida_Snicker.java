import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida_Snicker extends JButton {

    private Expendedor exp =new Expendedor(3);
    private Moneda mon;
    private Comprador com;
    public ButtonBebida_Snicker(Expendedor exp, monButton m){
        super("Snicker");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Expendedor.PRODUCTOS.PreSniker.precio<=m.getM()){

                    try {
                        com=new Comprador(new Moneda1000(),exp.SNICKERS,exp);
                    } catch (NoHayProductoException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoInsuficienteException ex) {
                        throw new RuntimeException(ex);
                    } catch (PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                    if (com!=null) {
                        m.reducirMoneda(Expendedor.PRODUCTOS.PreSniker.precio);
                        System.out.println("Snicker");
                    }
                }
            }
        });
    }



}
