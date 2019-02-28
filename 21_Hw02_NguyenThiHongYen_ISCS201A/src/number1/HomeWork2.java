package number1;
import java.util.Scanner;
public class HomeWork2 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("pls enter n: ");
		n=sc.nextInt();
	
		switch(n) 
		{
		case 1: System.out.println("one"); break;
		case 2:System.out.println("two");break;
		case 3:System.out.println("three");break;
		case 4: System.out.println("four");break;
		case 5: System.out.println("five");break;
		default: System.out.println("no: ");
		}

	}
	public static void main(String[]args) 
	{
		HomeWork1 yen= new HomeWork1();
		yen.input();
		int n=yen.n;
	}
}
