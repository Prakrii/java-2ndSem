import java.util.Scanner;

public class SmallestAndLargestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of array elements:");
        int n = input.nextInt();
        int[] arr = new int[100];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The largest element is: " + largest);

        input.close();
    }
}


// Enter number of array elements:
// 5
// Enter array elements:
// 12 
// 34
// 9
// 8
// 56
// The smallest element is: 8
// The largest element is: 56

