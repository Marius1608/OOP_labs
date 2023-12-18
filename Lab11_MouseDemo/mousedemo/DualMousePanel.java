package mousedemo;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
class DualMousePanel extends JPanel {
    public DualMousePanel() {

        MousePanel mp1 = new MousePanel();
        MousePanel mp2 = new MousePanel();
        Border etched = BorderFactory.createEtchedBorder();
        mp1.setBorder(BorderFactory.createTitledBorder(etched, "Panel 1"));
        mp2.setBorder(BorderFactory.createTitledBorder(etched, "Panel 2"));

        this.setLayout(new GridLayout(1, 2));
        this.add(mp1);
        this.add(mp2);
    }
}
