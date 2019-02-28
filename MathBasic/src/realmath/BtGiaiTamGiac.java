package realmath;
import java.util.Scanner;
public class BtGiaiTamGiac
{
	private static Scanner sc;
	double a,b,c;
	void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("nhap canh a: ");
		a=sc.nextDouble();
		System.out.println("nhap canh b: ");
		b=sc.nextDouble();
		System.out.println("nhap canh c: ");
		c=sc.nextDouble();
	}
	void calculate()
	{
		
		if(a<=0 || b<=0 ||  c<=0)
		{
			System.out.println("3 canh a,b,c khong tao thanh tam giac");
		}
		
		else 
		{
			if(a+b<=c || a+c<=b || b+c<=a)
			{
				System.out.println("3 canh a,b,c khong tao thanh tam giac");
			}
			else
			{
				System.out.println("3 canh a,b,c tao thanh tam giac");
			}
			    if (a==b && b==c && a==c)
	
			    {
			    	System.out.println("3 canh tao thanh tam giac deu");
			    }
			    if((c==b && b!=a) || (b==a && a!=c) || (c==a && a!=b))
			    { 
			    	System.out.println("3 canh tao thanh tam giac can");
			    }
			    if((a==b || b==c || a==c) && ((a*a==b*b+c*c || b*b==a*a+c*c) || c*c== a*a+b*b))
			    {
			    	System.out.println("3 canh tao thanh tam giac vuong can");
			    }
			      if((a!=b && b!=c) && (a*a==b*b+c*c || b*b==a*a+c*c) || c*c== a*a+b*b)
                {
			    	System.out.println("3 canh tao thanh tam giac vuong");
                }
			      if((a!=b && b!=c) && (a*a!=b*b+c*c && b*b!=a*a+c*c) && c*c!= a*a+b*b)
			     {			     
			    	System.out.println("3 canh tao thanh tam giac thuong");
			     }
			    double p= (a+b+c)/2;
			    double S=(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
			    
			    double C=(a+b+c);
			    System.out.println("dien tich tam giac la: "+S);
			    System.out.println("chu vi tam giac la: "+C);
		        }
			}
		
				
	public static void main(String[]args) 
	{
		BtGiaiTamGiac yen=new BtGiaiTamGiac();
		yen.input();
		yen.calculate();
	}
	}