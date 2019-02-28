package examplestring;

public class Student2 {
	private int rollno;
	private String name;
	private String city;
	public Student2(int rollno,String name,String city ) {
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public String toString (){  //Overriding the toString()method
		return rollno+" "+name+" "+city;
	}
	public static void main(String[]args) {
		Student2 s1=new Student2(101,"Raj","Lucknow");
		Student2 s2=new Student2(102,"Vijay","ghaziabad");
		System.out.println(s1);
		System.out.println(s2);
	}
}