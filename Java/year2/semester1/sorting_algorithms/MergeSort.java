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

public class MergeSort 
{
    public static void mergeSort(int[] arr) 
	{
        long startTime = System.nanoTime(); // RECORD START TIME

        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime(); // RECORD END TIME
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static void mergeSort(int[] arr, int left, int right) 
	{
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) 
	{
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) 
		{
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) 
		{
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) 
		{
            if (leftArray[i] <= rightArray[j]) 
			{
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) 
		{
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) 
		{
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) 
	{
        int[] array10k = generateRandomArray(10000);
        int[] array100k = generateRandomArray(100000);
        int[] array1M = generateRandomArray(1000000);
        int[] array10M = generateRandomArray(10000000);

        System.out.println("\n>> Sorting array of 10k elements...");
        mergeSort(array10k);

        System.out.println("\n>> Sorting array of 100k elements...");
        mergeSort(array100k);

        System.out.println("\n>> Sorting array of 1M elements...");
        mergeSort(array1M);

        System.out.println("\n>> Sorting array of 10M elements...");
        mergeSort(array10M);
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

