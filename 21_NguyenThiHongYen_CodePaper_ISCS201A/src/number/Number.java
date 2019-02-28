package number;
import java.util.Scanner;
public class Number{
	private static Scanner sc;
	int n;
	public void input() {
		sc=new Scanner(System.in);
		System.out.println("enter n: ");
		n=sc.nextInt();
	}
	/*int countoddnumber() {
		n=Math.abs(n);
		int s=0;
		do {
			int sd=n%10;
			if(sd%2!=0) s=s+1;
			n=n/10;
		}while(n!=0);
		return s;
	}*/
	public static boolean kiemTraSoHoanHao( int n){
        int tong = 0;
        int temp = n;
        for ( int i = 1; i < temp ; i ++){
            if ( temp % i == 0 ) tong = tong + i;
        }
        if ( tong == temp) return true;
        return false;
    }
	public static void main(String[]args) {
		Number yen=new Number();
		yen.input();
		//System.out.println(yen.countoddnumber());
		Number.kiemTraSoHoanHao(6);

	}
}
