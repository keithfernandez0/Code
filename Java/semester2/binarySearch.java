import java.util.Scanner;
import java.util.Random;

class BinarySearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random dice = new Random();
        int number = 1 + dice.nextInt(100);
        
        // start at 1; stop if counter is <= 100; and increment counter every time.

        for (int counter=1; counter<=100; counter++) {

            System.out.println("Enter your guess here: ");
            int guess = input.nextInt();           

            if (guess > number) {

                System.out.println("Your guess is too high. Try again.");
            }
            if (guess < number) {

                System.out.println("Your guess is too low. Try again.");
            }
            if (guess == number) {
                
                System.out.println("You won the game! Congratulations.");
                System.out.println("It took you " 
                        + counter 
                        + " guesses"
                        + " until you were correct.");
            break;
            }
        }     
    }
}