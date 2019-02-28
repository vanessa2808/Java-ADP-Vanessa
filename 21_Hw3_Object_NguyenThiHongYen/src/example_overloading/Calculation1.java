package example_overloading;

public class Calculation1 {
	void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	public static void main(String[]args) 
	{
		Calculation1 yen=new Calculation1();
		yen.sum(20, 20);
		yen.sum(10, 10, 10);
	}
}
