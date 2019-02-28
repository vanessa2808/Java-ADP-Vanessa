package employee;
import java.util.Scanner;
public class Person 
{
	protected String name;
	protected boolean sex;
	protected DateOfBirth dob;
	protected Address add;
	public Person() 
	{
		this.name=null;
		this.sex=false;
		this.dob=null;
		this.add=null;
	}
	public Person(String name,boolean sex,  DateOfBirth dob1,Address add1) 
	{
		this.name=name;
		this.sex=sex;
		this.dob=dob1;
		this.add=add1;
	}
	public void input() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Name: ");
		this.name=sc.nextLine();
		System.out.print("Sex: ");
		this.sex=sc.nextBoolean();
		dob= new DateOfBirth();
		dob.input();
		add= new Address();
		add.input();
	}
	public void ouput() 
	{
		System.out.println("Name: "+name);
		if(sex==false)System.out.println("Sex: female");
		else System.out.println("Sex: male");
		dob.output();
		add.output();
	}
	public static void main(String[]args) 
	{
		System.out.println("______________________________");
		Person p1=new Person();
		p1.input();
		p1.ouput();
		System.out.println("______________________________");
		DateOfBirth dob1= new DateOfBirth(12,12,1999);
		Address add1= new Address("12A","ponds",3,"Australia");
		Person p2= new Person ("trang",false,dob1,add1);
		p2.ouput();
		
	}
}
