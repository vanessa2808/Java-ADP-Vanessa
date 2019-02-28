package examplestring;

public class B6 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favorite language");
		System.out.println(sb.capacity());

	}

}
