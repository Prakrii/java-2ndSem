import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter breadth");
        int breadth=input.nextInt();
        System.out.println("Enter length");

        int length=input.nextInt();
System.out.println("The area of ractangle is: "+length*breadth);

input.close();
    }
}
//outuput:
//Enter breadth
//2
//Enter length
//3
//The area of ractangle is: 6
