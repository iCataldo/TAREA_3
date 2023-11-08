import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private Expendedor exp = new Expendedor(3);
    private Comprador com;

    private PanelMoneda mon = new PanelMoneda();
    private ButtonBeber drink = new ButtonBeber();
    private PanelMatriz pan = new PanelMatriz(exp,mon);
    public PanelPrincipal(){
        this.setLayout(new BorderLayout());
        this.add(mon,BorderLayout.NORTH);
        this.add(pan,BorderLayout.CENTER);
        this.add(drink,BorderLayout.SOUTH);
    }

}
