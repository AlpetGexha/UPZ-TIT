package Kollofjumi_2;

public class BST_TEST {
    BSTNode root;

    public BST_TEST() {
        root = null;
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
