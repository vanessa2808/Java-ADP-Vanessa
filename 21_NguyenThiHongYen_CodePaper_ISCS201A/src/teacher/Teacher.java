package teacher;
import java.util.Scanner ;
public abstract class Teacher 
{
	protected String name;
	protected double yearofexperience;
	protected DateOfBirth dob;
	protected Address add;
	public Teacher() 
	{
		this.name=null;
		this.yearofexperience=0;
		this.dob=null;
		this.add=null;
	}
	public Teacher(String name,double yearofexperience, DateOfBirth dob,Address add) 
	{
		this.name=name;
		this.yearofexperience=yearofexperience;
		setDob(dob);
		this.add=add;
	}
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name: ");
		name=sc.nextLine();
		System.out.print("enter yearofexperience: ");
		yearofexperience=sc.nextDouble();
		dob=new DateOfBirth();
		dob.input();
		add=new Address();
		add.input();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getYearofexperience() {
		return yearofexperience;
	}
	public void setYearofexperience(double yearofexperience) {
		this.yearofexperience = yearofexperience;
	}
	public DateOfBirth getDob() {
		return dob;
	}
	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public void output() {
		System.out.println("NAME: "+name);
		System.out.println("YEAR OF EXPERIENCE: "+yearofexperience);
		dob.output();
		add.output();
	}
	public double basicSalary() 
	{
		double s=1800000.0;
		if(yearofexperience<10)  return  yearofexperience*s*(3.1);
		else if(yearofexperience>=10 && yearofexperience<20)  return yearofexperience*s*(3.5);
		else 
			return yearofexperience*s*(3.95);
	}
	public abstract double payment() ;
	public abstract double getPayMent() ;
	public static void main(String[]args) 
	{
		Teacher yen=new FullTimeTeacher();
		yen.input();
		yen.output();
		System.out.println(yen.basicSalary());
	}
}
