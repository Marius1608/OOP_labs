import javax.swing.*;
public class DragDemo extends JFrame {
    public DragDemo() {
        setTitle("Drag Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DragBallPanel());
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new DragDemo());
    }
}
