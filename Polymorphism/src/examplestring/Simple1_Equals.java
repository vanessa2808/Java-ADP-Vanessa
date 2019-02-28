package examplestring;

public class Simple1_Equals {

	public static void main(String[] args) {
		String s1="Duy Tan ";
		String s2="Duy Tan ";
		String s3= new String ("Duy Tan ");
		String s4="Duy Tan1";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}
}
