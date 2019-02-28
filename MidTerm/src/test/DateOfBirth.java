package test;
import java.util.Scanner;
public class DateOfBirth {
	private int day,month,year;
	public DateOfBirth() {
		this.day=1;
		this.month=1;
		this.year=1990;
	}
	public DateOfBirth(int d, int m, int y) {
		this.day=d;
		this.month=m;
		this.year=y;
	}
	// su dung ham get set
	public int maxDay() {
		if(month==4 || month==6 || month ==9 || month ==11 ) 
			return 30;
		else if(month==2) {
			if(year%4==0 && year%100!=0 || year%400==0)
				return 29;
			else return 28;
		}
		else return 31;
	}
	public double input(String s,double x,int start,int end) {
		do {
			Scanner sc=new Scanner(System.in) ;
			System.out.print("input "+s+":");   // invite enter cuz s will replace for month day year
			x=sc.nextDouble();
		}while(x<start || x>end);
		return x;
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		this.month=(int) input("month",this.month,1,12);
		this.day=(int) input("day",this.day,1,maxDay());
		this.year=(int) input("year",this.year,1990,5000);
	}
	public void output() {
		System.out.println("Date of birth" +" "+ day +"/"+month+"/"+year);
	}
	public static void main(String args[]) {
		DateOfBirth yen= new DateOfBirth();
		yen.input();
		yen.output();
	}
}
