/* 5. Create a Java Swing application that contains a JTextField. Use a KeyListener to detect when a key
is typed, and display the typed character in a JLabel.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextFieldExample {
    public static void main(String[] args) {

        JFrame frame=new JFrame("GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        JPanel panel=new JPanel();

    
        JTextField textField=new JTextField(20);
        JLabel label=new JLabel("Typed character");
        textField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                  char typedChar = e.getKeyChar();
                label.setText("Typed Character: " + typedChar);
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Type here:"));
        frame.add(textField);
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}
