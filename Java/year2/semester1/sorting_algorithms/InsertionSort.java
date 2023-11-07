// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: LAB 5 - SORTING ALGORITHM ANALYSIS
// FA23 CPS 2232-02
// 11/6/2023
// ====================================================================================

package Java.year2.semester1.sorting_algorithms;
import java.util.Random;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        long startTime = System.nanoTime(); // RECORD START TIME

        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }

        long endTime = System.nanoTime(); // RECORD END TIME
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static void main(String[] args) {
        int[] array10k = generateRandomArray(10000);
        int[] array100k = generateRandomArray(100000);
        int[] array1M = generateRandomArray(1000000);
        int[] array10M = generateRandomArray(10000000);

        System.out.println("\n>> Sorting array of 10k elements:");
        insertionSort(array10k);
        
        System.out.println("\n>> Sorting array of 100k elements:");
        insertionSort(array100k);

        System.out.println("\n>> Sorting array of 1M elements:");
        insertionSort(array1M);

        System.out.println("\n>> Sorting array of 10M elements:");
        insertionSort(array10M);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}

