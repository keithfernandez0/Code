package Java.year2.semester1.trees;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BST<E extends Comparable<E>> implements Iterable<E> {

    public static class TreeNode<E> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    private TreeNode<E> root;
    private int size;

    public void insert(E e) {
        // Implementation of the insert method
        // ...
    }

    public void addAll(List<E> elements) {
        for (E element : elements) {
            insert(element);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new BSTIterator();
    }

    private class BSTIterator implements Iterator<E> {
        private TreeNode<E> current;
        private java.util.Stack<TreeNode<E>> stack;
    
        public BSTIterator() {
            stack = new java.util.Stack<>();
            current = root;
            initializeStack();
        }
    
        private void initializeStack() {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
        }
    
        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }
    
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
    
            TreeNode<E> temp = stack.pop();
            current = temp.right;
            initializeStack();
    
            return temp.element;
        }
    }

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.addAll(List.of(5, 2, 8, 1, 3, 7, 9));

        // Use for-each loop
        for (Integer value : bst) {
            System.out.print(value + " ");
        }
    }
}

