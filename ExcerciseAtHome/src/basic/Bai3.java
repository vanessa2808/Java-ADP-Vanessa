package basic;
import java.util.Scanner;
public class Bai3
{
	int n;
	private static Scanner sc;
	void input()
	{
		sc=new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();
	}
	void calculate()
	{
		int s=0;
		while(n>0) 
		{
			int sd= n%10;
			s=s+sd;
			n=n/10;
		}
		System.out.println(s);
	}
	public static void main(String[]args) 
	{
		Bai3 yen=new Bai3();
		yen.input();
		yen.calculate();
	}
}
