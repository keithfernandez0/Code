package Java.year2.semester1.trees;

class AVLTree {
    class Node {
        char data;
        Node left, right;
        int height;

        public Node(char d) {
            data = d;
            height = 1;
        }
    }

    Node root;

    void AVLTree() {
        root = null;
    }

    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    Node insert(Node node, char data) {
        if (node == null)
            return (new Node(data));
        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        else
            return node;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);
        if (balance > 1 && data < node.left.data)
            return rightRotate(node);
        if (balance < -1 && data > node.right.data)
            return leftRotate(node);
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        // Inserting nodes into AVL tree
        avlTree.root = avlTree.insert(avlTree.root, 'Y');
        avlTree.root = avlTree.insert(avlTree.root, 'X');
        avlTree.root = avlTree.insert(avlTree.root, 'Z');

        // Creating additional nodes x, y, z
        AVLTree.Node x = avlTree.new Node('X');
        AVLTree.Node y = avlTree.new Node('Y');
        AVLTree.Node z = avlTree.new Node('Z');

        // Attaching nodes to the AVL tree
        y.left = x;
        y.right = z;

        // Traversing the AVL tree in different ways
        System.out.println("\n");
        System.out.println("Preorder Traversal:");
        avlTree.preOrder(avlTree.root);

        System.out.println("\nInorder Traversal:");
        avlTree.inOrder(avlTree.root);

        System.out.println("\nPostorder Traversal:");
        avlTree.postOrder(avlTree.root);
        System.out.println("\n");
    }
}
