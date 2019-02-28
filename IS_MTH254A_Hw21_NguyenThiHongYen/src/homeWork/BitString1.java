package homeWork;
import java.util.Scanner;
public class BitString1 {
	private static int [] a= new int [100];
	private int n;
	public void input() {
		while(n<3) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter n: ");
			n=sc.nextInt();
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	public  static void deQuy(int i, int n) {
	        for (int k = 0; k <= 1; k++) {
	            a[i] = k;
	            if (i == n - 1) {
	                for (int j = 0; j < n; j++) {
	                    System.out.print(a[j]);
	                }
	                System.out.println("");
	            } else {
	                deQuy(i + 1, n);
	            }
	        }
	    }
	    
	    static void nhiPhan(int n) {
	        deQuy(0, n);
	    }
	    
	    public static void main(String[] args) {
	    	BitString1 yen= new BitString1();
	       yen.input();
	      yen.deQuy(0, 2);
	      
	
}
}
