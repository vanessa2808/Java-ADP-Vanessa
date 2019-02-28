package teacher;
import java.util.Scanner;
public class Address
{
	private String numberhouse,street,city;
	private int dictric;
	public Address() 
	{
		this.street=this.city=this.numberhouse=null;
		if(dictric<1) this.dictric=1;
	}
	public Address (String numberhouse,String street,int dictric,String city) 
	{
		this.numberhouse=numberhouse;
		this.street=street;
		this.dictric=dictric;
		this.city=city;
	}
	public String getNumberhouse() {
		return numberhouse;
	}
	public void setNumberhouse(String numberhouse) {
		this.numberhouse = numberhouse;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDictric() {
		return dictric;
	}
	public void setDictric(int dictric) {
		this.dictric = dictric;
	}
	public void input() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter numberhouse: ");
		numberhouse=sc.nextLine();
		System.out.print("enter street: ");
		street=sc.nextLine();
		do {
			sc=new Scanner(System.in);
			System.out.print("enter dictric:");
			dictric=sc.nextInt();
		}while(dictric<1);
		sc.nextLine();
		System.out.print("enter city: ");
		city=sc.nextLine();
	}
	public void output() 
	{
		System.out.println("ADDRESS: "+numberhouse+" " +street+" "+dictric+" "+city);
	}
	public static void main(String []args) 
	{
		Address add= new Address();
		add.input();
		add.output();
		


	}

}

