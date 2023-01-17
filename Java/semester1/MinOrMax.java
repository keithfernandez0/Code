package semester1;
import java.util.Scanner;
import java.lang.Math;

public class MinOrMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.println("Enter a first number: ");
        number1 = input.nextInt();
        System.out.println("Enter a second number: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("The lowest value is " + Math.min(number1, number2));
            System.out.println("The highest value is " + Math.max(number1, number2));
        }
        else if (number1 < number2) {
            System.out.println("The lowest value is " + Math.min(number1, number2));
            System.out.println("The highest value is " + Math.max(number1, number2));
        }
        else {
            System.out.print(number1 + " and " + number2 + " are equal\n");
        }

        input.close();
    }
}