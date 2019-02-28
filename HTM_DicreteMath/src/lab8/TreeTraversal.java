package lab8;

public class TreeTraversal {
	
	//
	static void preorder(Node<Integer> root){
		System.out.print(root.data + " ");
		if (root.left != null)
			preorder(root.left);
		if (root.right != null)
			preorder(root.right);
	}
	//
	static void inorder(Node<Integer> root){
		if (root.left != null)
			inorder(root.left);
		System.out.print(root.data + " ");
		if (root.right != null)
			inorder(root.right);
	}
	//
	static void postorder(Node<Integer> root){
		if (root.left != null)
			postorder(root.left);
		if (root.right != null)
			postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	////
	public static void main(String[] args) {
		Node<Integer> root = new Node<Integer>(5);
		Node<Integer> node6 = new Node<Integer>(6);
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node4 = new Node<Integer>(4);
		Node<Integer> node2 = new Node<Integer>(2);
		Node<Integer> node8 = new Node<Integer>(8);
		Node<Integer> node7 = new Node<Integer>(7);
		Node<Integer> node3 = new Node<Integer>(3);
		
		root.left = node6;
		root.right = node1;
		
		node6.left = node4;
		node6.right = node2;
		
		node1.right = node8;
		
		node8.left = node7;
		node8.right = node3;
		
		//
		BTreePrinter.printNode(root);
		
		//
		System.out.println("preorder:");
		preorder(root);
		System.out.println();
		
		System.out.println("inorder:");
		inorder(root);
		System.out.println();
		System.out.println("postorder:");
		postorder(root);
	}

}
