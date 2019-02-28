package calculator2;
import java.util.Scanner;
public class Bt2Square 
{
	private static Scanner sc;
	double a;
	void input()
	{
		sc=new Scanner(System.in);
		System.out.print("enter a: ");
		a=sc.nextDouble();
	}
	void calculate() 
	{
		if(a<=0)  System.out.println("khong ton tai gia tri cua S,P");
		else 
		{
			double S=a*a;
			double C=a*4;
			System.out.println("Circumference: "+C);
			System.out.print("Area: "+S);
		}
	}
	public static void main(String[]args) 
	{
		Bt2Square yen = new Bt2Square();
		yen.input();
		yen.calculate();
	}
}