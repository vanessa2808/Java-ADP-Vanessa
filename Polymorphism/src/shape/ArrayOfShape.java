package shape;
import java.util.Scanner;
public class ArrayOfShape {
	private int n;
	private Shape1 [] a= new Shape1 [100];
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Shape"+ i +":");
			System.out.println("1-Square/2-Rectangle/3-Cicle/4-Triangle");
			Shape1 f;
			int choice=sc.nextInt();
			if(choice==1) {
				f=new Square();
				f.input();
				a[i]= f;
			}
			else if(choice==2) {
				f=new Rectangle();
				f.input();
				a[i]=f;
			}
			else if(choice==3) {
				f=new Circle();
				f.input();
				a[i]= f;
			}
			else if(choice==4) {
				f=new Triangle();
				f.input();
				a[i]=f;
			}	
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
			System.out.println("Chu vi: ");
			System.out.println(a[i].circumference());
			System.out.println("Dien tich: ");
			System.out.println(a[i].area());
		}
	}
	/*
	 * @param: max Area
	 */
	public double maxArea() {
		double max=a[0].area();
		for(int i=1;i<n;i++) {
				if(a[i].area()>max) {
					max=a[i].area();
			}
		}
		return max;
	}
	/*
	 *@param: averageCircumference
	 */
	public double avarage() {
		double s=0;
		int dem=0;
		for(int i=0;i<n;i++) {
			s=s+a[i].circumference();
			dem=dem+1;
		}
		return s/dem;
	}
	/*
	 * @param: list circle
	 */
	public void listCircle() {
		for(int i=0;i<n;i++) {
			if(a[i] instanceof Circle) {
				a[i].output();
			}
		}
	}
	/*
	 * @param: sort area
	 */
	public void sortArea() {
		Shape1 temp;
		for (int i = 0; i < n ; i++) {
			for (int j = i + 1; j < n ; j++) {
				if (a[i].area()<a[j].area()) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String [] args) {
		ArrayOfShape yen=new ArrayOfShape();
		yen.input();
		yen.sortArea();
		yen.output();
	}


}
