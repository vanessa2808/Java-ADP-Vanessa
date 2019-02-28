package shape;
import java.util.Scanner;
public class Triangle implements Shape1  {
	private double a,b,c;
	public Triangle(){
		this.a=this.b=this.c=0.0;
	}
	public Triangle(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//@param: create the triangle when a,b,c > 0
	public double input(char chr ,double x ) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter "+ chr +":");
			x=sc.nextDouble();
		}while (x<=0);
		return x;
	}
	public void input()
	{
		a=input('a', a);
		b=input('b', b);
		c=input ('c', c);
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
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
	public void output() {
		if(a<=b+c && b<=c+a && c<=a+b)  System.out.println(a+ "," + b + ","+c +" create triangle ");
		else System.out.println(a+ "," + b + ","+c +" No create triangle");
	}
	public Double circumference() {
		if(a<=b+c && b<=c+a && c<=a+b)  {
			double p=a+b+c;
			return p;
		}
		else return  null;
	}
	public Double area() {
		if(a<=b+c && b<=c+a && c<=a+b)  {
			double p= (a+b+c)/2;
			double s=(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
			return s;
		}
		else return null;
	}
	
	public static void main(String[]args) {
		Triangle yen=new Triangle();
		yen.input();
		yen.output();
		System.out.print("circumference: ");
		System.out.println(yen.circumference());
		System.out.print("area: ");
		System.out.println(yen.area());
	}
}
