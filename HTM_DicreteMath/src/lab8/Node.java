package lab8;

public class Node<T extends Comparable<?>> {
	Node<T> left, right, parent;
	T data;

	public Node(T data) {
		this.data = data;
	}
}
