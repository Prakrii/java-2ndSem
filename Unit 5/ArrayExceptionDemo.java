/*
 1* Write a Java program that demonstrates the basic concept of an exception. Create an array of size 5
and try to access the 10th element. Catch the exception and print an appropriate message.
 */

public class ArrayExceptionDemo  {
    public static void main(String[] args) {
          int[] numbers = new int[5]; // Array of size 5

        try {
            // Trying to access the 10th element (index 9)
            System.out.println("Accessing 10th element: " + numbers[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and print an appropriate message
            System.out.println("Exception caught: You tried to access an index outside the array bounds.");
        }

        System.out.println("Program continues after exception handling.");
    }
}


/*
 * Output
 * Exception caught: You tried to access an index outside the array bounds.
Program continues after exception handling.

 */