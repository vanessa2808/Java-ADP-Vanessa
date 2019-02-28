package teacher;
import java.util.Scanner;
public class ArrayOfFullTimeTeacher {
	private int  n;
	private FullTimeTeacher [] a  =new FullTimeTeacher[100];
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(" Enter Teacher "+ i + ": ");
			FullTimeTeacher f= new FullTimeTeacher();
			f.input();
			a[i]=f;
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public FullTimeTeacher[] getA() {
		return a;
	}
	public void setA(FullTimeTeacher[] a) {
		this.a = a;
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
			System.out.println(a[i].basicSalary());
			System.out.println(a[i].payment());
		}
	}
	public static void main(String[]args) {
		ArrayOfFullTimeTeacher yen= new ArrayOfFullTimeTeacher();
		yen.input();
		yen.output();
	}
	
}
