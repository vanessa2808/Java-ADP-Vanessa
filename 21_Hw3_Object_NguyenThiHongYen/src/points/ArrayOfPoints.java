package points;
import java.util.Scanner;
public class ArrayOfPoints {
	private Points []a=new Points[100];
	private int n;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Point: "+i);
			Points f=new Points();
			f.input();
			a[i]=f;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
	}
	public void isMaxArea()
	{
		double max=0;
		int index1=0;
		int index2=1;
		int index3=2;
		max=a[0].TrianglePoints(a[1], a[2]);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int c=j+1;c<n;c++) {
					double max1=a[i].TrianglePoints(a[j], a[c]);
					if(max1>max) {
						max=max1;
						index1=i;
						index2=j;
						index3=c;
					}
				}
			}
		}
		System.out.println("index1: "+index1 +"    index2: "+index2 +"    index3: "+index3);		
		a[index1].output();
		a[index2].output();
		a[index3].output();
		System.out.println(a[index1].TrianglePoints(a[index2], a[index3]));
	}
	public void isMaxDistance() {
		int index1=0;
		int index2=1;
		double max=a[0].DistancesPoints1(a[1]);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double max1=a[i].DistancesPoints1(a[j]);
				if(max1>max) {
					max=max1;
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println("index1: "+index1+"   index2: "+index2);
		a[index1].output();
		a[index2].output();
		System.out.println(a[index1].DistancesPoints1(a[index2]));
	}
	private Boolean pointOfPlane3(double x,double y) 
	{
		if(x<0 && y<0) return true;
		return false;
	}
	public void pointOfPlane3() {
		for (int i=0;i<n;i++) {
			Boolean kt= pointOfPlane3(a[i].getobscissa(),a[i].getordinate());
			if(kt==true)  a[i].output();
		}
	}
	public void isParallelStraightLineWithOx() {
		int dem=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].takeSlopeCoefficientA(a[j])==0 && a[i].takeSlopeCoefficientB(a[j])!=0) {
					dem=dem+1;
					System.out.println("------------------");
					System.out.println("the coordinate of two points have parallel line with Ox : ");
					System.out.println("index1: "+i+"   index2: "+j);
					System.out.print("a["+i+"]");	a[i].output();
					System.out.print("a["+j+"]");	a[j].output();
					System.out.println("the line equation goes through two points "+"a["+i+"]"+" and "+"a["+j+"]"+" parallel with Ox is : ");
					System.out.println("y"+"="+a[i].takeSlopeCoefficientB(a[j]));
				}
			}
		}
		System.out.println();
		System.out.println("====> THERE ARE "+ dem  +" STRAIGHT LINES GO THROUGH TWO POINTS AND PARALLEL WITH OX");
	}
	public void isStraightLineContainO() {
		int dem=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].takeSlopeCoefficientB(a[j])==0) {
					dem=dem+1;
					System.out.println("------------------");
					System.out.println("the coordinate of two points have line contain O: ");
					System.out.println("index1: "+i+"   index2: "+j);
					System.out.print("a["+i+"]");	a[i].output();
					System.out.print("a["+j+"]");	a[j].output();
					System.out.println("the line equation goes through the coordinate of point "+"a["+i+"]"+" and "+"a["+j+"]"+" contains O: ");
					System.out.println("y"+"="+a[i].takeSlopeCoefficientA(a[j])+"*x");
				}
			}
		}
		System.out.println();
		System.out.println("====> THERE ARE "+ dem  +" STRAIGHT LINES GO THROUGH TWO POINTS AND  CONTAIN O");
	}
	public static void main(String[]args) {
		ArrayOfPoints yen=new ArrayOfPoints();
		yen.input();
		System.out.println("-------------------------------------------------------------------- ");
		System.out.print("Max Area: \t");
		yen.isMaxArea();
		System.out.println("-------------------------------------------------------------------- ");
		System.out.print("Max Distance: \t");
		yen.isMaxDistance();
		System.out.println("------------------------------------------------------------------ ");
		System.out.println("list points involve in plane 3: ");
		yen.pointOfPlane3();
		System.out.println("------------------------------------------------------------------ ");
		yen.isParallelStraightLineWithOx();
		System.out.println("------------------------------------------------------------------ ");
		yen.isStraightLineContainO();
	}
}

