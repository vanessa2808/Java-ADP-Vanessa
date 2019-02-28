package complex;
import java.util.Scanner;
public class ArrayOfComplex {
	private int n;
	private Complex []a= new Complex[100];
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter complex "+i +":");
			Complex c= new Complex();
			c.input();
			a[i]=c;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			a[i].output();
		}
		}
	}
	public void calSum() {
		for(int i=0;i<n;i++) {
				a[i].plus(a[i+1]).output();
		}
	}
	public static void main(String[]args) {
		ArrayOfComplex yen= new ArrayOfComplex();
		yen.input();
		yen.output();
		yen.calSum();
	}
}
