package examplestring;
public class A1_Buffer {
	public static void main(String[]args ) {
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" Java"); // now original String is changed
		System.out.println(sb);  //prints Hello Java
	}
}
