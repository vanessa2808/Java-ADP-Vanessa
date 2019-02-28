package calculator3;
import java.util.Scanner;
public class QuarticEquation 
{
	private static Scanner sc;
	double a,b,c;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.print("enter a: ");
		a=sc.nextDouble();
		System.out.print("enter b: ");
		b=sc.nextDouble();
		System.out.print("enter c: ");
		c=sc.nextDouble();
	}
	void calculate() 
	{
	   if(a==0) 
		   if( b==0 ) 
			   if(c==0) System.out.println("phuong trinh da cho vo so nghiem");
			   else System.out.println("pt da cho vo nghiem");
		   else
		   {
			   double denta1=-4*b*c;
			   if(denta1==0   ) System.out.println("phuong trinh da cho co 1 nghiem x=0");
			   if(denta1<0) System.out.println("pt da cho vo nghiem");
			   if(denta1>0) 
			   {
				   double x1=Math.sqrt(-c/b);
				   double x2=-Math.sqrt(-c/b);
				   System.out.println("phuong trinh da cho co 2 nghiem: "+"\nx1: "+x1 +"\nx2: "+x2);
			   }
		   }
	   else
	   {
			System.out.println("dat x*x= t   \nphuong trinh da cho tro thanh phuong trinh bac 2 theo t ");
			double denta=(b*b)-(4*a*c);
			if(denta<0) System.out.println("phuong trinh da cho vo nghiem");
			if(denta==0)
			{
				double t=-b/2*a;
			    if(t>0)
			    {
					double x1=Math.sqrt(t);
					double x2=-Math.sqrt(t);
					System.out.println("phuong trinh da cho co 2 nghiem: "+"\nx1: "+x1 +"\nx2: "+x2);
				}
				if(t<0) System.out.println("phuong trinh da cho vo nghiem");
				if(t==0) System.out.println("phuong trinh da cho co mot nghiem x=0");
			} 
			if(denta>0)
			{
				double t1=(-b+Math.sqrt(denta))/(2*a);
				double t2=(-b-Math.sqrt(denta))/(2*a);
				{
					if(t1>0 && t2>0) 
					{
						double x1=Math.sqrt(t1);
						double x2=-Math.sqrt(t1);
						double x3=Math.sqrt(t2);
						double x4=-Math.sqrt(t2);
						System.out.println("phuong trinh da cho co 4 nghiem: "+"\nx1: "+x1+"\nx2: "+x2+"\nx3: "+x3+"\nx4: "+x4);
					}
					if(t1<0 && t2<0) System.out.println("phuong trinh da cho vo nghiem");
					if(t1>0 && t2<0) 
					{
						double x1=Math.sqrt(t1);
						double x2=-Math.sqrt(t1);
						System.out.println("phuong trinh da cho co 2 nghiem: "+"\nx1: "+x1+"\nx2: "+x2);
					}
					if(t1<0 && t2>0) 
					{
						double x1=Math.sqrt(t2);
						double x2=-Math.sqrt(t2);
						System.out.println("phuong trinh da cho co hai nghiem: "+"\nx1: "+x1+"\nx2: "+x2);
					}
					if(t1==0 && t2>0)
					{
						double x1=0;
						double x2=Math.sqrt(t2);
						double x3=-Math.sqrt(t2);
						System.out.println("phuong trinh da cho co 3 nghiem: "+"\nx1: "+x1+"\nx2: "+x2+"\nx3: "+x3);
					}
					if(t1>0 && t2==0) 
					{
						double x1=0;
						double x2=Math.sqrt(t1);
						double x3=-Math.sqrt(t1);
						System.out.println("phuong trinh da cho 3 nghiem: "+"\nx1: "+x1+"\nx2: "+x2+"\nx3: "+x3);
					}
					if((t1==0 && t2<0) || (t1<0 && t2==0))  System.out.println("phuong trinh da cho co 1 nghiem x=0 ");
			  }
		   }
	   }
	}
	
	public static void main(String[]args) 
	{
		QuarticEquation yen=new QuarticEquation();
		yen.input();
		yen.calculate();
	}
}