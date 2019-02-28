package number1;
import java.util.Scanner;
public class PrimeNumber 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("pls enter n: ");
		n=sc.nextInt();
	}
	void exercise3() {
		int dem=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
				dem++;
		}
		switch(dem)
		{
		case 2: System.out.print("Day la so nguyen to."); break;
		default: System.out.print("Day khong phai so nguyen to.");
		}
	}
	
	public static void main(String[]args) 
	{
		PrimeNumber yen= new PrimeNumber();
		yen.input();
		yen.exercise3();
	}
}

