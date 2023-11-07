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

public class BubbleSort 
{
    public static void bubbleSort(int[] arr) 
	{
        long startTime = System.nanoTime(); // RECORD START TIME

        int n = arr.length;
        boolean swapped;
        do 
		{
            swapped = false;
            for (int i = 1; i < n; i++) 
			{
                if (arr[i - 1] > arr[i]) 
				{
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        long endTime = System.nanoTime(); // RECORD END TIME
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static void main(String[] args) 
	{
        int[] array10k = generateRandomArray(10000);
        int[] array100k = generateRandomArray(100000);
        int[] array1M = generateRandomArray(1000000);
        int[] array10M = generateRandomArray(10000000);

        System.out.println("\n>> Sorting array of 10k elements...");
        bubbleSort(array10k);

        System.out.println("\n>> Sorting array of 100k elements...");
        bubbleSort(array100k);

        System.out.println("\n>> Sorting array of 1M elements...");
        bubbleSort(array1M);

        System.out.println("\n>> Sorting array of 10M elements...");
        bubbleSort(array10M);
    }

    public static int[] generateRandomArray(int size) 
	{
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) 
		{
            array[i] = random.nextInt();
        }
        return array;
    }
}
