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

public class SelectionSort 
{
    public static void SelectionSort(double[] list) 
    {
        for (int i = 0; i < list.length - 1; i++) 
        {
            double currentMin = list[i];
            int currentMinIndex = i;
  
            for (int j = i + 1; j < list.length; j++) 
            {
                if (currentMin > list[j]) 
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
  
        if (currentMinIndex != i) 
        {
          list[currentMinIndex] = list[i];
          list[i] = currentMin;
        }
      }
    }

    public static void main(String[] args) 
    {
        final int N = 100000;
        double[] list = new double[N];

        for (int i = 0; i < N; i++) 
        {
            list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            System.out.println(list[i] + ",");
        }

        long begin, end, time;

        begin = System.nanoTime();
        System.out.println("\n>> [Starting nanoTime() timer...]");
        SelectionSort(list);
        end = System.nanoTime();
        System.out.println(">> [Ended nanoTime() timer.]");
        System.out.println(">> [Calculating time in nanoseconds...]\n");
        time = end - begin;
        System.out.println("It took " + time + " nanoseconds to run SelectionSort() on the array of " + N + " elements.");
    }

}
  