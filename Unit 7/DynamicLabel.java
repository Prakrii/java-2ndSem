    /* 3. Write a Java Swing application that contains a JLabel and a JTextField. When the user types in the
    text field, the label should update to display the text entered.
    */

    import javax.swing.*;

    public class DynamicLabel {
        
        public static void main(String[] args) {
            JFrame jframe = new JFrame("Dynamic label");
            jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
            jframe.setSize(400,300);
            JPanel panel = new JPanel();
           JLabel label=new JLabel();
            JTextField textfield = new JTextField(20);
            JButton button = new JButton("Submit");
button.addActionListener(e ->{
            String text = "";
    text = textfield.getText();
      label.setText("Text entered: " + text);
});
panel.add(label);
panel.add(textfield);   
panel.add(button);

jframe.add(panel);
jframe.setVisible(true);
        }
    }
