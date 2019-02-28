package shape;
import java.util.Scanner;
public class Square extends Rectangle{
	public Square() {
	}
	public Square(double edge) {
		super(edge,edge);
	}
	public void input() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter edge: ");
			a=b=sc.nextDouble();
	}
	public void output() {
		System.out.println(a);
	}
	public static void main(String[]args) {
		Square yen = new Square();
		yen.input();
		System.out.println(yen.circumference());
		System.out.println(yen.area());

	}

}
