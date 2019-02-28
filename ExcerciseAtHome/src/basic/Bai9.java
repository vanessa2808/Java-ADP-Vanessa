package basic;
import java.util.Scanner;
public class Bai9 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		do {
			sc=new Scanner(System.in);
			System.out.println("enter n: ");
			n=sc.nextInt();
		}while(n<2);
	}
	Boolean output() 
	{
		int dem=0;
		for(int i=2;i<=n;i++) 
		{
			if(n%i==0) dem=dem+1;
		}
		if(dem==1)
			return true;
		return false; 
	}
	void calculate() 
	{
		int i=2;
		while(i<n) 
		{
			if(n%i!=0) 
				System.out.println(i);
			i++;
		}
	}
	public static void main(String[]args) 
	{
		Bai9 yen=new Bai9();
		yen.input();
		System.out.println(yen.output());
		yen.calculate();

	}
}
