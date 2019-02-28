package examplestring;

public class Student1 {
	private int rollno;
	private String name;
	private String city;
	public Student1(int rollno,String name,String city ) {
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public static void main(String[]args) {
		Student1 s1=new Student1(101,"Raj","Lucknow");
		Student1 s2=new Student1(102,"Vijay","ghaziabad");
		System.out.println(s1);
		System.out.println(s2);
	}
}
