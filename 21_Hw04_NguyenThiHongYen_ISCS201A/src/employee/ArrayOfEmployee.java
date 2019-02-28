package employee;
import java.util.Scanner;
public class ArrayOfEmployee {
	private static Scanner sc;
	private int n;
	private Employee []a= new Employee[100];
	public void input() {
		sc= new Scanner (System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter employee: "+i);
			Employee e=new Employee();
			e.input();
			a[i]=e;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.println("------------------------");
			a[i].output();
		}
	}
	public static void main(String[]args) {
		ArrayOfEmployee yen=new ArrayOfEmployee();
		yen.input();
		System.out.println("_________________");
		yen.output();
	}
}
