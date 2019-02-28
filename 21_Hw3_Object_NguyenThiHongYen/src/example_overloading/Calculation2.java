package example_overloading;

public class Calculation2 {
	void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
	void sum(double a,double b) 
	{
		System.out.println(a+b);
	}
	public static void main(String[]args) 
	{
		Calculation2 yen=new Calculation2();
		yen.sum(10.5, 20.5);
		yen.sum(10, 10);
	}
}

