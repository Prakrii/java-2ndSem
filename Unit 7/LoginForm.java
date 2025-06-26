
/* 7. Create a simple Swing application that simulates a login form. The form should contain JTextField for
username, JPasswordField for password, and a JButton for submitting. When the button is clicked,
check if the username is "admin" and the password is "password". Display a message dialog
indicating success or failure. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 180);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Username components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        // Password components
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Login button
        JButton loginButton = new JButton("Login");

        // Action listener for login
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed. Invalid username or password.");
                }
            }
        });

        // Add components to panel
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel());  // Empty label for layout spacing
        panel.add(loginButton);

        // Add panel to frame and display
        frame.add(panel);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}

