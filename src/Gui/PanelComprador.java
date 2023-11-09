package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {

    private ButtonBeber drink= new ButtonBeber();
    private ButtonVuelto vuelto;
    private ButtonComprar comprar;

    public PanelComprador(monButton mon){
        vuelto= new ButtonVuelto(mon);;
        comprar=new ButtonComprar(drink,mon);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add(comprar);
        this.add(vuelto);
        this.add(drink);
    }

    public ButtonComprar getComprar() {
        return comprar;
    }

    public ButtonBeber getBeber() {
        return drink;
    }

    public ButtonVuelto getVuelto() {
        return vuelto;
    }

}
