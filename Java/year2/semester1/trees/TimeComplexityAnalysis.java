package Java.year2.semester1.trees;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TimeComplexityAnalysis {

    public static void main(String[] args) {
        // Generate one million random numbers
        ArrayList<Integer> randomNumbers = generateRandomNumbers(1000000);

        // Create BST and AVL Tree
        BST<Integer> bst = new BST<>();
        AVLTree<Integer> avlTree = new AVLTree<>();

        // Insert elements into BST and AVL Tree
        measureTime(() -> insertIntoBST(bst, randomNumbers), "BST Insertion");
        measureTime(() -> insertIntoAVLTree(avlTree, randomNumbers), "AVL Tree Insertion");

        // Shuffle the elements
        Collections.shuffle(randomNumbers);

        // Search for a random element in the same range
        int randomSearchElement = randomNumbers.get(new Random().nextInt(randomNumbers.size()));
        measureTime(() -> searchInBST(bst, randomSearchElement), "BST Search");
        measureTime(() -> searchInAVLTree(avlTree, randomSearchElement), "AVL Tree Search");
    }

    // Measure and print execution time
    private static void measureTime(Runnable task, String taskName) {
        long startTime = System.nanoTime();
        task.run();
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println(taskName + " Execution Time: " + executionTime + " nanoseconds");
    }

    // Generate a list of random numbers
    private static ArrayList<Integer> generateRandomNumbers(int count) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }

    // Insert elements into BST
    private static void insertIntoBST(BST<Integer> bst, ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            bst.insert(number);
        }
    }

    // Search for an element in BST
    private static void searchInBST(BST<Integer> bst, int target) {
        bst.search(target);
    }

    // Insert elements into AVL Tree
    private static void insertIntoAVLTree(AVLTree<Integer> avlTree, ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            avlTree.insert(number);
        }
    }

    // Search for an element in AVL Tree
    private static void searchInAVLTree(AVLTree<Integer> avlTree, int target) {
        avlTree.search(target);
    }
}
