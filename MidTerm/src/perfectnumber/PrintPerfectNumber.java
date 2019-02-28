package perfectnumber;
import java.util.Scanner;
public class PrintPerfectNumber {
	private int n;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
	}
	public void check() {
		int s=0;
		int i;
		for( i = 1;i<n;i++){
			for(int j=1; j<i;j++) {
				if(i%j==0) s=s+j;
			}
			if(i==s)
				System.out.println(i);
		}
	}
	
	public static void main(String[]args ) {
		PrintPerfectNumber yen=new PrintPerfectNumber();
		yen.input();
		yen.check();
	}
}
