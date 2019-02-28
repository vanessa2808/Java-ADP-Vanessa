package shape;
import java.util.Scanner;
public class Circle implements Shape1 {
	private double r;
	final double PI =3.14;
	//@param: constructor for radius
	public Circle() {
		this.r=0.0;
	}
	public Circle(double r) {
		this.r=r;
	}
	public void input(){
		do {
			Scanner kb=new Scanner(System.in);
			System.out.println("enter radius: ");
			r=kb.nextDouble();
		} while(r<0);
	}
	//@param: getter and setter
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getPI() {
		return PI;
	}
	public void output() {
		
	}
	public Double circumference(){
		return 2*PI*r;
	}
	public Double area(){
		return PI*r*r;
	}
	public static void main(String[]args) {
		Circle yen=new Circle();
		yen.input();
		System.out.println(yen.circumference());
		System.out.println(yen.area());
	
	}
	

}

