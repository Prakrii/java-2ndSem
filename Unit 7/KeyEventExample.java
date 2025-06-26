import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class KeyEventExample{
    public static void main(String[] args) {
        JFrame frame=new JFrame("Keyboard Event Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        frame.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println("Key Pressed "+ e.getKeyChar());
            }
             @Override
            public void keyReleased(KeyEvent e){
                System.out.println("Key Released "+ e.getKeyChar());
            }
        });
   frame.setSize(400,300);
   frame.setVisible(true);
    }


}

