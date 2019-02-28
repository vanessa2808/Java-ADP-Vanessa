package number;
import java.util.Scanner;
public class Sum5 
{
	private static Scanner sc;
	static int n;
	private int s;
	private static Scanner Scan;
	void input()
	{
		sc= new Scanner(System.in);
		while(n<=0)
		{
			System.out.println("enter n: ");
			n=sc.nextInt();
		}

	}
	int sum()
	{
		int s=0;
		while(n>0) 
		{
			int sd=n%10;
			s=s+sd;
			n=n/10;
		}
		return s;
	}

	int sum2() 
	{
		int s1=0;
		while(n>0) 
		{
			int sd=n%10;
			s1=s1*10+sd;
			n=n/10;
		}

		return s1;
	}
	boolean sum3() 
	{
		int s2=0;
		while(n>0) 
		{
			int sd=n%10;
			s2=s2*10+sd;
			n=n/10;
		}
		if(s2==n) return true;
		else return false;

	}
	int sum4() 
	{
		int s3=0;
		while(n>0)
		{
			int sd=n%10;
			if(sd!=0 && sd!=5)  s3=s3*10+sd;
			n=n/10;
		}
		return s3;
	}

	int sum6() 
	{
		int x;
		Scanner kb=new Scanner(System.in);
		int s=0;
		do {
			System.out.println("enter x: ");
			x=kb.nextInt();
			s=s+x;
		}while (x!=2018);

		return s;

	}
	int sum7() 
	{
		/*int s=1;
		if(n%2!=0) 
		{
			for(int i=1;i<=n;i=i+2)
			{
				s=s*i;
			}
		}
		else 
		{
			for(int i=2;i<=n;i=i+2)
			{
				s=s*i;
			}
		}
		return s;*/
		int s=0;
		for(int i=n;i>=1;i=i-2)
			s=s+i;
		return s;
	}
	// homework1
	double sum8() 
	{
		double s=0;
		double s1=1;
		for(double i=1;i<=n;i++) 
		{
			s1=s1*i;
			s=(double)s+(1/s1);
		}
		return s;
	}
	// homework2 kiem tra so nguyen to
	public static boolean kiemtrasonguyento() 
	{
		if(n<2) return false;
			for(int i=2;i<=(Math.sqrt(n));i++) 
				if(n%i==0)
					return false;
				return true;
		}
	public static void main(String[]args)
	{
		Sum5 yen=new Sum5();
		yen.input();
		boolean s=yen.kiemtrasonguyento(); 
		System.out.println(s);
	}
}
