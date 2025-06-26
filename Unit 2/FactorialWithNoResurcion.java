import java.util.Scanner;

public class FactorialWithNoResurcion {
    public static void main(String[] args) {
        int fact=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        for (int i = 1; i <= num; i++) {
             fact=fact*i;
        }
        System.out.println("The factorial is: "+fact);

        input.close();
    }

}
// Enter a number: 
// 5
// The factorial is: 120
