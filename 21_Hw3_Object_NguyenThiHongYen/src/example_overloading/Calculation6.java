package example_overloading;

public class Calculation6 {
	void sum(int a,long b) { System.out.println("a method invoked");}
	void sum(long a,int b){ System.out.println("b method invoked");}
	public static void main(String args[]) 
	{
		Calculation6 yen=new Calculation6();
		yen.sum(20,20L);//now int arg sum()method gets invoked
		yen.sum(20L, 20);
	}
}

