
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class ventana extends JFrame {
    public JPanel panel;
    private monButton mon = new monButton();
    private ButtonBeber drink = new ButtonBeber();
    private PanelPrincipal pan = new PanelPrincipal(new Moneda1000());

    ventana(){
        this.setLayout(new BorderLayout());
        this.add(mon,BorderLayout.NORTH);
        this.add(pan,BorderLayout.CENTER);
        this.add(drink,BorderLayout.SOUTH);

        this.setSize(500, 330);

        this.setVisible(true);
        this.setTitle("Tarea_3");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void Boton(){
        JButton mon = new JButton();
        mon.setBounds(100,100,100,100);
        panel.add(mon);
    }

}
