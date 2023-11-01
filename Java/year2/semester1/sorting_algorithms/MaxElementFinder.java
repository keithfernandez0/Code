// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 4, TIME COMPLEXITY AND EFFICIENT ALGORITHMS
// FA23 CPS 2232-02
// 10/22/2023
// MaxElementFinder.java
// ====================================================================================


package Java.year2.semester1.sorting_algorithms;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MaxElementFinder 
{
    public static void main(String[] args) 
    {
        int[] array = generateRandomArray(15);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int num : array) 
        {
            arrayList.add(num);
            linkedList.add(num);
        }

        // NAIVE METHOD
        long startTime = System.nanoTime();
        int maxNaiveArray = findMaxNaive(array);
        int maxNaiveArrayList = findMaxNaiveList(arrayList);
        int maxNaiveLinkedList = findMaxNaiveList(linkedList);
        long endTime = System.nanoTime();
        long naiveDuration = endTime - startTime;

        // DIVIDE-AND-CONQUER METHOD
        startTime = System.nanoTime();
        int maxDivideConquer = findMaxDivideConquer(array, 0, array.length - 1);
        endTime = System.nanoTime();
        long divideConquerDuration = endTime - startTime;

        System.out.println("\nMax using Naive Method with Array: " + maxNaiveArray);
        System.out.println("Max using Naive Method with ArrayList: " + maxNaiveArrayList);
        System.out.println("Max using Naive Method with LinkedList: " + maxNaiveLinkedList);
        System.out.println("Divide-and-Conquer Method Duration (ns): " + divideConquerDuration + "\n");
    }

    public static int findMaxNaive(int[] array) 
    {
        int max = array[0];
        for (int num : array) 
        {
            if (num > max) 
            {
                max = num;
            }
        }
        return max;
    }

    public static int findMaxNaiveList(List<Integer> list) 
    {
        int max = list.get(0);
        for (int num : list) 
        {
            if (num > max) 
            {
                max = num;
            }
        }
        return max;
    }

    public static int findMaxDivideConquer(int[] array, int low, int high) 
    {
        if (low == high) 
        {
            return array[low];
        }
        int mid = (low + high) / 2;
        int leftMax = findMaxDivideConquer(array, low, mid);
        int rightMax = findMaxDivideConquer(array, mid + 1, high);
        return Math.max(leftMax, rightMax);
    }

    public static int[] generateRandomArray(int size) 
    {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) 
        {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
