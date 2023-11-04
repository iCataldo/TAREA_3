import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonBebida extends JButton {

    private Expendedor exp =new Expendedor(3);
    private int tipo;
    private String nombre;
    private Comprador com;
    public ButtonBebida(String text, int tip,Moneda mon){
        super(text);
        nombre = text;
        tipo = tip;
        this.addActionListener(new ComprarBebida(mon));
    }

    public int getTipo() {
        return tipo;
    }

    private class ComprarBebida implements ActionListener {
        Moneda mon;
        public ComprarBebida(Moneda moneda){
            mon=moneda;
        }
        public void actionPerformed(ActionEvent ae) {
            System.out.println(nombre);

            try {
                com =new Comprador(mon,tipo,exp);
            } catch (NoHayProductoException e) {
                throw new RuntimeException(e);
            } catch (PagoInsuficienteException e){
                throw new RuntimeException(e);
            } catch (PagoIncorrectoException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
