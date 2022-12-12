package Java;
import java.util.Scanner;

public class LoopMethod {
    public static void main(String[] args) {

        int start, end;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start number: ");;
        start = input.nextInt();
        System.out.println("Enter end number: ");
        end = input.nextInt();

        System.out.println(printNums(start, end));

    }

    public static int printNums(int a, int b) {
        for (int i=a; i<=b; i++) {
            return i;
        }
    }
    
}
