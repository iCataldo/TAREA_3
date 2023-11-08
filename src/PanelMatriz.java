import javax.swing.*;
import java.awt.*;

public class PanelMatriz extends JPanel {
    public PanelMatriz(Expendedor exp, PanelMoneda mon){
        FlowLayout izquierda = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(izquierda);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        panel.add(new ButtonBebida_Coca(exp,mon.getM()));
        panel.add(new ButtonBebida_Coca(exp, mon.getM()));
        panel.add(new ButtonBebida_Coca(exp, mon.getM()));
        panel.add(new ButtonBebida_Coca(exp, mon.getM()));
        panel.add(new JButton("Nada_0"));
        panel.add(new JButton("Nada_1"));
        panel.add(new JButton("Nada_2"));
        panel.add(new JButton("Nada_3"));
        this.add(panel);
    }
}
