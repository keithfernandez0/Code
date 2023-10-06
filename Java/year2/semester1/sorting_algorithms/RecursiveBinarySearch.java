// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 2, RECURSIVE THINKING
// FA23 CPS 2232-02
// 9/24/2023
// RecursiveBinarySearch.java
// ====================================================================================


package Java.year2.chapter1;

public class RecursiveBinarySearch 
{
    public static int recursiveBinarySearch(int[] list, int key, int low, int high) 
    {
        if (low <= high) 
        {
            int mid = (low + high) / 2;

            if (key < list[mid])
                return recursiveBinarySearch(list, key, low, mid - 1);
            else if (key == list[mid])
                return mid;
            else
                return recursiveBinarySearch(list, key, mid + 1, high);
        }
        return -low - 1;
    }

    public static int search(int[] list, int key) 
    {
        return recursiveBinarySearch(list, key, 0, list.length - 1);
    }

    public static void main(String[] args) 
    {
        final int N = 10000000;
        final int KEY = 150;
        int[] list = new int[N];

        for (int i = 0; i < N; i++) 
        {
            list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            System.out.println(list[i] + ",");
        }

        long begin, end, time;

        begin = System.nanoTime();
        System.out.println("\n>> [Starting nanoTime() timer...]");
        System.out.println(">> [Program return status on RecursiveBinarySearch(): " + search(list, KEY) + "]");
        end = System.nanoTime();
        System.out.println(">> [Ended nanoTime() timer.]");
        System.out.println(">> [Calculating time in nanoseconds...]\n");
        time = end - begin;
        System.out.println("It took " + time + " nanoseconds to run RecursiveBinarySearch() with the key " + KEY + " on the array of " + N + " elements.");
    }
}

