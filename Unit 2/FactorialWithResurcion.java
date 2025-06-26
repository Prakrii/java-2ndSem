import java.util.Scanner;

public class FactorialWithResurcion {

    public static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int fact=fact(num);
    System.out.println("The factorial is: " + fact);

        input.close();
    }
}

// Enter a number
// 6
// The factorial is: 720
