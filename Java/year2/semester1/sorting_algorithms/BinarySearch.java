// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 2, RECURSIVE THINKING
// FA23 CPS 2232-02
// 9/24/2023
// ====================================================================================


package Java.year2.semester1.sorting_algorithms;

public class BinarySearch 
{
    public static int BinarySearch(int[] list, int key) 
    {
        int low = 0;
        int high = list.length - 1;
  
        while (high >= low) 
        {
            int mid = (low + high) / 2;

            if (key < list[mid])
              high = mid - 1;

        else if (key == list[mid])
              return mid;

        else
          low = mid + 1;
        }
        return -low - 1;
    }
  
    public static void main(String[] args) 
    {
        final int N = 10000000;
        final int KEY = 150;
        int[] list = new int[N];

        for (int i = 0; i < N; i++)
        {
            // GENERATOR FOR POSITIVE + NEGATIVE INTEGERS FROM -100 TO +100
            list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            // STD OUT: PRINT THE NUMBERS
            System.out.println(list[i] + ",");
        }

        // STOPWATCH CODE
        long begin, end, time;

        // START STOPWATCH
        begin = System.nanoTime();
        System.out.println("\n>> [Starting nanoTime() timer...]");
        System.out.println(">> [Program return status on BinarySearch(): " + BinarySearch(list, KEY) + "]");
        end = System.nanoTime();
        System.out.println(">> [Ended nanoTime() timer.]");
        System.out.println(">> [Calculating time in nanoseconds...]\n");
        time = end - begin;
        System.out.println("It took " + time + " nanoseconds to run BinarySearch() with the key " + KEY + " on the array of " + N + " elements.");
    }
  }
  
