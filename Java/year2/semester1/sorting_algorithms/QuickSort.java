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

public class QuickSort 
{
    public static void quickSort(int[] arr) 
	{
        long startTime = System.nanoTime(); // RECORD START TIME

        quickSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime(); // RECORD END TIME
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static void quickSort(int[] arr, int low, int high) 
	{
        if (low < high) 
		{
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) 
	{
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) 
		{
            if (arr[j] < pivot) 
			{
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) 
	{
        int[] array10k = generateRandomArray(10000);
        int[] array100k = generateRandomArray(100000);
        int[] array1M = generateRandomArray(1000000);
        int[] array10M = generateRandomArray(10000000);

        System.out.println("\n>> Sorting array of 10k elements...");
        quickSort(array10k);

        System.out.println("\n>> Sorting array of 100k elements...");
        quickSort(array100k);

        System.out.println("\n>> Sorting array of 1M elements...");
        quickSort(array1M);

        System.out.println("\n>> Sorting array of 10M elements...");
        quickSort(array10M);
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
