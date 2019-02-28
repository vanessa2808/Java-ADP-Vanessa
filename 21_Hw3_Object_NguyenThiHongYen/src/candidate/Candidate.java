package candidate;
import java.util.Scanner;
public class Candidate
{
	private static  Scanner sc;
	private double testmark1,testmark2,testmark;
	private int day,month,year;
	private String name,codeID;
	public  Candidate() 
	{
		this.day=1;
		this.month=1;
		this.year=1990;
	}
	public Candidate(int d,int m,int y, int c, double t1, double t2,double t3,String n)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		this.testmark1=t1;
		this.testmark2=t2;
		this.testmark=t3;
		this.name=n;
	}
	public double gettestmark1() {
		return this.testmark1;
	}
	public double gettestmark2() {
		return this.testmark2;
	}
	public double gettestmark() {
		return this.testmark;
	}
	public int getday() {
		return this.day;
	}
	public int getmonth() {
		return this.month;
	}
	public int getyear() {
		return this.year;
	}
	public String getnamme() {
		return this.name;
	}
	public String getcodeID() {
		return this.codeID;
	}
	public void settestmark1(double testmark1) {
		this.testmark1=testmark1;
	}
	public void settestmark2(double testmark2) {
		this.testmark2=testmark2;
	}
	public void settestmark(double testmark) {
		this.testmark=testmark;
	}
	public void setday(int day) {
		this.day=day;
	}
	public void setmonth(int month) {
		this.month=month;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setcodeID(String codeID) {
		this.codeID=codeID;
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
		sc=new Scanner(System.in) ;
		do {
			System.out.print("input "+s+":");
			x=sc.nextDouble();
		}while(x<start || x>end);
		return x;
	}
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("___________________________________");
		System.out.print("CodeID: ");
		this.codeID=sc.nextLine();
		sc.nextLine();
		System.out.print("enter name: ");
		this.name=sc.nextLine();
		this.month=(int) input("month",this.month,1,12);
		this.day=(int) input("day",this.day,1,maxDay());
		this.year=(int) input("year", this.year,1990,5000);
		this.testmark1= input("testmark1: ",this.testmark1,0,10);
		this.testmark2= input("testmark2: ",this.testmark2,0,10);
		this.testmark= input("testmark ",this.testmark,0,10);
		System.out.println("________________");
	}
	public void output() 
	{
		System.out.println("CodeID: "+codeID);
		System.out.println("name: "+name);
		System.out.println("day: "+day);
		System.out.println("month: "+month);
		System.out.println("year: "+year);
		System.out.println("testmark1: "+testmark1);
		System.out.println("testmark2: "+testmark2);
		System.out.println("testmark: "+testmark);
	}
	public void average() 
	{
		double s2=(((this.testmark1+this.testmark2)/2)+(this.testmark*2))/3;
		System.out.println("average: "+s2);
		if(s2>=8 && s2<=10) System.out.println("good");
		if(s2>=7 && s2<8) System.out.println("Frairly good");
		if(s2>5 && s2<7) System.out.println("Average");
		if(s2<5) System.out.println("fail");
	}
	public static void main(String[]args) 
	{
		Candidate yen1=new Candidate();
		System.out.println("candidate 1: ");
		yen1.input();
		yen1.output();
		yen1.average();
		
		
		System.out.println();
		Candidate yen2=new Candidate();
		System.out.println("candidate 2: ");
		yen2.input();
		yen2.output();
		yen2.average();
	}
}
