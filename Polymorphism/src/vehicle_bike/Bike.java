package vehicle_bike;

public class Bike extends Vehicle {
	public Bike() {
		System.out.println("Bike is create");
	}
	public Bike(int a, int b) {
		System.out.println("Bike is create"+b);
	}
	//public void run(){system.out.println("Bike is running safety");}
	public void r3() {
		System.out.println("method r3 is called");
	}
	public static void main(String []args) {
		Bike yen=new Bike();
		yen.run(); //cua con
		yen.r1();  //cua cha
		yen.r2(); //cua cha
		yen.r3(); //cua cha
		
		Vehicle Giang =new Vehicle();
		Giang.run(); //cha
		Giang.r1();// cha
		Giang.r2();//cha
		
		Vehicle mai=new Bike();
		mai.run();
		mai.r1();
		mai.r2();
		
		
	}
}
