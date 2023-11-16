package Java.year2.semester1.trees;

import java.util.*;

class BST<E extends Comparable<E>> implements Collection<E> {

    private static class TreeNode<E> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    private TreeNode<E> root;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return search(root, (E) o);
    }

    @Override
    public Iterator<E> iterator() {
        List<E> elements = new ArrayList<>();
        inOrderTraversal(root, elements);
        return elements.iterator();
    }

    @Override
    public Object[] toArray() {
        List<E> elements = new ArrayList<>();
        inOrderTraversal(root, elements);
        return elements.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        List<E> elements = new ArrayList<>();
        inOrderTraversal(root, elements);
        return elements.toArray(a);
    }

    @Override
    public boolean add(E e) {
        root = insert(root, e);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        // Implement your remove method
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // Implement your containsAll method
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E element : c) {
            add(element);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // Implement your removeAll method
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // Implement your retainAll method
        return false;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    // Additional BST methods (insert, search, etc.) go here

    private TreeNode<E> insert(TreeNode<E> root, E e) {
        if (root == null) {
            return new TreeNode<>(e);
        }

        if (e.compareTo(root.element) < 0) {
            root.left = insert(root.left, e);
        } else if (e.compareTo(root.element) > 0) {
            root.right = insert(root.right, e);
        }

        return root;
    }

    private boolean search(TreeNode<E> root, E target) {
        if (root == null) {
            return false;
        }

        int cmp = target.compareTo(root.element);
        if (cmp < 0) {
            return search(root.left, target);
        } else if (cmp > 0) {
            return search(root.right, target);
        } else {
            return true; // Found the element
        }
    }

    private void inOrderTraversal(TreeNode<E> node, List<E> elements) {
        if (node != null) {
            inOrderTraversal(node.left, elements);
            elements.add(node.element);
            inOrderTraversal(node.right, elements);
        }
    }

    public class BSTExample {
        public static void main(String[] args) {
            // Create a BST instance
            BST<Integer> bst = new BST<>();
    
            // Insert elements into the BST
            bst.add(10);
            bst.add(5);
            bst.add(15);
            bst.add(3);
            bst.add(7);
            bst.add(12);
            bst.add(18);
    
            // Print the BST
            System.out.println("BST elements: " + bst);
    
            // Apply methods from Collections class
            System.out.println("Value of maximum element in the tree is: " + Collections.max(bst));
            System.out.println("Value of minimum element in the tree is: " + Collections.min(bst));
            System.out.println("Value 10 is in the tree: " + bst.contains(10));
            System.out.println("Value 4 is in the tree: " + bst.contains(4));
        }
    }
}
