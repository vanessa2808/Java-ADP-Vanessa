package equation;
import java.util.Scanner;
public class LinearEquation 
{
	protected double b;
	protected double c;
	
	public LinearEquation() 
	{
		this.b=this.c=0;
		// bien truyen vao trung voi thuoc tinh cua cac class
	}
	public LinearEquation(double b, double c)
	{
		this.b=b;
		this.c=c;
	}
	public void input()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter b: ");
		this.b=sc.nextDouble();
		System.out.println("enter c: ");
		this.c=sc.nextDouble();		
		// con tro this phan biet bien truyen vao va thuoc tinh cua class
	}
	
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	void calculate() 
   {
		if(b==0)
		{ 
			if (c==0) 
			{
				System.out.println("Phuong trinh da cho vo so nghiem");
			}
			else
			{
				System.out.println("phuong trinh da cho vo nghiem");
			}
		}
		else 
		{
			double x=-c/b;
			System.out.println("phuong trinh da cho co 1 nghiem duy nhat: "+x);
		}
   }
	public static void main(String[]args) 
	{
		LinearEquation yen = new LinearEquation();
		yen.input();
		yen.calculate();
		
	}
}
