
package mousedemo;
import javax.swing.*;
public class MouseTest extends JApplet{ 

    public MouseTest() {
        add(new DualMousePanel()); 
    }
    public static void main(String[] args) {
        JFrame window = new JFrame("Mouse Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new DualMousePanel());
        window.pack();
        window.setVisible(true);
    }
}
