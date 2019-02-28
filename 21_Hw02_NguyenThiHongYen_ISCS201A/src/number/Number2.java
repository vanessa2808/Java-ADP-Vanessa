package number;
import java.util.Scanner;
public class Number2 
{
	private static Scanner sc;
	int n;
	void input()
	{
		sc= new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();

	}
	void printstars() 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
				System.out.print("* ");

			System.out.println();

		}


		System.out.println();
		System.out.println();

		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-i+1;j++)
				System.out.print("* ");
			System.out.println("");
		}

		System.out.println("in tam giac deu");
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for( int c=1;c<=2*i-1;c++)
				System.out.print(" *");

			System.out.println("     ");

		}

		System.out.println("in tam giac vuong");
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");

			for( int c=1;c<=i;c++)
				System.out.print("*");

			System.out.println("   ");
		}

		System.out.println("tam giac vuong nguoc");
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
				System.out.print(" ");
			for(int c=(n-i);c>=0;c--)
				System.out.print("*");
			System.out.println();


		}

	}
	public static void main(String[]args) 
	{
		Number2 yen =new Number2();
		yen.input();
		yen.printstars();
	}
}
 
