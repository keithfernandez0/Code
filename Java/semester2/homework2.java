/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * HW Assignment 2
 **************************************************************
 */

import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get number of rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Step 2: Create 2D array and store random values
        int[][] arr = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(451) + 50; // generate random value in range 50-500
            }
        }

        // Step 3: Print the 2D array
        System.out.println("2D Array:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Step 4: Call findAverage method
        findAverage(arr);

        // Step 5: Call getArray method and print the returned array
        int[][] newArr = getArray(arr);
        System.out.println("Modified 2D Array:");
        for (int[] row : newArr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Method to find average of a row
    public static void findAverage(int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number to find average: ");
        int row = input.nextInt();

        // Check if row number is valid
        if (row < 0 || row >= arr.length) {
            System.out.println("Invalid row number!");
            return;
        }

        int sum = 0;
        for (int val : arr[row]) {
            sum += val;
        }
        double avg = (double) sum / arr[row].length;

        System.out.println("Average of row " + row + ": " + avg);
    }

    // Method to multiply odd values by 2 and return the modified array
    public static int[][] getArray(int[][] arr) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) { // check if value is odd
                    newArr[i][j] = arr[i][j] * 2; // multiply odd value by 2
                } else {
                    newArr[i][j] = arr[i][j]; // copy even value as is
                }
            }
        }
        return newArr;
    }
}

