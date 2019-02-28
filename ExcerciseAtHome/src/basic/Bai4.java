package basic;
import java.util.Scanner;
public class Bai4
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc= new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();
	}
	void calculate() 
	{
		int i=2;
		while (n>1) 
		{
			if(n%i==0) 
			{ 
				n=n/i;
				if(n>1) System.out.print(i+"*");
				else System.out.println(i);
			}
			else i++;
		}
	}
	public static void main(String[]args) 
	{
		Bai4 yen= new Bai4();
		yen.input();
		yen.calculate();
	}

}
