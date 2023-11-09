package Gui;

import javax.swing.*;

public class ventana extends JFrame {
    private PanelPrincipal panel =new PanelPrincipal();
    public ventana(){

        this.add(panel);
        this.setLocationRelativeTo(null );
        this.setSize(500, 330);
        this.setVisible(true);
        this.setTitle("Tarea_3");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
