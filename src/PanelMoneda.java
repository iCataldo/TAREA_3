import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMoneda extends JPanel {

    int m;
    JButton mon = new JButton("moneda");
    public PanelMoneda() {
        super();
        FlowLayout derecha = new FlowLayout(FlowLayout.RIGHT);
        this.setLayout(derecha);
        colocarbutton();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setFont(new Font("arial",Font.PLAIN,20));
        g.drawString("$"+Integer.toString(m),mon.getX()-70,26);
    }
    public void colocarbutton(){
        mon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m=m+100;
                System.out.println(m);
            }
        });
        this.add(mon);
    }
    public int getM() {
        return m;
    }
}