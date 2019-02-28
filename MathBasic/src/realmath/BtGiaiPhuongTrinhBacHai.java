package realmath;
import java.util.Scanner;
public class BtGiaiPhuongTrinhBacHai
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
	double denta;
	double x1,x2,x;
	void calculate()
	
		{if (a==0)
		{
			System.out.println("phuong trinh tro thanh phuong trinh bac 1");
		  if(b==0)
			 if(c==0)
			  System.out.println("phuong trinh bac hai vo so nghiem");
			 else
			  System.out.println("phuong trinh da cho vo nghiem");
		  if(b!=0)
		  	{System.out.println("phuong trinh da cho co mot nghiem "+"X"+"="+-c/b);}
		  }
		
	    if(a!=0)
	    {
		    {System.out.println("Phuong trinh tro thanh phuong trinh bac 2");}
			denta=b*b-4*a*c;
		
			   if(denta<0)
			   
				   System.out.println("phuong trinh da cho vo nghiem");
			   
			  if(denta==0)
			   
				  {System.out.println("phuong trinh da cho co 1 nghiem duy nhat");
				  System.out.println("X"+"="+-b/2*a);}
		       
			  if(denta>0)
				  {System.out.println("phuong trinh da cho co 2 nghiem");
				   x1=(-b+Math.sqrt(denta))/2*a;
				   x2=(-b-Math.sqrt(denta))/2*a;
				   System.out.println("nghiem x1 la: "+"x1"+"="+(-b+Math.sqrt(denta))/2*a);
	               System.out.println("nghiem x2 la: "+"x2"+"="+x2);}
		  }
	    }

		  public static void main(String[] args) 
		  { 
			  BtGiaiPhuongTrinhBacHai yen= new BtGiaiPhuongTrinhBacHai();
			  yen.input();
			  yen.calculate();
		 }
  }