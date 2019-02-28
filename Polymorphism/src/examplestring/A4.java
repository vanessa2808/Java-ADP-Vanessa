package examplestring;

public class A4 {

	public static void main(String[] args) {
		StringBuffer db=new StringBuffer("Hello");
		db.delete(1, 3);
		System.out.println(db); //print Hlo
	}

}
