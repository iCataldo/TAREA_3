
import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {
    private PanelPrincipal panel =new PanelPrincipal();
    ventana(){

        this.add(panel);
        this.setSize(500, 330);
        this.setVisible(true);
        this.setTitle("Tarea_3");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
