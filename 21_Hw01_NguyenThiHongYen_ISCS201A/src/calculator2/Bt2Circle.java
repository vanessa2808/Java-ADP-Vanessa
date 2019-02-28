package calculator2;

import java.util.Scanner;
public class Bt2Circle
{

	private double r;
	final double PI=3.14;
	private static Scanner kb;
	void input()
	{
		kb=new Scanner(System.in);
		System.out.println("enter radius: ");
		r=kb.nextDouble();
	}
	public void calculate()
	{
		double C=2*PI*r;
		double S=PI*r*r;
		System.out.println("chu vi hinh tron la: "+2*PI+"*"+r+"="+C );
		System.out.println("dien tich hinh tron la: "+PI+"*"+r+"*"+r+"="+S);
	}
	public Double circumference()
	{
		if(r>=0) 
		{
			double p=2*PI*r;
			return p;
		}
		System.out.println("out of radius: ");
		return null;

	}

	public Double area()
	{
		if (r >= 0 ) 
		{
			double S=PI*r*r;
			return S;
		}
		System.out.println("out of radius");
		return null;

	}
	public static void main(String[]args ) 
	{
		Bt2Circle yen= new Bt2Circle();
		yen.input();
		System.out.println("the area of circle: "+yen.area());
		double S= yen.circumference();
		System.out.println(" the cir: "+S);
		
		
		Bt2Circle yen1= new Bt2Circle();
		yen1.input();
		System.out.println("the area of circle: "+yen.area());
		double S1= yen1.circumference();
		System.out.println(" the cir: "+S);
	}
}



// nen viet theo ham tra ve vi trong do co return 


