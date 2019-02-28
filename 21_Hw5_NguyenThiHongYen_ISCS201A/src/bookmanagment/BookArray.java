package bookmanagment;
import java.util.Scanner;
public class BookArray {
	private static Scanner sc;
	private Book []a=new Book[100];
	private int n;
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(" Enter book "+ i+": ");
			Book b=new Book();
			b.input();
			a[i]=b;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.println("------------------------");
			System.out.println("Book" + i+ ":");
			a[i].output();
		}
	}
	// @param: the sum of book Price
	public double sumBookPrice() {
		double t=0;
		for(int i=0;i<n;i++) {
			double s=a[i].transportPrice();
			t=t+s;
		}
		return t;
	}
	// @param: delete a book with specific code
	public void remove(int index) {
		for(int i= index;i<n;i++) {
			a[i]=a[i+1];
		}
		n--;
	}
	//C1: 
	public void contain(String specifiedCode ) {
		for(int i=n-1;i>=0;i--) {
			if(specifiedCode.equals(a[i].getbookCode())) {
				remove(i);
			}
		}
	}
	//C2:
	public void delete() {
		sc=new Scanner(System.in);
		System.out.println("Enter coID: ");
		String coID=sc.nextLine();
		for(int i=n-1;i>=0;i--) {
			if(a[i].getbookCode().equals(coID)) remove(i);
		}
	}
	// @param : find a specified code
	//C1
	public void findBook(String book) {
		for(int i=0;i<n;i++) {
			if(book.equals(a[i].getbookCode())) {
				a[i].output();
			}
		}
	}
	//C2
	public void find() {
		sc=new Scanner(System.in);
		System.out.println("Enter coID: ");
		String coID=sc.nextLine();
		for(int i=0;i<n;i++) {
			if(a[i].getbookCode().equals(coID)) {
				System.out.println("Book"+ i);
				a[i].output();
			}
		}
	}
	// @param: find the book with largest quatity in the library

	public int largestBook() {
		int max=a[0].getBookQuatity();
		int index=0;
		for(int i=0;i<n;i++) {
			if(max<a[i].getBookQuatity()) {
				max=a[i].getBookQuatity();
				index=i;
			}
		}
		System.out.println("Book"+  index);
		return max;
	}
	public void add() {
		Book b=new Book();
		b.input();
		a[n]=b;
		n++;
	}
	// create the graphics user interfere
	public void bookInformation() {
		int o ;
		do {
			System.out.println("-------------------------------------- More options to know about the information of book ------------------------------------------");
			System.out.println("1 - ADD A NEW BOOK ");
			System.out.println("2 - DELETE A BOOK  ");
			System.out.println("3 - FIND A BOOK ");
			System.out.println("4 - LARGEST QUATITY OF BOOK ");
			System.out.println("5 - LIST");
			System.out.println("6 - QUIT");
			sc=new Scanner(System.in);
			System.out.print("   Enter a command from 1-6: ");
			o=sc.nextInt();
			switch(o) 
			{
			case 1: System.out.println(" 			    \t ADD A NEW BOOK : 			\t 	");	//@param: add a new book
			add();
			output();
			break;
			case 2: System.out.println("		        \t DELETE A BOOK		        \t "   ); //@param : delete a book with specific code
			contain("AB12");
			output();
			break;
			case 3: System.out.println("                \t  FIND A BOOK                 \t"    );  //@param : find a book with specific code
			findBook("AB12");
			//output();
			break;
			case 4 : System.out.println("               \t FIND A LARGEST BOOK          \t    "); //@param : find largest quantity book
			System.out.println("Max quatity: ");
			System.out.println(largestBook());
			break;
			case 5 : System.out.println("   			\t LIST OF BOOK   				\t    ");  //@param : List of book
			output();
			break;
			case 6: System.out.println("=--------you got quitted of system----------="); 	break;  //@param : quit out of system
			default :
				System.out.println("Enter your command invalidly again......!");
				break;
			}
		}while(o!=6);
	}
	public static void main(String[]args) {
		BookArray yen=new BookArray();
		yen.input();
		yen.bookInformation();
	}
}
