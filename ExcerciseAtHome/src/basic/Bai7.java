package basic;
import java.util.Scanner; 
public class Bai7 {
	private static Scanner sc;
	int n;
	void input() {
		sc=new Scanner(System.in);
		do {
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		}while(n<=0);
	}
	void calculate() 
	{
		int f []= new int[n+1];
		f[0]= 1; f[1]= 1;
		for(int i=2;i<=n;i++)
		{	
			f[i]= f[i-1]+f[i-2];
		}
		System.out.println("So Fibonanci thu "+n+" la: f["+n+"]= "+f[n]);
	}
	public static void main(String[] args) 
	{
		Bai7 yen= new Bai7();
		yen.input();
		yen.calculate();
	}
} 