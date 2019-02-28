package number;
import java.util.Scanner;
public class Sum2
{
	private static Scanner sc;
	int n;
	void input()
	{
		sc=new Scanner(System.in);
		System.out.print("enter n: ");
		n=sc.nextInt();
	}
	int sum() 
	{
		int s=0;
		for(int i=1;i<=n;i=i+2)
			s+=i;
		return s;
	}
	public static void main(String[]args) 
	{
		Sum2 yen =new Sum2();
		yen.input();
		int s=yen.sum();
		System.out.println("the sum: "+s);
		
	}
	

}
