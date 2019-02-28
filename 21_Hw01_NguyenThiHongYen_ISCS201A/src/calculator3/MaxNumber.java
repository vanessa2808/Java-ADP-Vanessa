package calculator3;
import java.util.Scanner;
public class MaxNumber
{
	private static Scanner sc;
	double a,b,c,d;
	void input()
	{
		sc=new Scanner(System.in);
		System.out.print("enter a: ");
		a=sc.nextDouble();
		System.out.print("enter b: ");
		b=sc.nextDouble();
		System.out.print("enter c: ");
		c=sc.nextDouble();
		System.out.print("enter d: ");
		d=sc.nextDouble();
	}
    double max() 
    {
    	double max=a; 
    	if(max<b) max=b;
    	if(max<c) max=c;
    	if(max<d) max=d;
    	return max;
    }
    public static void main(String[]args)
    {
    	MaxNumber yen=new MaxNumber();
    	yen.input();
    	double max=yen.max();
    	System.out.println("MaxNumber is: "+max);
    }
}
