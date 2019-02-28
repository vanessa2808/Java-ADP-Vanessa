package bookmanagment;
import java.util.Scanner;
public class Book {
	private static Scanner sc;
	private String bookCode, bookTitle,author;
	private int year,bookQuatity;
	private double bookUnitPrice;
	// Constructor for book
	public Book() 
	{
		this.bookCode=this.bookTitle=this.author= "";
		this.year=0;
		this.bookQuatity=0;
		this.bookUnitPrice=0;
	}
	public Book(String id, String bT, String A, int y,int b,double p) {
		this.bookCode=id;
		this.bookTitle=bT;
		this.author=A;
		this.year=y;
		this.bookQuatity=b;
		this.bookUnitPrice=p;
	}
	// @param : input to enter items
	public void input() {
		sc=new Scanner(System.in);
		System.out.println(" Enter Book Code: ");
		bookCode=sc.nextLine();
		System.out.println(" Enter Book Title: ");
		bookTitle=sc.nextLine();
		sc.nextLine();
		System.out.println(" Enter Author: ");
		author=sc.nextLine();
		System.out.println(" Enter Published year: ");
		year=sc.nextInt();
		System.out.println(" Enter Book Unit Price: ");
		bookUnitPrice=sc.nextInt();
		System.out.println("Enter Book Quatity: ");
		bookQuatity=sc.nextInt();
	}
	//@param: using get and set
	public String getbookCode() {
		return this.bookCode;
	}
	public String getbookTitle() {
		return this.bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	public int getBookQuatity() {
		return bookQuatity;
	}
	public double getbookUnitPrice() {
		return bookUnitPrice;
	}
	public void setBookCode(String bookCode) {
		this.bookCode=bookCode;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle=bookTitle;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setBookQuatity(int bookQuatity) {
		this.bookQuatity=bookQuatity;
	}
	//@param :output
	public void output() {
		System.out.println(getbookCode());
		System.out.println(getbookTitle());
		System.out.println(getAuthor());
		System.out.println(getYear());
		System.out.println(getbookUnitPrice());
		System.out.println(getBookQuatity());
	}

	//@param : calculate the total of sum price
	public double sumPrice() 
	{
		return getBookQuatity()*getbookUnitPrice();
	}
	//@param : calculate the transportprice
	public double transportPrice() {
			if(getBookQuatity()>50 && getBookQuatity()<=500) return (0.02*sumPrice() );
			else 
				if(getBookQuatity()>500) return 0.05*sumPrice();
			return sumPrice();
	}
	public static void main(String[]args) 
	{
		Book yen=new Book();
		yen.input();
		yen.output();
		yen.setBookCode("AB");
		System.out.println(yen.sumPrice());
		System.out.println(yen.transportPrice());
	
	}
}
