package basic;
import java.util.Scanner;
public class Bai8 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		do {
		sc= new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();
		}while(n<=0);
		
	}
	void calculate() 
	{
		int f[]=new int [n+1];
		f[0]=f[1]=1;
		for(int i=2;i<=n;i++) 
		{
			f[i]= f[i-1]+f[i-2];
		}
		int i=1;
		System.out.println("cac so nguyen to nho hon n la"+" ");
		while(f[i]<n) 
		{
			System.out.print(" "+f[i]);
			i++;
		}
	}
	public static void main(String[]args) 
	{
		Bai8 yen=new Bai8();
		yen.input();
		yen.calculate();
	}
}
