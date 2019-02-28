package number;
import java.util.Scanner;

public class Sum1 
{
	private static Scanner sc;
    int n;
	void input()
	{
		sc= new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();
    }
	int sum()
	{
		int s=0;
		//sum of the first interger number
		
		for(int i=1;i<=n;i++)
			s=s+(i);
		   return s;
	}

	public static void main(String[]args) 
	{
		Sum1 yen=new Sum1();
		yen.input();
		int s=yen.sum();
		System.out.println("sum of the first interger number: "+s);
	}
	
}