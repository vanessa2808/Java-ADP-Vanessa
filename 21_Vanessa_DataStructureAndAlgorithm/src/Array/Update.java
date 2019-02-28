package Array;
import java.util.Scanner;
public class Update {
	private int x[]= new int [100];
	private int n,a,b;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("ENter element "+ i);
			x[i]=sc.nextInt();
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.println(x[i]);
		}
	}
	public void update() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the element you want to change: ");
		a=sc.nextInt();
		System.out.println("Enter the value that you want to change: ");
		b=sc.nextInt();
		x[a]=b;
	}
	public static void main(String[]args) {
		Update yen = new Update();
		yen.input();
		yen.output();
		yen.update();
		yen.output();
	}
	
}
