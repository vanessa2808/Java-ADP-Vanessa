package number;
import java.util.Scanner;
public class DayThua 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();
	}
	int daythua() 
	{
		int m=1;
		if(n==0|| n==1)    return m;
		else 
			for(int i=1;i<=n;i++)
				m*=i;
		return m;
	}
	public static void main(String[]args) 
	{
		DayThua yen= new DayThua();
		yen.input();
		int m= yen.daythua();
		System.out.println("day thua la: "+m);
	}
}
