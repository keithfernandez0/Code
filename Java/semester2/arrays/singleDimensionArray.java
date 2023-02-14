/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * Lab Assignment 2
 **************************************************************
 */

package semester2.arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class singleDimensionArray {
    public static void main(String[] args) {

        int[] myList = {45, 30, 12, 23, 8};
        for (int i = 0; i < myList.length; i++) {
            int total = myList[i];
            System.out.println("Total: " + total + "    i: " + i);
        }
        System.out.println("");

        // ===============================================================

        String[] myStrings = {"Cat", "Dog", "Rat", "Ant", "Lion"};
        String temp = myStrings[0];

        for (int i = 1; i < myStrings.length; i++) {
            myStrings[i-1] = myStrings[i];
            System.out.println("i: " + i + "    String: " + myStrings[i]);
        }
        temp = myStrings[myStrings.length-1];
        System.out.println("Final temp var: " + temp +'\n');

        // ===============================================================

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter number of employees: ");
        int numOfEmployees = input.nextInt();
        int[] salary = new int[numOfEmployees];
        
        System.out.print("Enter minimum salary: ");
        int minSalary = input.nextInt();

        System.out.print("Enter maximum salary: ");
        int maxSalary = input.nextInt();
        
        for (int i = 0; i < numOfEmployees; i++) {
            salary[i] = rand.nextInt((maxSalary - minSalary) + 1) + minSalary;
        }
        
        int total = 0;
        for (int i = 0; i < numOfEmployees; i++) {
            total += salary[i];
        }
        
        double averageSalary = (double)total / numOfEmployees;
        System.out.println("The average salary of employees is: " + averageSalary);

        System.out.println("");

        // ===============================================================

        char[] sample = {'D', 'G', 'S', 'A', 'C'};

        for (int i = 0; i < sample.length; i++) {
            int j = (int)(Math.random() * sample.length);
            char tmp = sample[i];
            sample[i] = sample[j];
            sample[j] = tmp;

            System.out.println("Char: " + sample[i] + "  i: " + i + "   tmp: " + tmp);
        }

        System.out.println("");

        // ===============================================================

        int[] arr = new int[6];
        
        // Generate random values for the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);
        }
        
        int[] firstThree = new int[3];
        int[] lastThree = new int[3];
        
        // Copy first 3 elements of the array into firstThree array
        System.arraycopy(arr, 0, firstThree, 0, 3);
        System.out.println("First three elements: " + Arrays.toString(firstThree));
        
        // Copy last 3 elements of the array into lastThree array
        System.arraycopy(arr, 3, lastThree, 0, 3);
        System.out.println("Last three elements: " + Arrays.toString(lastThree));
        
        System.out.print("Enter a number between 1 and 10: ");
        int number = input.nextInt();
        
        // Search for the number in the array
        int result = Arrays.binarySearch(arr, number);
        if (result >= 0) {
            System.out.println("Your number is present!");
        } 
        else {
            System.out.println("Your number is not present!");

        }

    }
}