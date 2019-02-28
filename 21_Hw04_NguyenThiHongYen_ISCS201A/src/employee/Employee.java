package employee;
import java.util.Scanner;
public class Employee extends Person
{
	private double salary;
	public Employee() 
	{
		super();
		this.salary=0;
	}
	public Employee(String name,boolean sex,double salary,DateOfBirth dob1,Address add1 ) 
	{
		super(name,sex,dob1,add1);
		this.salary=salary;	
	}
	public void input() 
	{
		super.input();
		Scanner sc= new Scanner (System.in);
		System.out.println(" salary : ");
		salary=sc.nextDouble();
	}
	public void output() 
	{
		super.ouput();
		System.out.println("salary: "+this.salary);
		
	}
	public static void main(String[]args) 
	{
		DateOfBirth dob1= new DateOfBirth(12,12,1999);
		Address add1= new Address("12A","ponds",3,"newyork");
		Employee p2= new Employee ("trang",false,1000,dob1,add1);
		p2.output();
		System.out.println("_________________________________");
		
		Employee yen = new Employee();
		yen.input();
		yen.output();
		
		
	}
	
}