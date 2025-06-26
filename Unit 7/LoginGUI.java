import javax.swing.*;

public class LoginGUI {

    public static void main(String[] args) {

        JFrame jframe = new JFrame("Login GUI");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(300, 400);

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("UserName"); 
        JTextField textField1 = new JTextField(20);
        JLabel label2 = new JLabel("Password");
        JTextField textField2 = new JTextField(20);

        JButton button = new JButton("Login");

        button.addActionListener(e -> {
            // String pass=pass;
            // String id=id;
            String username=textField1.getText();
            String passowrd=textField2.getText();
            if(username.equals("admin") && passowrd.equals("pass")){
            System.out.println("YEs");
                 JOptionPane.showMessageDialog(jframe, "LoggedIn successfully " + "UserName: "+username +"Password is: "+passowrd);
            }
            else
            {
                System.out.println("No");
                JOptionPane.showMessageDialog(jframe, "Please enter correct Username or Password ");
                }

                
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        jframe.add(panel);
        panel.add(button);
        jframe.add(panel);
        

        jframe.setVisible(true);

    }
}
