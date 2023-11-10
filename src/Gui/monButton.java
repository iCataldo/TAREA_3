package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monButton extends JPanel {
    private JLabel contador = new JLabel();
    private DepositoM monedas = new DepositoM();
    private DepositoM vuelto = new DepositoM();
    public monButton(){
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton mon = new JButton("moneda");
        mon.addActionListener(new SumarMoneda());
        contador.setFont(new Font("arial",Font.PLAIN,20));
        contador.setForeground(Color.white);
        contador.setText("$"+monedas.Cantidad());
        this.add(contador);
        this.add(mon);
    }
    private class SumarMoneda implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            aumenarMoneda();

        }
    }
    public void aumenarMoneda(){
        monedas.addMoneda();
        contador.setText("$"+String.valueOf(monedas.Cantidad()));
        System.out.println(monedas.Cantidad());
    }

    public int getM() {
        return monedas.Cantidad();
    }
    public void comprar(int n){
        for (int i=0;i<monedas.Cantidad()-n;i=i+100){
            vuelto.addMoneda();
        }
        monedas=new DepositoM();
        contador.setText("$"+String.valueOf(monedas.Cantidad()));
    }
    public void Vuelto(){
        for (int i=0;i<vuelto.Cantidad();i=i+100){
            monedas.addMoneda();
        }
        vuelto=new DepositoM();
        contador.setText("$"+String.valueOf(monedas.Cantidad()));
    }

    public DepositoM getDepocito() {
        return monedas;
    }
}
