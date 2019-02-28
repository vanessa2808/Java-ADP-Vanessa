package basic;
import java.util.Scanner;
public class Bai1
{
	private static Scanner sc;
	int a,b;
	int input(char chr , int x) {
		sc=new Scanner(System.in);
		do {
			System.out.println("enter "+ chr +":");
			x=sc.nextInt();
		}while (x<0);
		return x;
	}
	void input()
	{
		a=input('a',a);
		b=input('b',b);
	}
	void calculate() 
	{
		int k=a*b;
		if( a==0 || b==0) System.out.println(a+b);
		do {
			if(a>b) a=a-b;
			else b=b-a;
		}while(a!=b);
		int bcnn=k/a;
		System.out.println("ucln(a,b): "+a);
		System.out.println("bcnn(a,b): "+bcnn);
	}
	public static void main(String[]args) 
	{
		Bai1 yen=new Bai1();
		yen.input();
		yen.calculate();
	}
	
	
	

}
