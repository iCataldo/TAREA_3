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
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton mon = new JButton("moneda");
        mon.addActionListener(new SumarMoneda());
        contador.setFont(new Font("arial",Font.PLAIN,20));
        contador.setText("$"+m);
        this.add(contador);
        this.add(mon);
    }
    private class SumarMoneda implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            aumenarMoneda();

        }
    }
    public void aumenarMoneda(){
        m = m +100;
        contador.setText("$"+String.valueOf(m));
        System.out.println(m);
    }
    public void reducirMoneda(int n){
        m = m -n;
        contador.setText("$"+String.valueOf(m));
        System.out.println(m);
    }
    public int getM() {
        return m;
    }

}
