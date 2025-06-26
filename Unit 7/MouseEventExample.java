import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;

public class MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse EventExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at(" + e.getX() + ", " + e.getY() + ")");

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released at(" + e.getX() + ", " + e.getY() + ")");
            }
        });
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}