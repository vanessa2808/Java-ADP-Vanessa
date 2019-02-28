package mainline;
import java.util.Scanner;
public class Number {
	private int n;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
	}
	public int count() {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[]args) {
		Number yen=new Number();
		yen.input();
		System.out.println(yen.count());
	}
}
