package complex;
import java.util.Scanner;
public class Complex 
{
	private static Scanner sc;
	private double real;
	private double virtual;
	public Complex() 
	{
		
	}
	public Complex(int r,int v) 
	{
		this.real=r;
		this.virtual=v;
	}
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.print("enter real: ");
		real=sc.nextDouble();
		System.out.print("enter virtual: ");
		virtual=sc.nextDouble();
	}
	public void output() 
	{
		System.out.println(" \t >"+real+"+"+virtual+".i");
	}
	public Complex plus( Complex C2)
	{
		Complex C3=new Complex();
		C3.real=this.real+C2.real;
		C3.virtual=this.virtual+C2.virtual;
		return C3;
	}
	public Complex minus(Complex C2) 
	{
		Complex C4= new Complex();
		C4.real=this.real-C2.real;
		C4.virtual=this.virtual-C2.virtual;
		return C4;
	}
	public Complex mutipl(Complex C2) 
	{
		Complex C5= new Complex();
		C5.real=(this.real*C2.real)-(this.virtual*C2.virtual);
		C5.virtual=(this.real*C2.virtual)+(C2.real*this.virtual);
		return C5;	
	}
	public Complex division(Complex C2) 
	{
		Complex C6=new Complex();
		C6.real=((this.real*C2.real)+(C2.virtual*this.real))/(Math.pow(C2.real, 2)+Math.pow(C2.virtual, 2));
		C6.virtual=((C2.real*this.virtual)-(C2.virtual*this.real))/(Math.pow(C2.real, 2)+Math.pow(C2.virtual, 2));
		return C6;
	}

	public static void main(String[]args)
	{
		Complex C1=new Complex();
		C1.input();
		C1.output();
		Complex C2=new Complex();
		C2.input();
		C2.output();

		System.out.print("plus:");
		Complex C3=C1.plus(C2);
		C3.output();
		System.out.print("minus: ");
		Complex C4=C1.minus(C2);
		C4.output();
		System.out.print("mutil: ");
		Complex C5=C1.mutipl(C2);
		C5.output();
		System.out.print("division: ");
		Complex C6=C1.division(C2);
		C6.output();
	}
}
