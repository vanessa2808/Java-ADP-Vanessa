package calculator2;
import java.util.Scanner;
public class Bt2Rectangular
{
	private static Scanner sc;
	double a,b;
	void input()
	{ 
		sc= new Scanner(System.in);
		System.out.print("please enter a: ");
		a=sc.nextDouble();
		System.out.print("please enter b: ");
		b=sc.nextDouble();
	}
	void calculate()
	{
		if(a<=0 || b<=0) System.out.println("khong ton tai S,P");
		else
		{
			double S= a*b;
			double C=(a+b)*2;
			System.out.println("chu vi hinh chu nhat la: " + C);
			System.out.println("dien tich hinh chu nhat la: "+S);
		}
	}
		public static void main(String[]args) 
		{
			Bt2Rectangular yen= new Bt2Rectangular();
			yen.input();
			yen.calculate();	
		}
	}