package calculator3;
import java.util.Scanner;
public class SystemOfEquations 
{
	private static Scanner sc;
	double a,b,c,d,e,f;
	void input()
	{
		sc= new Scanner(System.in);
		System.out.print("enter a: ");
		a=sc.nextDouble();
		System.out.print("enter b: ");
		b=sc.nextDouble();
		System.out.print("enter c: ");
		c=sc.nextDouble();
		System.out.print("enter d: ");
		d=sc.nextDouble();
		System.out.print("enter e: ");
		e=sc.nextDouble();
		System.out.print("enter f: ");
		f=sc.nextDouble();	
	}
	void calculate() 
	{
		double D = a*e-b*d;
		double DX = b*f-e*c;
	    double DY=c*d-a*f;
	    if(D!=0)
	    {
	    	double x=-DX/D;
	    	double y=-DY/D;
	    	System.out.println("the system of equations has one root is: "+"\nx"+"="+x + "\ny"+"="+y);
	    }
	    else
	    {
	    	if(DX==0)
	    		if(DY==0)
	    			System.out.println("system of equations has coutless root");
	    		else 
	    			System.out.println("no root");
	    	else 
	    		System.out.println("no root");
	    }
	}
	public static void main(String[]args)
	{
		SystemOfEquations yen= new SystemOfEquations();
     	yen.input();
		yen.calculate();
	}
}
