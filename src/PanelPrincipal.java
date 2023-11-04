import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    private Expendedor exp;
    public PanelPrincipal(Moneda moneda){

        FlowLayout izquierda = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(izquierda);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        panel.add(new ButtonBebida("Coca",exp.COCA,moneda));
        panel.add(new ButtonBebida("Sprite",exp.SPRITE,moneda));
        panel.add(new ButtonBebida("Super 8",exp.SUPER8,moneda));
        panel.add(new ButtonBebida("Sniker",exp.SNICKERS,moneda));
        panel.add(new JButton("Nada"));
        panel.add(new JButton("nada2"));
        this.add(panel);
    }

}
