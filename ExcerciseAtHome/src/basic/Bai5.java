package basic;
import java.util.Scanner;
public class Bai5
{
	int n;
	private static Scanner sc;
	void input() 
	{
		sc=new Scanner(System.in);
		boolean check=false;
		int n=0;
		while(!check) 
		{
			System.out.println(" ");
			try {
				n=sc.nextInt();
				check=true;
			}catch (Exception e) {
				System.out.println("ban phai nhap so! hay nhap lai...");
				sc.nextLine();
			}
		}
	}
		void calculate() 
		{
			System.out.print(" 2");
			
		}

	}


