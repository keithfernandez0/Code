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
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        // INTEGER STACK
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Stack of Integers:");
        System.out.println("Is the stack empty? " + intStack.empty());
        System.out.println("Top element: " + intStack.peek());

        while (!intStack.empty()) {
            System.out.println("Popped: " + intStack.pop());
        }

        // STRING STACK
        Stack<String> stringStack = new Stack<>();
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        System.out.println("\nStack of Strings:");
        System.out.println("Is the stack empty? " + stringStack.empty());
        System.out.println("Top element: " + stringStack.peek());

        while (!stringStack.empty()) {
            System.out.println("Popped: " + stringStack.pop());
        }

        // PUSH(ITEM), SEARCH(ITEM)
        stringStack.push("Four");
        stringStack.push("Five");

        System.out.println("\nStack of Strings (after push):");
        System.out.println("Search for 'Four': " + stringStack.search("Four"));
        System.out.println("Search for 'One': " + stringStack.search("One"));
    }
}

