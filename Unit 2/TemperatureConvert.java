// °F=°C×5/9+32
//5/9(F-32)

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter celcius to convert into fahrenheit :");
        double c = input.nextInt();
        double f = c * (9.0 / 5) + 32;
        System.out.println("The Fahrenheit of " + c + "°C" + " " + "is:" + f + "F");

        System.out.println("Enter fahrenheit to convert into celcius :");
        double fer = input.nextInt();
        double cel = (5.0 / 9) * (fer - 32);
        System.out.println("The celcius of " + fer + "F" + " " + "is:" + cel + "°C");
input.close();
    }
}
