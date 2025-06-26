import javax.swing.*; 
// Imports Swing classes for GUI components like JFrame, JPanel, JLabel, JTextField, JButton, etc.

public class SimpleGUI { 
    // Class definition

    public static void main(String[] args) { 
        // Main method – entry point of the Java program

        JFrame frame = new JFrame("Simple GUI");
        // Creates a new window with the title "Simple GUI"

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Makes sure the program exits when the window is closed

        frame.setSize(300, 200);
        // Sets the size of the window to 300 pixels wide and 200 pixels high

        JPanel panel = new JPanel();
        // Creates a new panel to hold components (label, text field, button)

        JLabel label = new JLabel("Enter your name: ");
        // Creates a label that displays text: "Enter your name: "

        JTextField textField = new JTextField(20);
        // Creates a text field where the user can enter text; 20 columns wide

        JButton button = new JButton("Submit");
        // Creates a button labeled "Submit"

        button.addActionListener(e -> {
            // Adds an event listener to the button using a lambda expression
            String name = textField.getText();
            // Gets the text entered in the text field
            JOptionPane.showMessageDialog(frame, "Hello, " + name);
            // Displays a message dialog saying "Hello, [name]"
        });

        panel.add(label);
        // Adds the label to the panel

        panel.add(textField);
        // Adds the text field to the panel

        panel.add(button);
        // Adds the button to the panel

        frame.add(panel); 

        frame.setVisible(true);
        // Makes the frame visible on the screen
    }
}
