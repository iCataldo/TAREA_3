import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monButton extends JPanel {
    int m=0;
    private JLabel contador = new JLabel();
    DepositoM monedas = new DepositoM();
    private JPanel panel = new JPanel();
    public monButton(){
        JButton mon = new JButton("moneda");
        mon.addActionListener(new SumarMoneda());
        this.add(mon);
        contador.setText("$"+m);
        this.add(contador);
    }
    private class SumarMoneda implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            monedas.addMoneda();
            m = m +100;
            contador.setText("$"+String.valueOf(m));
            System.out.println("$"+m);
        }
    }


}

