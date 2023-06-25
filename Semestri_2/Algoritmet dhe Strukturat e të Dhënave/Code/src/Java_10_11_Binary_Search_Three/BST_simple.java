package Java_10_11_Binary_Search_Three;

public class BST_simple {
    private final BSTNode root;

    public BST_simple() {
        this.root = null;
    }

    public void insert(int e) {
        insertRecursive(this.root, e);
    }

    private BSTNode insertRecursive(BSTNode root, int element) {
        if (root == null) {
            return new BSTNode(element);
        }

        if (element < root.key)
            root.left = insertRecursive(root.left, element);
        else if (element > root.key)
            root.right = insertRecursive(root.right, element);

        return root;
    }


    public void find(int k) {
        findRecursive(this.root, k);
    }

    private BSTNode findRecursive(BSTNode root, int k) {
        if (root == null || root.key == k)
            return root;

        if (k < root.key)
            return findRecursive(root.left, k);
        else
            return findRecursive(root.right, k);
    }


    public BSTNode deleteRecursive(BSTNode root, int k) {
        if (root == null)
            return null;

        if (k < root.key) {
            root.left = deleteRecursive(root.left, k);
        } else if (k > root.key) {
            root.right = deleteRecursive(root.right, k);
        } else {
            // Node to delete found
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node has two children
            root.key = getMinValue(root.right);
            root.right = deleteRecursive(root.right, root.key);
        }

        return root;
    }

    private int getMinValue(BSTNode node) {
        int minValue = node.key;
        while (node.left != null) {
            minValue = node.left.key;
            node = node.left;
        }
        return minValue;
    }


    public void preorder(BSTNode r) {
        System.out.print(r.key + " ");
        if (r.left != null)
            preorder(r.left);
        if (r.right != null)
            preorder(r.right);
    }

    public void inorder(BSTNode r) {
        if (r.left != null)
            inorder(r.left);
        System.out.print(r.key + " ");
        if (r.right != null)
            inorder(r.right);
    }

    public void postorder(BSTNode r) {
        if (r.left != null)
            postorder(r.left);
        if (r.right != null)
            postorder(r.right);
        System.out.print(r.key + " ");
    }

    public class BSTNode {
        int key;
        BSTNode left, right;

        public BSTNode(int k) {
            key = k;
            left = right = null;
        }
    }
}