package examplestring;

public class B2 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");
		sb.insert(1, "Java"); //now original String is changed
		System.out.println(sb);  //print HJavaello
		
		
	}

}
