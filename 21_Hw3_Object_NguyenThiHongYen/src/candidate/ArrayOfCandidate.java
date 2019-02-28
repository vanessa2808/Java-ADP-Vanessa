package candidate;
import java.util.Scanner;
public class ArrayOfCandidate{
	private static Scanner sc;
	private int n;
	private Candidate[] a = new  Candidate [100];
	public void input() {
		sc=new Scanner(System.in);
		System.out.println(" Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Candidate "+i);
			Candidate f= new Candidate();
			f.input();
			a[i]=f;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.println(" Candidate "+i);
			a[i].output();
			a[i].average();
		}
	}
	public static void main(String[]args) {
		ArrayOfCandidate yen = new ArrayOfCandidate();
		yen.input();
		yen.output();
	}
}
