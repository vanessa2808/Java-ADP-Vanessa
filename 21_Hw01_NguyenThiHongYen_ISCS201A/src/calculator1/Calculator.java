package calculator1;
import java.util.Scanner;

public class Calculator 
{
	double a,b;
	private Scanner kb;
	void input()
	{
		kb = new Scanner(System.in);
		System.out.print("Enter a: ");
		a= kb.nextDouble();
		System.out.println("enter b: ");
		b= kb.nextDouble();
	}
	void calculate()
	{
		double sum= a+b;
		double difference=a-b;
		double multiplication= a*b;
		double division=a/b;
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+difference);
		System.out.println(a+"*"+b+"="+multiplication);
		System.out.println(a+"/"+b+"="+division);
		
		
	}
	public static void main(String[]args)
	{
		Calculator yen=new Calculator();
		yen.input();
		yen.calculate();
		
		
	}
	
	

}
