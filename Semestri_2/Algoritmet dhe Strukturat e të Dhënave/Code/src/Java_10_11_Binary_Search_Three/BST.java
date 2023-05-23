package Java_10_11_Binary_Search_Three;

public class BST {

    BSTNode root;

    public BST() {
        root = null;
    }

    public void insert(int e) {
        BSTNode newNode = new BSTNode(e);
        if (root == null)
            root = newNode;
        else {
            BSTNode current = root;
            while (true) {
                if (e < current.key) {
                    if (current.left == null) {
                        current.left = newNode;
                        return;
                    } else
                        current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        return;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public BSTNode find(int k) {
        if (root == null)
            return null;
        BSTNode current = root;
        while (current.key != k) {
            if (k < current.key)
                current = current.left;
            else
                current = current.right;

            if (current == null)
                return null;
        }
        return current;
    }

    public boolean delete(int k) {
        if (root == null)
            return false;
        BSTNode curr = root;
        BSTNode parent = root;
        boolean isLeftChild = true;

        while (curr.key != k) {
            parent = curr;
            if (k < curr.key) {
                isLeftChild = true;
                curr = curr.left;
            } else {
                isLeftChild = false;
                curr = curr.right;
            }
            if (curr == null)
                return false;
        }

        if (curr.left == null && curr.right == null) {
            if (curr == root)
                root = null;
            else if (isLeftChild)
                parent.left = null;
            else
                parent.right = null;
        } else if (curr.left != null && curr.right == null) {
            if (curr == root) {
                root = curr.left;
            } else if (isLeftChild) {
                parent.left = curr.left;
            } else {
                parent.right = curr.left;
            }
        } else if (curr.left == null && curr.right != null) {
            if (curr == root) {
                root = curr.right;
            } else if (isLeftChild) {
                parent.left = curr.right;
            } else {
                parent.right = curr.right;
            }
        } else {
            BSTNode successor = getSuccessor(curr);
            if (curr == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = curr.left;
        }
        return true;
    }

    private BSTNode getSuccessor(BSTNode delNode) {
        BSTNode successorParent = delNode;
        BSTNode successor = delNode;
        BSTNode curr = delNode.right;
        while (curr != null) {
            successorParent = successor;
            successor = curr;
            curr = curr.left;
        }
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
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