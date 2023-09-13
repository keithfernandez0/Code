// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 2, RECURSIVE THINKING
// FA23 CPS 2232-02
// 9/13/2023
// ====================================================================================

package Java.year2.chapter1;


public class LinearSearch 
{
    public static int LinearSearch(int[] list, int key) 
    {
      for (int i = 0; i < list.length; i++) 
      {
        if (key == list[i])
          return i;
      }
      return -1;
    }
  
    public static void main(String[] args) 
    {
        final int N = 100000;
        final int KEY = 150;
        int[] list = new int[N];

        for (int i =
         0; i < N; i++)
        {
            // GENERATOR FOR POSITIVE + NEGATIVE INTEGERS FROM -100 TO +100
            list [i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            // STD OUT: PRINT THE NUMBERS
            System.out.println(list[i] + ",");
        }

        // STOPWATCH CODE
        long begin, end, time;

        // START STOPWATCH
        begin = System.nanoTime();
        System.out.println("\n>> [Starting nanoTime() timer...]");
        System.out.println(">> [Program return status on LinearSearch(): " + LinearSearch(list, KEY) + "]");
        end = System.nanoTime();
        System.out.println(">> [Ended nanoTime() timer.]");
        System.out.println(">> [Calculating time in nanoseconds...]\n");
        time = end - begin;
        System.out.println("It took " + time + " nanoseconds to run LinearSearch() with the key " + KEY + " on the array of " + N + " elements.");
    }
  }
  