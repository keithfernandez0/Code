package semester1;
import java.lang.Math;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int guess;
        int coin = (int)Math.round(Math.random());
        
        System.out.println("\nCoin flipper: 0 = heads, 1 = tails");
        System.out.println("Enter your guess (1 or 0): \n");
        guess = input.nextInt();

        switch (guess) {
            case 0:
                if (guess == coin) {
                    System.out.println("You guessed it!");
                }
                else {
                    System.out.println("Better luck next time!");
                }
                break;
            case 1:
                if (guess == coin) {
                    System.out.println("You guessed it!");
                }
                else {
                    System.out.println("Better luck next time!");
                }
                break;
            default:
                if (guess < 0 || guess > 1) {
                    System.out.println("Invalid input!");
                    System.exit(1);
                }
                System.exit(1);
        }
        input.close();
    }
    
}
