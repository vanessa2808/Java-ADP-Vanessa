package test;

import java.util.Scanner;

public class Address {
	public int number;
	public String street, district,city;
	public Address() {
		this.number=1;
		this.street=null;
		this.district=null;
		this.city=null;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int number, String street, String district, String city) {
		if(number<0) this.number=1;
		else this.number=number;
		this.street=street;
		this.district=district;
		this.city=city;
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.print("enter number:");
		number=kb.nextInt();
		System.out.print("enter street:");
		kb.nextLine();
		street=kb.nextLine();
		System.out.print("enter district:");
		district=kb.nextLine();

		System.out.print("enter city:");
		city=kb.nextLine();
	}
	public void output() {
		System.out.println(number+" "+street+","+district+","+city);
	}
	public static void main(String[] args) {
		Address add=new Address();
		add.input();
		add.output();
		Address add1=new Address(1,"Khuc Hao","Son Tra","Da Nang");
		add1.output();
	}
	
}