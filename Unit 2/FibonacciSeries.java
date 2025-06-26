
// 0,1,1,2,3,5,8,13,21

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of series: ");
        int num = input.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

        input.close();
    }
}
// Enter the range of series: 
// 10
// 0 1 1 2 3 5 8 13 21 34 55 89 