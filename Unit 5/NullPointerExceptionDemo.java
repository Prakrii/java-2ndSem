/* 2* Write a Java program that intentionally causes a NullPointerException. Catch the exception and print
a message indicating the error. */


public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String text = null; // Declare a String reference but do not initialize it

        try {
            // Attempting to call length() on a null object reference causes NullPointerException
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handle the exception and print a helpful message
            System.out.println("Exception caught: You tried to access a method on a null object.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

/*
 Exception caught: You tried to access a method on a null object.
Program continues after exception handling.
 */
