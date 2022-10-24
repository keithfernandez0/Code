package Java;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int num;
        char converted;

        System.out.println("Enter an ASCII code: ");
        num = input.nextInt();

        converted = (char)num;

        System.out.println("The character for ASCII code " + num + " is " + converted);

        input.close();
    }
}