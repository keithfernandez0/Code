// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 2, RECURSIVE THINKING
// FA23 CPS 2232-02
// 9/24/2023
// TowerOfHanoi.java
// ====================================================================================

package Java.year2.semester1.sorting_algorithms;
import java.util.Scanner;

public class TowerOfHanoi 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        System.out.println("The moves are:");

        long begin, end, time;

        begin = System.nanoTime();
        System.out.println("\n>> [Starting nanoTime() timer...]");
        moveDisks(n, 'A', 'B', 'C');
        end = System.nanoTime();
        System.out.println(">> [Ended nanoTime() timer.]");
        System.out.println(">> [Calculating time in nanoseconds...]\n");
        time = end - begin;

        System.out.println("It took " + time + " nanoseconds to solve the Tower of Hanoi puzzle with " + n + " disks.");
    }
		
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) 
    {
        if (n == 1) // Stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            
        else 
        {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
