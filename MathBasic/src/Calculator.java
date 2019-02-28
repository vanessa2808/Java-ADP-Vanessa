
import java.util.Scanner;

public class Calculator {
	private static Scanner sc;

	public static void main(String[] args) {
		int n;
		System.out.println("Hay nhap so muon kiem tra: ");
		sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n%2 == 0) {
			System.out.print("So: " + n + " la so chan");
		}else {
			System.out.print("So: "
					+ "" + n + " la so le");
		}
	}
}
