// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 2, RECURSIVE THINKING
// FA23 CPS 2232-02
// 9/24/2023
// ====================================================================================

package Java.year2.chapter1;

public class RecursiveSelectionSort 
{
    public static void recursiveSelectionSort(double[] list, int startIndex) 
    {
        if (startIndex >= list.length - 1) 
        {
            return;
        }

        int minIndex = startIndex;
        for (int j = startIndex + 1; j < list.length; j++) 
        {
            if (list[j] < list[minIndex]) 
            {
                minIndex = j;
            }
        }

        if (minIndex != startIndex) 
        {
            double temp = list[startIndex];
            list[startIndex] = list[minIndex];
            list[minIndex] = temp;
        }

        recursiveSelectionSort(list, startIndex + 1);
    }

    public static void main(String[] args) 
    {
        final int N = 10000;
        double[] list = new double[N];

        for (int i = 0; i < N; i++) 
        {
            list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            System.out.println(list[i] + ",");
        }

        long begin, end, time;

        begin = System.nanoTime();
        System.out.println("\n>> [Starting nanoTime() timer...]");
        recursiveSelectionSort(list, 0);
        end = System.nanoTime();
        System.out.println(">> [Ended nanoTime() timer.]");
        System.out.println(">> [Calculating time in nanoseconds...]\n");
        time = end - begin;
        System.out.println("It took " + time + " nanoseconds to run RecursiveSelectionSort() on the array of " + N + " elements.");
    }
}
