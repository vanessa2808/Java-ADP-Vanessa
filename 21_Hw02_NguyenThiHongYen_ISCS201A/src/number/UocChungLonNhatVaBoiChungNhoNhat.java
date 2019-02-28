package number;
import java.util.Scanner;
public class UocChungLonNhatVaBoiChungNhoNhat
{
	private static Scanner sc;
	int a,b;
	private double n;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("enter a: ");
		a=sc.nextInt();
		System.out.println("enter b: ");
		b=sc.nextInt();
	}
	void ucln() 
	{
		a=Math.abs(a);
		b=Math.abs(b);
		int k=a*b;
		if(a==0 || b==0)    System.out.println(a+b);
		do {
			if(a>b) a=a-b;
			else b=b-a;
		}while (a!=b);
		n = k/a;
	System.out.println("uoc chung lon nhat cu hai so a,b la: "+a);
	System.out.println("boi chung nho nhat cu hai so a b la: "+n);
	}


	public static void main(String[]args) 
	{
		UocChungLonNhatVaBoiChungNhoNhat yen= new UocChungLonNhatVaBoiChungNhoNhat();
		yen.input();
		yen.ucln();
	}
}
