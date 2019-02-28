package stack;
import java.util.Scanner;
public class EasyQuestion {
	char a;
	public void input() {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter : ");
	a=sc.next().trim().charAt(0);
}
	public void output() {
		System.out.println(a);
	}
public static void main(String[]args) {
	EasyQuestion yen = new EasyQuestion();
	yen.input();
	yen.output();
}
}
