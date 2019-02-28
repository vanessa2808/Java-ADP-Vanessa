package fraction;
import java.util.Scanner;
public class ArrayOfFraction 
{
	private static Scanner sc;
	private Fraction [] a =new Fraction[100];
	private int n;
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("enter fraction: "+i+": ");
			Fraction f=new Fraction();
			f.input();
			a[i]=f;
		}
	}
	public void output() 
	{
		for(int i=0;i<n;i++) {
			a[i].output();
		}
	}
	//in ra phan so co tu chan
	public void isEvenFration() 
	{
		for(int i=0;i<n;i++) 
		{
			if(a[i].getnumerator()%2==0)
				a[i].output();
		}
	}
	public void isMaxFraction() {
		int index=0;
		double max=1.0*a[0].devide();
		for (int i=1;i<n;i++) {
			if(1.0*a[i].devide()>max) {
				max=1.0*a[i].devide();
			index=i;
			}
		}
		System.out.println("index"+index);
		a[index].output();
	}
	//tinh tong 2 phan so lon nhat
	public void sum()
	{
		Fraction sum=a[0].plus(a[1]);
		double max= 1.0*sum.devide();
		int index1=0;
		int index2=1;
		for (int i=1;i<n-1;i++) {
			sum=a[i].plus(a[i+1]);
			if(1.0*sum.devide()>max) {
				max=1.0*sum.devide();
			index1=i;
			index2=i+1;
			}
		}
		System.out.println("index1: "+index1+"index2: "+index2);
		a[index1].output();
		a[index2].output();
		(a[index1].plus (a[index2])).output();
	}
	//sort phan so
	public void issortdecrease() 	{
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(1.0*a[i].devide()>1.0*a[j].devide()) {
					Fraction temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String []args) {
		ArrayOfFraction yen=new ArrayOfFraction();
		yen.input();
		//yen.sum();
		yen.issortdecrease();
		yen.output();
		/*yen.output();
		yen.isEvenFration();
		yen.isMaxFraction();*/
		
	}
}

