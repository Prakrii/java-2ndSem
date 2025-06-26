
/* 1. Create a simple Java Swing application that opens a window with the title "Hello GUI". The window
should have a fixed size of 400x300 pixels and close when the user clicks the close button.
 */
import javax.swing.*;

public class HelloGUI {
   
    public static void main(String[] args) {
         JFrame jframe=new JFrame("Hello GUI");
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    jframe.setSize(400,300);
    jframe.setVisible(true);
    }
}
