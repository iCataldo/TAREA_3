import javax.swing.*;
import java.awt.*;

public class ButtonBeber extends JPanel {
    private String texto="Beber!";
    public ButtonBeber(){
        FlowLayout derecha = new FlowLayout(FlowLayout.RIGHT);
        this.setLayout(derecha);
        JButton mon = new JButton(texto);
        this.add(mon);
        this.setEnabled(false);
    }
}
