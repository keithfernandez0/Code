package Java.year2.semester1.trees;
import java.util.*;

class BST<E extends Comparable<E>> {
    // node class that defines BST node
    class Node {
        E element;
        Node left, right;

        public Node(E data) {
            element = data;
            left = right = null;
        }
    }

    // BST root node
    Node root;

    // Constructor for BST =>initial empty tree
    BST() {
        root = null;
    }

    // Insert a node in BST
    void insert(E element) {
        root = insertRecursive(root, element);
    }

    // Recursive insert function
    Node insertRecursive(Node root, E element) {
        // tree is empty
        if (root == null) {
            root = new Node(element);
            return root;
        }
        // traverse the tree
        int compareResult = element.compareTo(root.element);
        if (compareResult < 0) // insert in the left subtree
            root.left = insertRecursive(root.left, element);
        else if (compareResult > 0) // insert in the right subtree
            root.right = insertRecursive(root.right, element);
        // return pointer
        return root;
    }

    // Method for inorder traversal of BST
    void inorder() {
        inorderRecursive(root);
    }

    // Recursively traverse the BST
    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.element + " ");
            inorderRecursive(root.right);
        }
    }

    // Returns an iterator for traversing the elements in a BST in preorder
    public Iterator<E> preorderIterator() {
        return new PreorderIterator(); // Create and return a new PreorderIterator
    }

    // Inner class PreorderIterator
    private class PreorderIterator implements Iterator<E> {
        // Store the elements in a list
        private List<E> list = new ArrayList<>();
        private int current = 0; // Point to the current element in list

        public PreorderIterator() {
            preorder(root); // Traverse binary tree and store elements in list
        }

        // Preorder traversal from a subtree
        private void preorder(Node root) {
            if (root != null) {
                list.add(root.element);
                preorder(root.left);
                preorder(root.right);
            }
        }

        // More elements for traversing?
        @Override
        public boolean hasNext() {
            return current < list.size();
        }

        // Get the current element and move to the next
        @Override
        public E next() {
            return list.get(current++);
        }

        // Optional: Implement the remove() method if needed
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    // Nested class Main for testing
    public static class Main {
        public static void main(String[] args) {
            // create a BST object
            BST<Integer> bst = new BST<>();
            // insert data into BST
            bst.insert(45);
            bst.insert(10);
            bst.insert(7);
            bst.insert(12);
            bst.insert(90);
            bst.insert(50);

            // print the BST inorder
            System.out.println("\nThe BST Created with input data (Inorder):");
            bst.inorder();

            // Test the preorderIterator() method
            System.out.println("\nThe BST elements using preorderIterator():");
            Iterator<Integer> preorderIterator = bst.preorderIterator();
            while (preorderIterator.hasNext()) {
                System.out.println(preorderIterator.next() + " ");
            }
        }
    }

    public void search(int target) {
    }
}
