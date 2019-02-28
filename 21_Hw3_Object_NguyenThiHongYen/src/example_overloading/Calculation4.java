package example_overloading;

public class Calculation4 {
	void sum(int a,long b) { System.out.println(a+b);}
	void sum(int a,int b,int c) { System.out.println(a+b+c);}
	public static void main(String args[]) 
	{
		Calculation4 yen=new Calculation4();
		yen.sum(20, 20L);
		yen.sum(20,20,20);
	}
}
