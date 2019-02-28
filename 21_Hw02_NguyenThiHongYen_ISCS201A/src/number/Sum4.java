package number;
import java.util.Scanner;
public class Sum4 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("pls enter n: ");
		n=sc.nextInt();
	}
	double PrintSum4() 
	{
		double s=0;
		for(int i=1;i<=n;i++) 
		  s+=(double)1/i;
		return s;
	}
	public static void main(String[]args) 
	{
		Sum4 yen= new Sum4();
		yen.input();
		double s=yen.PrintSum4();
		System.out.println("the sum is: "+s);
	}

}
