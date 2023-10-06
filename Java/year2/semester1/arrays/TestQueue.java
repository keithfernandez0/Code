// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// ====================================================================================


package Java.year2.semester1.arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue 
{
    public static void main(String[] args) 
    {
        // CREATE A LINKEDLIST OF INTEGERS
        Queue<Integer> intQueue = new LinkedList<>();

        // ADD ELEMENTS
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        // ELEMENT() - RETURNS THE HEAD OF THE QUEUE
        System.out.println("Element at the head of the queue: " + intQueue.element());

        // OFFER(E E) - ADDS ELEMENT TO THE TAIL OF THE QUEUE
        intQueue.offer(4);

        // PEEK() - RETRIEVES BUT DOES NOT REMOVE THE HEAD OF THE QUEUE
        System.out.println("Peek at the head of the queue: " + intQueue.peek());

        // POLL() - RETRIEVES AND REMOVES THE HEAD OF THE QUEUE
        System.out.println("Popped element: " + intQueue.poll());

        // REMOVE() - RETRIEVES AND REMOVES THE HEAD OF THE QUEUE
        System.out.println("Popped element: " + intQueue.remove());
    }
}
