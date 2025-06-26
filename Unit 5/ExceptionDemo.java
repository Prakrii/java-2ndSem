/* 
3* Write a Java program that demonstrates the difference between a checked and an unchecked
exception. Use FileNotFoundException for the checked exception and ArithmeticException for the
unchecked exception */

import java.io.File; //import File class to represent file and handle file oprations

import java.io.FileNotFoundException;// Import FileNotFoundException class to catch the checked exception thrown

import java.util.Scanner;


public class ExceptionDemo  {
    
    public static void main(String[] args){

// =============== Checked exception demo ===================

        try{
            // Create a File object representing a file named "Nonexistencefile.txt"
            File file=new File("nonexistencefile.txt");

            // Creating a scanner object to read from the file
            Scanner scanner = new Scanner(file);
// Print a message after opening the file (Wont print this message as we dont have this file)
System.out.println("File opened successfully");

 // Close the Scanner resource after use to free system resources
 scanner.close();

         } catch(FileNotFoundException e){
            // Print if the file is not found
            System.out.println("Checked exception caught: File not Found!");
         }

// =============== UnChecked exception demo ===================
// For example Arithmetic exception

try{
int a=10/0; //As 10/0 is a math error
System.out.println("Result: "+a);
}catch(ArithmeticException e){
    System.out.println("Unchecked exception caught: Division by zero!");
}

 // This message will print regardless of exceptions being caught above
        System.out.println("Program continues after handling exceptions.");


    }
}

/* Output:
Unchecked exception caught: Division by zero!
Program continues after handling exceptions.
 */