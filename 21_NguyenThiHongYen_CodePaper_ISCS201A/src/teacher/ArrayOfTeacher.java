package teacher;
import java.util.Scanner;
public class ArrayOfTeacher {
	private int  n;
	private Teacher [] a  =new Teacher[100];
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter teacher "+ i);
			System.out.println("1-FullTimeTeacher/ 2-PartTimeTeacher");
			Teacher f;
			int choice= sc.nextInt();
			if(choice==1) {
				f=new FullTimeTeacher();
				f.input();
				a[i]=f;
			}
			else if(choice==2) {
				f= new PartTimeTeacher();
				f.input();
				a[i]=f;
			}
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Teacher[] getA() {
		return a;
	}
	public void setA(Teacher[] a) {
		this.a = a;
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
			System.out.println(a[i].basicSalary());
			System.out.println(a[i].payment());
		}
	}
	/**
	 * 
	 * @param Max Salary
	 */
	public void maxSalary() {
		double max;
		int index=0;
		max=a[0].getPayMent();
		for(int i=1;i<n;i++) {
			if(max<a[i].getPayMent()) {
				max=a[i].getPayMent();
				index=i;
			}
			System.out.println(index);
			a[i].output();
			System.out.println(max);
		}
	}
	/**
	 * 
	 * @param Average Salary
	 */
	public double averageSalary() {
		double s=0;
		int dem=0;
		for(int i=0;i<n;i++) {
			s=s+a[i].getPayMent();
			dem=dem+1;
		}
		return s/dem;
	}

	/**
	 * 
	 * @param Find Year
	 */
	public void findYear(int year) {
		for(int i=0;i<n;i++) {
			if(a[i].getDob().getYear()==year) {
				a[i].output();
			}
		}
	} 
	/**
	 * 
	 * @param delete specified month ( 10 )
	 */
	public void remove(int index) {
		for(int i=index;i<n;i++) {
			a[i]=a[i+1];
		}
		n--;
	}
	public void delete(int month) {
		for(int i=n-1;i>=0;i--) {
			if(a[i].getDob().getMonth()==month) {
				remove(i);
			}
		}
	}
	/**
	 * @param Find Book with specified code street
	 *
	 */
	public  void  contain(String Street ) {
		for(int i=0;i<n;i++) {
			if(Street.equals(a[i].getAdd().getStreet())) {
				a[i].output();
			}
		}
	}

	/**
	 * @param Sort name
	 */
	public void sortName() {
		Teacher temp;
		for (int i = 0; i < n ; i++) {
			for (int j = i + 1; j < n ; j++) {
				if (a[i].getName().compareTo(a[j].getName())>0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		ArrayOfTeacher yen= new ArrayOfTeacher();
		yen.input();
		//yen.contain("nguyen van linh");
		yen.sortName();
		yen.output();

	}
}
