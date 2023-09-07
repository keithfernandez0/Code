package Java.year2.chapter1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("Are you having a good day today? [y/n]");
        answer = input.next();

        if (answer.equals("y")) {
            System.out.println("Then have a great day.");
        }
        else if (answer.equals("n")) {
            System.out.println("Then I hope your day gets better.");
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }
    }
}
