import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();
        if(num%2==0){
        System.out.println("Even");
        }
        else{
        System.out.println("Odd");

        }
        input.close();
    }
    
}

//output:
// Enter a number
//2
//Even

