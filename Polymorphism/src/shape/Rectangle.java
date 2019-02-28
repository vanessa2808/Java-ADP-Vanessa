package shape;
import java.util.Scanner;
public class Rectangle implements Shape1  {
	protected double a;
	protected double b;
	public Rectangle() {
		this.b=this.a=0.0;
	}
	public Rectangle(double a, double b) {
		this.a=a;
		this.b=b;
	}
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
	public void output() {

	}
	public Double circumference(){
		return (a+b)*2;
	}
	public Double area(){
		return a*b;
	}
	public static void main(String[]args) {
		Rectangle yen= new Rectangle();
		yen.input();
		System.out.println(yen.circumference());
		System.out.println(yen.area());
	}

	}