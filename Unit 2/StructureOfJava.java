// Importing necessary packages (optional)
import java.util.Scanner; // Example of importing a package

// Main class definition
public class StructureOfJava {

    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Program logic goes here
        System.out.println("Hello, World!");  // Printing a message to the console
        
        // Example of using a scanner to get input from the user (optional)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        scanner.close();
    }
}
