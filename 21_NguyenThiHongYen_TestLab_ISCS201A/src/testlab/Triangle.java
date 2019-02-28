package testlab;
import java.util.Scanner;
public class Triangle 
{
	private static Scanner sc;
	double  a,b,c;
	double input(char chr ,double x ) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter "+ chr +":");
			x=sc.nextDouble();
		}while (x<=0);
		return x;
	}
	void input()
	{
		a=input('a', a);
		b=input('b', b);
		c=input ('c', c);
	
	}
	void calculate() 
	{
			if(a>=b+c || b>=c+a || c>=a+b) 
				System.out.println("not create triangle");
			else
			{
				System.out.println("create triangle");
				if((a==b || b==c || a==c) && ((a*a==b*b+c*c || b*b==a*a+c*c) || c*c== a*a+b*b))
					System.out.println("isoscele square triangle");
				if((a!=b && b!=c) && (a*a==b*b+c*c || b*b==a*a+c*c) || c*c== a*a+b*b)
					System.out.println("square triangle");
				if((a==b && c!=a) || (b==c && a!=b) || (a==c && a!=b)) 
					System.out.println("isoscele triangle");
				if((a==b)&& (b==c))
					System.out.println("equilateral triangle");
				if((a!=b && b!=c) && (a*a!=b*b+c*c && b*b!=a*a+c*c) && c*c!= a*a+b*b)     
					System.out.println("normal triangle");
				double p= (a+b+c)/2;
				double S=(Math.sqrt(p*(p-a)*(p-b)*(p-c)));

				double C=(a+b+c);
				System.out.println("the area: "+S);
				System.out.println("circumference: "+C);
			}
	}

	public static void main(String[]args)
	{
		Triangle yen= new Triangle();
		yen.input();
		yen.calculate();

	}
}