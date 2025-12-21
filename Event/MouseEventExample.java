
import java.awt.event.*;
import javax.swing.*;
class MouseEventExample implements MouseListener {
    public MouseEventExample() {
        JFrame f = new JFrame("Mouse Event");
        f.addMouseListener(this);
        f.setSize(300, 200);
        f.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }
    @Override
    public void mousePressed(MouseEvent e) { System.out.println("Mounse Pressed."); }
    @Override
    public void mouseReleased(MouseEvent e) {System.out.println("Mounse Released."); }
    @Override
    public void mouseEntered(MouseEvent e) { System.out.println("Mounse Entered."); }
    @Override
    public void mouseExited(MouseEvent e) { System.out.println("Mounse Exited."); }
    public static void main(String[] args) {
        new MouseEventExample();
    }
}

