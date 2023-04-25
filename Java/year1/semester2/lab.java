/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * Lab Assignment 1
 **************************************************************
 */

import java.util.Random;
import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        
        String str1 = "New";
        String str2 = "Jersey";
        String concatenatedStr = str1.concat(str2);
        System.out.println(concatenatedStr);
        String replacedStr = concatenatedStr.replace("Jersey", "York");
        System.out.println(replacedStr);

        Random random = new Random();
        int randInt = random.nextInt(26) + 65;
        char randChar = findChar(randInt);
        System.out.println("Random character: " + randChar);

        // ---------------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("Enter four integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        
        int min1 = findMinimum(num1, num2, num3);
        int min2 = findMinimum(num1, num2, num3, num4);
        System.out.println("Minimum of first three numbers: " + min1);
        System.out.println("Minimum of all four numbers: " + min2);

        input.close();
    }

    public static char findChar(int num) {
        return (char) num;
    }

    public static int findMinimum(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
    
    public static int findMinimum(int num1, int num2, int num3, int num4) {
        return Math.min(num1, Math.min(num2, Math.min(num3, num4)));
    }
}
