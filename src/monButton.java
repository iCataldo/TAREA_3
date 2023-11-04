import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monButton extends JPanel {
    private int m=0;
    private JLabel contador = new JLabel("$"+m);
    private JPanel panel = new JPanel();
    public monButton(){
        FlowLayout derecha = new FlowLayout(FlowLayout.RIGHT);
        this.setLayout(derecha);
        JButton mon = new JButton("moneda");
        this.add(contador);
        mon.addActionListener(new SumarMoneda());
        this.add(mon);
    }
    private class SumarMoneda implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            m=m+100;
            System.out.println("$"+m);
        }
    }
}
