package employee;

import java.util.Scanner;

public class DateOfBirth {
	private int day,month,year;
	public DateOfBirth() {
		this.day=1;
		this.month=1;
		this.year=1990;
	}
	public DateOfBirth(int day, int month,int year) 
	{
		if(month<1 || month >12) this.month=1;
		else this.month=month;
		if(day<1 || day> maxDay()) this.day=1;
		else this.day= day;
		if(year<1990 || year> 5000) this.year=1990;
		else this.year=year;
	}
	public int maxDay() 
	{
		if(month==4 || month== 6 || month==9 || month ==11) return 30;
		else 
		{
			if(month ==2) 
				if((year%4==0 && year%100!=0)|| year %400==0)
					return 29;
				else 
					return 28;
			else return 31;
		}
	}
	public double input(String s,double x,int start,int end) {
		Scanner sc=new Scanner(System.in) ;
		do {
			System.out.print("input "+s+":");
			x=sc.nextDouble();
		}while(x<start || x>end);
		return x;
	}
	public void input() 
	{
		Scanner sc= new Scanner(System.in);
		this.month=(int) input("month",this.month,1,12);
		this.day=(int) input("day",this.day,1,maxDay());
		this.year=(int) input("year", this.year,1990,5000);
	}
	public void output() 
	{
		System.out.println("Date Of Birth: "+day+"/"+month+"/"+year);
	}
	public static void main(String[]args) 
	{
		// goi ham khong doi so
		DateOfBirth yen= new DateOfBirth();
		yen.input();
		yen.output();
	
		DateOfBirth dob1= new DateOfBirth(12,12,1999);
		dob1.output();
		
	
	}
}
