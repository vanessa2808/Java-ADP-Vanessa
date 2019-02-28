package teacher;
import java.util.Scanner;
public class FullTimeTeacher extends Teacher
{
	private double allowance,bonus;
	public FullTimeTeacher() 
	{
		super();
		this.allowance=0;
		this.bonus=0;
	}
	public FullTimeTeacher(String name,double yearofexperience, DateOfBirth dob,Address add,double allowance,double bonus) 
	{
		super(name,yearofexperience,dob,add);
		this.allowance=allowance;
		this.bonus=bonus;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		super.input();
		System.out.println("enter allowance: ");
		allowance=sc.nextDouble();
		System.out.println("enter bonus: ");
		bonus=sc.nextDouble();
	}
	@Override
	public void output() 
	{
		super.output();
		System.out.println("ALLOWANCE: "+allowance);
		System.out.println("BONUS: "+bonus);
	}
	public double payment() 
	{
		return basicSalary()+allowance+bonus;
	}
	public double getPayMent() {
		return payment();
	}
	public static void main(String[]args) 
	{
		FullTimeTeacher yen=new FullTimeTeacher();
		yen.input();
		yen.output();
		System.out.print("payment: ");
		System.out.println(yen.payment());
	}

}
