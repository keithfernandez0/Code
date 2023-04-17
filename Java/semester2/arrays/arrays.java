
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int[] myList = new int[5];
        Scanner input = new Scanner(System.in);
        int nextNum;

        for (int i = 0; i < 5; i++) {

            nextNum = input.nextInt();
            myList[i] = nextNum;

            if (nextNum % 2 == 0) {
                System.out.println("Number is even.");

            }
            else {
                System.out.println("Number is odd.");
            }
        }

    }
    
}
