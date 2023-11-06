// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: RADIX AND HEAP SORT
// FA23 CPS 2232-02
// 11/5/2023
// ====================================================================================

package Java.year2.semester1.sorting_algorithms;

import java.util.Arrays;
import java.util.Random;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);
        long startTime = System.nanoTime();
        radixSort(arr);
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1000000; // CONVERT TO MILLISECONDS
        System.out.println("Radix Sort Execution Time: " + executionTime + " ms");
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000); // ADJUST THE RANGE AS NEEDED
        }
        return arr;
    }

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    public static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}