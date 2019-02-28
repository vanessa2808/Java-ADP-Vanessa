package example_overloading;

public class Calculation5 {
	void sum(int a,int b) { System.out.println(a+b);}
	void sum(long a,long b){ System.out.println(a+b);}
	public static void main(String args[]) 
	{
		Calculation5 yen=new Calculation5();
		yen.sum(20, 20);//now int arg sum()method gets invoked
		yen.sum(50L, 20L);
	}
}
