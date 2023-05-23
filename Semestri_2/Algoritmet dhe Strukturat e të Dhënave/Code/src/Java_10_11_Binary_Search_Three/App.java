package Java_10_11_Binary_Search_Three;

public class App {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(5);
		tree.insert(3);
		tree.insert(8);
		tree.insert(11);
		tree.insert(15);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		System.out.println("find: " + tree.find(4).key);
		System.out.println("Traversing");
		System.out.println("preorder: ");
		tree.preorder(tree.root);
		System.out.println("\ninorder: ");
		tree.inorder(tree.root);
		System.out.println("\npostorder: ");
		tree.postorder(tree.root);
		System.out.println("\ndelete: " + tree.delete(8));
		tree.inorder(tree.root);
	}
}