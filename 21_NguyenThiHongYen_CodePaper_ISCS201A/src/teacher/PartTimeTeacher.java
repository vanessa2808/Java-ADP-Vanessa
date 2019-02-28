package teacher;
import java.util.Scanner;
public class PartTimeTeacher extends Teacher
{
	private static Scanner sc;
	private double bonus;
	public PartTimeTeacher() 
	{
		super();
		this.bonus=0;
	}
	public PartTimeTeacher(String name,double yearofexperience, DateOfBirth dob,Address add,double bonus) 
	{
		super(name,yearofexperience,dob,add);
		this.bonus=bonus;
	}
	public void input() 
	{
		super.input();
		sc=new Scanner(System.in);
		System.out.println("enter bonus: ");
		bonus=sc.nextDouble();
	}
	public void output() 
	{
		super.output();
		System.out.println("BONUS"+bonus);
	}
	public double payment() 
	{
		return basicSalary()+bonus;
	}
	public double getPayMent() {
		return payment();
	}
	public static void main(String[]args) 
	{
		PartTimeTeacher yen=new PartTimeTeacher();
		yen.input();
		yen.output();
		System.out.println("payment: ");
		System.out.println(yen.payment());
	}
}
