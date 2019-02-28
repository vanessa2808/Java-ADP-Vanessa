package number;
import java.util.Scanner;
public class HomeWork1
{
	int numerator;
	int demoirator;
	private static Scanner sc;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("enter numerator: ");
		numerator=sc.nextInt();
		do {
			System.out.println("demoirator: ");
			demoirator=sc.nextInt();
		}while(demoirator==0) ;
	}
	void output() 
	{
		if (numerator==0) System.out.println(0);
		else 
		{
			int demoirator1=Math.abs(numerator);
			int demoirator2=Math.abs(demoirator);
			
			while (demoirator1 != demoirator2) 
			{
				if(demoirator1 > demoirator2) demoirator1 = demoirator1 - demoirator2;
				else demoirator2 = demoirator2 - demoirator1;	
			}
			
			int numerator3 = numerator / demoirator1, demoirator3 = demoirator / demoirator2;
			
			if(numerator3 > 0 && demoirator3 > 0) System.out.println("phan so: " + Math.abs(numerator3)+"/"+Math.abs(demoirator3));
			
			else 
				
				if(numerator3 < 0 && demoirator3 > 0) System.out.println("phan so: "+-Math.abs(numerator3)+"/"+Math.abs(demoirator3));
			
			if(numerator3 > 0 && demoirator3 < 0) System.out.println("phan so: "+-Math.abs(numerator3)+"/"+Math.abs(demoirator3));
			
			else 
				
				if(numerator3 < 0 && demoirator3 < 0) System.out.println("phan so: "+Math.abs(numerator3)+"/"+Math.abs(demoirator3));

		}	
	}
	public static void main(String[]args) 
	{
		HomeWork1 p1= new HomeWork1();
		p1.input();
		p1.output();
	}
}
