// public class AvgArray {

//     public static void main(String[] args) {
//         int sumArray = 0;
//         float avg;
//         int[] array = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12, -100, 234 };
//         int i;
//         for (i = 0; i < array.length; i++) {
//             sumArray += array[i]; // or
//             // sumArray=sumArray+array[i];

//         }
//         System.out.println("The sum is" + sumArray);
//         avg = (float) sumArray / array.length;
//         System.out.println("The average is:" + avg);
//     }
// }

// Take input from the user

import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) {
        int[] myArray = new int[12];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < 12; j++) {
            System.out.println("Enter " + (j + 1) + " " + "Array");
            myArray[j] = input.nextInt();
        }

        // print the array
        for (int i = 0; i < 12; i++) {
            sum += myArray[i];
        }
        System.out.println("The sum is" + sum);
        System.out.println("Average is: " + sum/myArray.length);

        input.close();
    }

}
