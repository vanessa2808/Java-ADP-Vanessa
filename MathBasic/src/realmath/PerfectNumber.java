package realmath;
import java.util.Scanner;
public class PerfectNumber {
	private int n;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
	}
	public Boolean printNNumber(int x) {
		int s=1;
		for(int i=2;i<=x/2;i++) {
				if(x%i==0) {
					s=s+(x/i);
				}
		}
			if(s==x) return true;
		else return false;
	}
	public void output() {
		System.out.println(n+" so hoan thien dau tien la: ");
		for(int i=2;i<=n;i++) {
			Boolean kt= printNNumber(i);
			if(kt==true) System.out.println(i);
		}
	}
	public Boolean FrimeNumber(int x) {
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	public void output1() {
		System.out.println(n+ " so nguyen to dau tien la: ");
		for(int i=2;i<=n;i++) {
			Boolean kt= FrimeNumber(i);
			if(kt==true) System.out.print(i);
		}
	}
	public static void main(String[]args) {
		PerfectNumber yen= new PerfectNumber();
		yen.input();
		yen.output();
	}
}


