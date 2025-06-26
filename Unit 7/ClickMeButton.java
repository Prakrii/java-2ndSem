
/* 2. Create a Java Swing application that contains a JButton labeled "Click Me". When the button is
clicked, a message dialog should display "Button Clicked".
 */
import javax.swing.*;
public class ClickMeButton {
    public static void main(String[] args) {
       JFrame jframe=new JFrame("Button Demo");
       JPanel panel=new JPanel();
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

       JButton button = new JButton("Click Me");
       button.addActionListener(e ->{
        JOptionPane.showMessageDialog(jframe, "Button Clicked");
       });

       panel.add(button);
       jframe.add(panel);
       jframe.setSize(400,300);
       jframe.setVisible(true);
    }
}

