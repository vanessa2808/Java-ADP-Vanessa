package fraction;
import java.util.Scanner ;
public class Fraction 
{
	private static Scanner sc;
	private int numerator,denominator;
	public Fraction () {
		this.denominator=1;
	}
	public  Fraction(int n,int d)
	{
		this.numerator=n;
		this.denominator=d;
	}
	public int getnumerator() {
		return this.numerator;
	}
	public int getdenominator() 
	{
		return this.denominator;
	}
	public void setnumerator(int numerator) {
		this.numerator=numerator;
	}
	public void setdenominator(int denominator) {
		this.denominator=denominator;
	}
	
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.print("      numerator: ");
		this.numerator=sc.nextInt();
		System.out.print("       denominator ");
		this.denominator=sc.nextInt();
	}
	public void  output() 
	{
		System.out.println(numerator+"/"+denominator);
	}
	//lay tu chia mau cua mot phan so ko truyen doi so vi co con tro this
	public double devide() {
		return 1.0*this.numerator/this.denominator;
	}
	public Fraction plus(Fraction f2)
	{
		Fraction f3= new Fraction ();
		f3.numerator=(this.numerator*f2.denominator)+(this.denominator*f2.numerator);
		f3.denominator=this.denominator*f2.denominator;
		return f3;
	}

	public Fraction minus(Fraction f2) 
	{
		Fraction f4=new Fraction();
		f4.numerator=(this.numerator*f2.denominator)-(this.denominator*f2.numerator);
		f4.denominator=this.denominator*f2.denominator;
		return f4;
	}
	public Fraction mutilplication(Fraction f2) 
	{
		Fraction f5=new Fraction();
		f5.numerator=this.numerator*f2.numerator;
		f5.denominator=this.denominator*f2.denominator;
		return f5;
	}
	public Fraction devide (Fraction f2) 
	{
		if(f2.numerator==0) return null;
		Fraction f6=new Fraction();
		f6.numerator=this.numerator*f2.denominator;
		f6.denominator=this.denominator*f2.numerator;
		return f6;
	}

	public static void main(String []args) 
	{
		Fraction yen=new Fraction();
		yen.input();
		System.out.println(yen.getnumerator());
		System.out.println(yen.devide());
		Fraction f1= new Fraction(1,2);
		f1.output();
		Fraction f2=new Fraction(3,4);
		f2.output();
		f2.getnumerator();
		
		
		Fraction f3= f1.plus(f2);
		f3.output();
		/*Fraction f4=f1.minus(f2);
		f4.output();
		Fraction f5=f1.mutilplication(f2);
		f5.output();
		Fraction f6=f1.devide(f2);
		if (f6==null) System.out.println("divide by zero");
		else f6.output();*/


	}
}
