import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {
    private static final int BALL_DIAMETER = 40;
    private int ballX = 50;
    private int ballY = 50;
    private int dragFromX = 0;
    private int dragFromY = 0;
    private boolean canDrag = false;
    private boolean autoMove = false;
    private Color ballColor = Color.yellow;

    public DragBallPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.blue);
        addMouseListener(this);
        addMouseMotionListener(this);
        new Thread(() -> {
            while (true) {
                if (autoMove) {
                    moveAutomatically();
                    repaint();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void moveAutomatically() {
        ballX += 2;
        ballY += 2;
        if (ballX <= 0 || ballX >= getWidth() - BALL_DIAMETER) {
            ballX = Math.max(0, Math.min(ballX, getWidth() - BALL_DIAMETER));
        }
        if (ballY <= 0 || ballY >= getHeight() - BALL_DIAMETER) {
            ballY = Math.max(0, Math.min(ballY, getHeight() - BALL_DIAMETER));
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(ballColor);
        g.fillOval(ballX, ballY, BALL_DIAMETER, BALL_DIAMETER);
        g.setColor(Color.white);
        g.drawString("Coordinates: (" + ballX + ", " + ballY + ")", 10, 20);
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x >= ballX && x <= (ballX + BALL_DIAMETER) && y >= ballY && y <= (ballY + BALL_DIAMETER)) {
            canDrag = true;
            dragFromX = x - ballX;
            dragFromY = y - ballY;
        } else {
            canDrag = false;
        }
        if (e.getButton() == MouseEvent.BUTTON1) {
            autoMove = !autoMove;
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            ballColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            repaint();
        }
    }
    public void mouseDragged(MouseEvent e) {
        if (canDrag) {
            ballX = e.getX() - dragFromX;
            ballY = e.getY() - dragFromY;
            ballX = Math.max(ballX, 0);
            ballX = Math.min(ballX, getWidth() - BALL_DIAMETER);
            ballY = Math.max(ballY, 0);
            ballY = Math.min(ballY, getHeight() - BALL_DIAMETER);
            repaint();
        }
    }
    public void mouseExited(MouseEvent e) {
        canDrag = false;
    }
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
}