package Java.year2.semester1.trees;

public class BST<E extends Comparable<E>> implements Tree<E> 
{
    protected TreeNode<E> root;

    public static class TreeNode<E> 
    {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E e) 
        {
            element = e;
        }
    }

    // SEARCH METHOD
    public boolean search(E target) 
    {
        return searchHelper(root, target);
    }

    private boolean searchHelper(TreeNode<E> node, E target) 
    {
        if (node == null) 
        {
            return false;
        }

        int compareResult = target.compareTo(node.element);

        if (compareResult == 0) 
        {
            return true; // Found the target
        } 
        else if (compareResult < 0) 
        {
            return searchHelper(node.left, target); // Search in the left subtree
        } 
        else 
        {
            return searchHelper(node.right, target); // Search in the right subtree
        }
    }

    // INSERT METHOD
    public void insert(E element) 
    {
        root = insertHelper(root, element);
    }

    private TreeNode<E> insertHelper(TreeNode<E> node, E element) 
    {
        if (node == null) 
        {
            return new TreeNode<>(element);
        }

        int compareResult = element.compareTo(node.element);

        if (compareResult < 0) 
        {
            node.left = insertHelper(node.left, element); // Insert in the left subtree
        } 
        else if (compareResult > 0) 
        {
            node.right = insertHelper(node.right, element); // Insert in the right subtree
        }

        return node;
    }

    // REMOVE METHOD
    public void remove(E element) 
    {
        root = removeHelper(root, element);
    }

    private TreeNode<E> removeHelper(TreeNode<E> node, E element) 
    {
        if (node == null) 
        {
            return null;
        }

        int compareResult = element.compareTo(node.element);

        if (compareResult < 0) 
        {
            node.left = removeHelper(node.left, element); // Remove in the left subtree
        } 
        else if (compareResult > 0) 
        {
            node.right = removeHelper(node.right, element); // Remove in the right subtree
        } 
        else 
        {
            // Node to be removed found

            // Case 1: Node with only one child or no child
            if (node.left == null) 
            {
                return node.right;
            } 
            else if (node.right == null) 
            {
                return node.left;
            }

            // Case 2: Node with two children
            node.element = findMin(node.right).element;
            node.right = removeHelper(node.right, node.element);
        }

        return node;
    }

    private TreeNode<E> findMin(TreeNode<E> node) 
    {
        while (node.left != null) 
        {
            node = node.left;
        }
        return node;
    }

    // ADD OTHER METHODS (INORDER, ETC.) HERE
}

