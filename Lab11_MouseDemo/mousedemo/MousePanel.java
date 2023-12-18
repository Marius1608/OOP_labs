package mousedemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MousePanel extends JPanel implements MouseListener, MouseMotionListener {
    private int m_lastClickedX = 0;
    private int m_lastClickedY = 0;
    private int m_lastMovedX = 0;
    private int m_lastMovedY = 0;

    public MousePanel() {
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(200, 200));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Last click: x=" + m_lastClickedX + ", y=" + m_lastClickedY, 10, 30);

        // Only draw the mouse position if it's within the panel
        if (m_lastMovedX > 0 && m_lastMovedY > 0) {
            g.drawString("x=" + m_lastMovedX + ", y=" + m_lastMovedY, m_lastMovedX, m_lastMovedY);
        }
    }

    public void mouseClicked(MouseEvent e) {
        m_lastClickedX = e.getX();
        m_lastClickedY = e.getY();
        this.repaint();
    }

    public void mouseMoved(MouseEvent e) {
        m_lastMovedX = e.getX();
        m_lastMovedY = e.getY();
        this.repaint();
    }

    public void mouseExited(MouseEvent e) {
        // Clear the last moved coordinates when the mouse exits the panel
        m_lastMovedX = 0;
        m_lastMovedY = 0;
        this.repaint();
    }

    // Other mouse event methods (mouseDragged, mouseEntered, mousePressed, mouseReleased) can remain unchanged
    public void mouseDragged(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
