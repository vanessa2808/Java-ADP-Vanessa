package teacher;
import java.util.Scanner;
public class DateOfBirth {
	private int day,month,year;
	public DateOfBirth() {
		this.day=1;
		this.month=1;
		this.year=1990;
	}
	public DateOfBirth(int day, int month,int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
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
		do {
			Scanner sc=new Scanner(System.in) ;
			System.out.print("input "+s+":");
			x=sc.nextDouble();
		}while(x<start || x>end);
		return x;
	}
	public void input() 
	{
		Scanner sc= new Scanner(System.in);
		this.month=(int) input("MONTH",this.month,1,12);
		this.day=(int) input("DAY",this.day,1,maxDay());
		this.year=(int) input("YEAR", this.year,1990,5000);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day<1 || day> maxDay()) this.day=1;
		else this.day= day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1 || month >12) this.month=1;
		else this.month=month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<1990 || year> 5000) this.year=1990;
		else this.year=year;
	}
	public void output() 
	{
		System.out.println("DATE OF BIRTH: "+day+"/"+month+"/"+year);
	}
	public static void main(String[]args) 
	{
		// goi ham khong doi so
		DateOfBirth yen= new DateOfBirth();
		yen.input();
		yen.output();

	}
}
