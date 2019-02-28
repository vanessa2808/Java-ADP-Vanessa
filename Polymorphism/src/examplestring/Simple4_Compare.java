package examplestring;

public class Simple4_Compare {
	public static void main(String[]args) {
		String s1="Sanchin";
		String s2=new String("Sanchin");
		String s3="Ratan";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}

}
