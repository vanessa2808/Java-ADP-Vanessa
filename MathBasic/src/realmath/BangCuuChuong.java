package realmath;
import java.util.Scanner;
public class BangCuuChuong 
{
	private static Scanner sc;
	int n;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("pls enter n: ");
		n=sc.nextInt();
	}
	void calculate()
	{
		for(int i=2;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
				System.out.println(i+"*"+j+"="+i*j+"\n");
		}
	}
	public static void main(String[]args) 
	{
		BangCuuChuong yen= new BangCuuChuong();
		yen.input();
		yen.calculate();
	}

}
