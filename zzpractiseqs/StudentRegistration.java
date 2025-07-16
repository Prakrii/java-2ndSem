import javax.swing.*;
import java. awt.*;
public class StudentRegistration{
    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Student Registation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,700);

        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameTextField = new JTextField(20);

          JLabel emailLabel = new JLabel("Email: ");
        JTextField emailTextField = new JTextField(20);
        
                JLabel addressLabel = new JLabel("Address: ");
        JTextField addressTextField = new JTextField(20);

  JLabel genderLabel = new JLabel("Gender: ");

  JRadioButton gender1 = new JRadioButton("Male");
  JRadioButton gender2 = new JRadioButton("Female");

   Checkbox checkbox = new Checkbox("Agree to this app's terms and conditions");

   JButton button = new JButton("Submit");

   panel.add(nameLabel);
   panel.add(nameTextField);

 panel.add(emailLabel);
   panel.add(emailTextField);

    panel.add(addressLabel);
   panel.add(addressTextField);

    panel.add(genderLabel);
   panel.add(gender1);
   panel.add(gender2);

   panel.add(checkbox);

   panel.add(button);

   //adding panels in frame

   frame.add(panel);

   frame.setVisible(true);

    }
}