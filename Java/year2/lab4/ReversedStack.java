package Java.year2.lab4;
import java.util.*;

public class ReversedStack 
{
    // ITERATIVE METHOD TO REVERSE THE STACK
    public static <E extends Comparable<E>> Stack<E> iterativeReversedStack(Stack<E> stack) 
    {
        Stack<E> temp = new Stack<>();
        while (!stack.isEmpty()) // PUSH ALL ELEMENTS TO TEMP STACK
            temp.push(stack.pop());
        return temp;
    }

    // RECURSIVE METHOD TO REVERSE THE STACK
    public static <E extends Comparable<E>> Stack<E> recursiveReversedStack(Stack<E> stack) 
    {
        if (stack.isEmpty()) 
            return stack;
        
        E topElement = stack.pop();
        stack = recursiveReversedStack(stack);
        insertAtBottom(stack, topElement);
        return stack;
    }

    // HELPER METHOD TO INSERT ELEMENT AT BOTTOM OF STACK RECURSIVELY
    private static <E extends Comparable<E>> void insertAtBottom(Stack<E> stack, E element) 
    {
        if (stack.isEmpty()) 
            stack.push(element);
        else 
        {
            E topElement = stack.pop();
            insertAtBottom(stack, element);
            stack.push(topElement);
        }
    }

    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 100; i++)
            s.push(i);

        // MEASURE TIME FOR ITERATIVE REVERSAL
        long startTimeIterative = System.nanoTime();
        s = iterativeReversedStack(s);
        long endTimeIterative = System.nanoTime();
        System.out.println(">> Iterative reversed stack: " + s);
        System.out.println(">> Time taken for iterative reversal: " + (endTimeIterative - startTimeIterative) + " nanoseconds\n");

        // MEASURE TIME FOR RECURSIVE REVERSAL
        long startTimeRecursive = System.nanoTime();
        s = recursiveReversedStack(s);
        long endTimeRecursive = System.nanoTime();
        System.out.println(">> Recursive reversed stack: " + s);
        System.out.println(">> Time taken for recursive reversal: " + (endTimeRecursive - startTimeRecursive) + " nanoseconds");
    }
}
