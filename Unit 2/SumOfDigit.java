
import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
int sum=0;
int num=input.nextInt();
while(num!=0){
    sum += num %10;
     num /= 10;
}
    System.out.println("The sum is "+sum);
    input.close();
    }
}

