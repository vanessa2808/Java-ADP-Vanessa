package equation;
import java.util.Scanner;
public class SquareEquation extends LinearEquation 
{
	private double a;
	public SquareEquation() 
	{
		super(); //ham tao mat dinh cua lop cha luo nam dau
		this.a=0;
	}
	public SquareEquation(double a, double b, double c) 
	{
		super(b,c); //goi ham tao co doi so cua lop cha,luon nam dau
		this.a=a;
	}
	public void input() // tieu de ham
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a: ");
		a=sc.nextDouble();
		super.input();// goi ham input cua lop cha    	
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void calculate() 
	{
		if(a==0) 
			super.calculate();
		else 
		{
			double denta=b*b-a*4*c;
			if(denta<0) 
				System.out.println("phuong trinh da cho vo nghiem");
			if(denta==0) 
			{
				double x=-b/(2*a);
				System.out.println("phuong trinh da cho co mot nghiem duy nhat: "+x);
			}
			if(denta>0)
			{
				double x1=(-b+Math.sqrt(denta))/(2*a);
				double x2=(-b-Math.sqrt(denta))/(2*a);
				System.out.println("phuong trinh da cho co hai nghiem: "+x1+" va "+x2);
			}
		}
	}
	public static void main(String[]args) 
	{
		SquareEquation yen =new SquareEquation();
		yen.input();
		yen.calculate();

	}
}
