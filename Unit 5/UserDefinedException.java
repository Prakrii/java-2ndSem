
/* 6. Write a Java program that creates a user-defined exception called InvalidAgeException. This
exception should be thrown if the age provided is less than 18. Create a method that validates the
age and throws this exception if the condition is met.
 */

//  First ma hamile custom exception banauna ko lagi subclass banauna parxa superclass: Exception bata:
 class InvalidAgeException extends Exception{

    // String message chahi paxi exception ma message pass garna ko lagi for eg: "Age is not valid"
    public InvalidAgeException(String message){
        // Constructor of string message
        super(message);
    }
 }


public class UserDefinedException {
   
    static void validate(int age) throws InvalidAgeException{
        if (age<18) {
            
throw new InvalidAgeException("Age is not valid: "+age);
       } else{
        System.out.println("Age is valid");
       }
    }
    public static void main(String[] args) {
        try{
            validate(17);
        
        }catch(InvalidAgeException e){
            System.out.println("Caught the exception: "+e);
        }
        System.out.println("Continue the code..");
       }

}
/* 
Output:
Caught the exception: Age is not valid: 17
Continue the code.. 
*/
