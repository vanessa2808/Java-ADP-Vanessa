package points;
import java.util.Scanner;
public class Points
{
	private static Scanner sc;
	private double obscissa,ordinate;
	public Points()
	{

	}
	public Points(int ob,int or)
	{
		this.obscissa=ob;
		this.ordinate=or;
	}
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.print("\t   enter obscissa: ");
		this.obscissa=sc.nextDouble();
		System.out.print("\t   enter ordinate: ");
		this.ordinate=sc.nextDouble();
	}
	public double getobscissa() {
		return this.obscissa;
	}
	public double getordinate() {
		return this.ordinate;
	}
	public void setobscissa(double obscissa) {
		this.obscissa=obscissa;
	}
	public void setordinate(double ordinate) {
		this.ordinate=ordinate;
	}
	public void output() 
	{
		System.out.println("\t     ==> ("+obscissa+";"+ordinate+")");
	}
	public Points coordinate(Points X) {
		Points AX =new Points();
		AX.obscissa=X.obscissa-this.obscissa;
		AX.ordinate=X.ordinate-this.ordinate;
		return AX;
	}
	public double takeSlopeCoefficientA(Points B) {
		return((B.ordinate-this.ordinate)/(B.obscissa-this.obscissa));
	}
	public double takeSlopeCoefficientB(Points B) {
		return((this.ordinate*(B.obscissa-this.obscissa))-(this.obscissa*(B.ordinate-this.ordinate)))/(B.obscissa-this.obscissa);
	}
	public double  DistancesPoints1 (Points B)
	{
		return Math.sqrt(Math.pow(B.obscissa-this.obscissa,2)+Math.pow(B.ordinate-this.ordinate, 2));
	}

	public Double TrianglePoints(Points B,Points C) 
	{
		double sc1=this.DistancesPoints1(B);
		double sc2=this.DistancesPoints1(C);
		double sc3=B.DistancesPoints1(C);
		if(sc1+sc2>sc3 && sc3+sc2>sc1 && sc1+sc3>sc1) 
		{
			double p=(sc1+sc2+sc3)/2;
			return Math.sqrt(p*(p-sc1)*(p-sc2)*(p-sc3)); 
		}
		else
			return null;
	}
	public static void main(String[]args) 
	{
		System.out.print("Toa do diem A: ");
		Points A= new Points();
		A.input();
		A.output();
		System.out.print("Toa do diem B: ");
		Points B=new Points();
		B.input();
		B.output();
		System.out.print("Toa do diem C: ");
		Points C=new Points();
		C.input();
		C.output();

		Points AB=A.coordinate(B);
		System.out.println("Coordinate AB:");
		AB.output();
		Points AC=A.coordinate(C);
		System.out.println("Coordinate AC: ");
		AC.output();
		Points BC=B.coordinate(C);
		System.out.println("Coordinate BC: ");
		BC.output();
		System.out.println("Take slope coefficientA of AB: ");
		System.out.println(A.takeSlopeCoefficientA(B));
		System.out.println("Take slope coefficientA of AC: ");
		System.out.println(A.takeSlopeCoefficientA(C));
		System.out.println("Take slope coefficientA of BC: ");
		System.out.println(B.takeSlopeCoefficientA(C));
		
		System.out.println("Take slope coefficientB of AB: ");
		System.out.println(A.takeSlopeCoefficientB(B));
		System.out.println("Take slope coefficientB of AC: ");
		System.out.println(A.takeSlopeCoefficientB(C));
		System.out.println("Take slope coefficientB of BC: ");
		System.out.println(B.takeSlopeCoefficientB(C));
		
		System.out.print("AB: ");
		System.out.println(A.DistancesPoints1(B));

		System.out.print("AC: ");
		System.out.println(A.DistancesPoints1(C));

		System.out.print("BC: ");
		System.out.println(B.DistancesPoints1(C));

		System.out.print("area: ");
		System.out.println(A.TrianglePoints(B, C));
	}
}
