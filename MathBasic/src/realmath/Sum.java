package realmath;

public class Sum {
 public double sum() {
	 double s=0;
	 double dau=1.0;
	 for(int i=2;i<=100;i=i+4) {
		 s= s+ (dau/i)-(dau/(i+2));
		 // s= s+ (dau/i)
		 //dau=-dau;
	 }
	 return s;
 }
 public static void main(String args[]) {
	 Sum yen =new Sum();
	 System.out.println(yen.sum());
 }
}
