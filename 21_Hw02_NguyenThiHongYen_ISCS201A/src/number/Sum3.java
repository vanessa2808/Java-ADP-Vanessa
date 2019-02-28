package number;
import java.util.Scanner;
public class Sum3
{
	private static Scanner sc;
	int n;
	double x;
	void input()
	{
		sc=new Scanner(System.in);
		System.out.print("enter n: ");
		n=sc.nextInt();
		System.out.println("pls enter x: ");
		x=sc.nextDouble();
	}
	double sum() 
	{
		double s=0;
		for(int i=1;i<=n;i=i+1)
			s+=Math.pow(x, i);
		return s;
	}
	public static void main(String[]args) 
	{
		Sum3 yen =new Sum3();
		yen.input();
		double s=yen.sum();
		System.out.println("the sum: "+s);

	}


}