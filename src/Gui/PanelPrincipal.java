package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private Expendedor exp = new Expendedor(3);
    private monButton mon = new monButton();
    private PanelComprador compra = new PanelComprador(mon,exp);
    private PanelExpendedor pan = new PanelExpendedor(mon,compra);
    public PanelPrincipal(){
        this.setLayout(new BorderLayout());
        pan.setBackground(Color.gray);
        mon.setBackground(Color.DARK_GRAY);
        compra.setBackground(Color.DARK_GRAY);
        this.add(mon,BorderLayout.NORTH);
        this.add(pan,BorderLayout.CENTER);
        this.add(compra,BorderLayout.SOUTH);
    }

}

