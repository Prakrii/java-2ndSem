
/* 5. Write a Java program that handles multiple built-in exceptions. Use NumberFormatException and
ArrayIndexOutOfBoundsException in your program.
 */

public class DemoExceptions {
    
    public static void main(String[] args) {

         // Try block to handle NumberFormatException
        try{
// This will cause NumberFormatException because "String" is not a valid integer
            int number=Integer.parseInt("String");
        } catch (NumberFormatException error){
            System.out.println("Exception occurs: "+error);
        }
        int[] arr =new int[2];

         // Try block to handle ArrayIndexOutOfBoundsException
try{
 // Accessing index 3 which does not exist (valid indexes are 0 and 1)
System.out.println("array: "+arr[3]);
}catch(ArrayIndexOutOfBoundsException err){
System.out.println("Exception occurs: "+err);
}
    }
}

/* Output:
Exception occurs: java.lang.NumberFormatException: For input string: "String"
Exception occurs: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2

 */