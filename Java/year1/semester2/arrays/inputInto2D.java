
import java.util.Scanner;
import java.util.Arrays;

public class inputInto2D {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        System.out.println("\nInitialized matrix:");
        System.out.println(Arrays.deepToString(matrix) + "\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns:\n");

        for (int row=0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("\nFinalized matrix:");
        System.out.println(Arrays.deepToString(matrix));

        input.close();

    }
    
}
