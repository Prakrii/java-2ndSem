
/* 6. Build a simple calculator application using Java Swing that allows the user to add, subtract, multiply,
and divide two numbers. Use JTextField for input and JButton for operations.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 5, 5));

        // Components
        JLabel label = new JLabel("Enter first number:");
        JTextField textFirst = new JTextField(10);

        JLabel label1 = new JLabel("Enter second number:");
        JTextField textSecond = new JTextField(10);

        JButton buttAdd = new JButton("+");
        JButton buttSubtract = new JButton("-");
        JButton buttMultiply = new JButton("*");
        JButton buttDivide = new JButton("/");

        JLabel resultLabel = new JLabel("Result: ");

        // Add ActionListeners
        ActionListener operation = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textFirst.getText());
                    double num2 = Double.parseDouble(textSecond.getText());
                    double result = 0;

                    if (e.getSource() == buttAdd) {
                        result = num1 + num2;
                    } else if (e.getSource() == buttSubtract) {
                        result = num1 - num2;
                    } else if (e.getSource() == buttMultiply) {
                        result = num1 * num2;
                    } else if (e.getSource() == buttDivide) {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            resultLabel.setText("Result: Cannot divide by 0");
                            return;
                        }
                    }

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Invalid input!");
                }
            }
        };

        // Attach the same listener to all buttons
        buttAdd.addActionListener(operation);
        buttSubtract.addActionListener(operation);
        buttMultiply.addActionListener(operation);
        buttDivide.addActionListener(operation);

        // Add components to panel
        panel.add(label);
        panel.add(textFirst);
        panel.add(label1);
        panel.add(textSecond);
        panel.add(buttAdd);
        panel.add(buttSubtract);
        panel.add(buttMultiply);
        panel.add(buttDivide);
        panel.add(resultLabel);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
