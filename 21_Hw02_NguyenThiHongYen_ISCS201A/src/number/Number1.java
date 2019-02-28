package number;
import java.util.Scanner;

public class Number1 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc= new Scanner(System.in);
		System.out.println("please enter n: ");
		n=sc.nextInt();
	}
	void print() 
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"");
		    for(int j=1;j<=n;j++)
			    System.out.print(j+"");
		System.out.println("");
		}
	}
		
	public static void main(String[]args) 
	{
		Number1 yen= new Number1();
		yen.input();
		yen.print();
	}
}
