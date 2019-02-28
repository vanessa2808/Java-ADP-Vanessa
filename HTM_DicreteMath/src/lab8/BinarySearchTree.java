package lab8;

public class BinarySearchTree {

	static Node<Integer> root;
	
	//
	static void insert(int value){
		if (root == null){
			root = new Node<Integer>(value);
		}else{
			Node<Integer> cur = root;
			Node<Integer> parent = root;
			while (cur != null){
				parent = cur;
				if (value > cur.data)
					cur = cur.right;
				else
					cur = cur.left;
			}
			cur = new Node<Integer>(value);
			if (value > parent.data)
				parent.right = cur;
			else
				parent.left = cur;
			cur.parent = parent;
		}
	}
	
	//
	static Node<Integer> find(int value){
		Node<Integer> cur = root;
		
		while (cur != null){
			if (value > cur.data)
				cur = cur.right;
			else if (value < cur.data)
				cur = cur.left;
			else
				break;
		}
		if (cur == null)
			return null;
		else
			return cur;
	}
	
	//
	static void delete(Node<Integer> node){
		// case 1: leaf nodes
		if (node.left == null && node.right == null){
			System.out.println("case 1");
			if (node.parent.left == node)
				node.parent.left = null;
			else
				node.parent.right = null; 
			node = null;
			return;
		}
		// case 2: node has null left
		if (node.left == null){
			System.out.println("case 2");
			if (node.parent.left == node)
				node.parent.left = node.right;
			else
				node.parent.right = node.right;
			return;
		}
		// case 3: node has null right
		if (node.right == null){
			System.out.println("case 3");
			if (node.parent.left == node)
				node.parent.left = node.left;
			else
				node.parent.right = node.left;
			return;
		}
		// case 4: node has left/right children
		if (node.left != null && node.right != null){
			System.out.println("case 4");
			// replace node.data with the max of the left branch
			Node<Integer> cur = node.left;
			while (cur.right != null)
				cur = cur.right;
			
			node.data = cur.data;
			
			delete(cur);
		}
	}
	
	////
	public static void main(String[] args) {
		int[] values = new int[]{44,17,88,32,65,97,28,54,82,29,76,80};

		for (int value : values){
			insert(value);
//			BTreePrinter.printNode(root);
		}
		
//		BTreePrinter.printNode(root);
		
		//
		int value = 54;
		Node<Integer> ret = find(value);
		if (ret != null)
			System.out.println(value + " found.");
		else
			System.out.println(value + " not found.");
		
		// TEST delete()
//		Node<Integer> deleted_node = find(54);	// leaf
//		Node<Integer> deleted_node = find(17);	// null left
//		Node<Integer> deleted_node = find(82);	// null right
		Node<Integer> deleted_node = find(44);	// both left/right
		
		delete(deleted_node);
		BTreePrinter.printNode(root);
		
	}

}
