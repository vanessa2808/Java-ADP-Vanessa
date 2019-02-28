package number1;
import java.util.Scanner;
public class Mix
{
	private static Scanner sc;
	double a,b;
	String o ;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("enter a: ");
		a=sc.nextDouble();
		System.out.println("enter b: ");
		b=sc.nextDouble();
		System.out.println("enter operation: ");
		o=sc.next();
	}
	void calculate() 
	{
		switch(o) 
		{
		case "+" :System.out.println(a+"+"+b+"="+(a+b)); break;
		case "-":System.out.println(a+"-"+b+"="+(a-b));break;
		case "/":System.out.println(a+"/"+b+"="+(a/b));break;
		case "*":System.out.println(a+"*"+b+"="+(a*b)); break;
		default :System.out.println("no");
		}
	}
	public static void main(String[]args) 
	{
		Mix yen= new Mix();
		yen.input();
		yen.calculate();
	}
}

