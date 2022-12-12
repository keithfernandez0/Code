package Java;
import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {

        int n;
        double sum = 0;
        int greaterThan = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the number of elements you want to store: ");
        n = input.nextInt();

        double[] array = new double[n];

        System.out.println("\nEnter the elements of the array: ");

        for (int i=0; i<n; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("\nSum of array elements are: ");

        for (double i : array) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("\nNumber of elements greater than the first: ");

        for (int i=0; i<array.length; i++) {
            if (array[0] < array[i]) {
                greaterThan += 1;
            }
        }

        System.out.println(greaterThan);

        System.out.println("\nAverage of elements is:\n" + (sum/array.length));
    }
}

