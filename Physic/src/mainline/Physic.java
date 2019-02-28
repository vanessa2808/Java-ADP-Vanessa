package mainline;
public class Physic {

	public static double sum(double f[]) {
		double s=0;
		for(int  i= 0; i<=25; i++) {
			s= s+ 0.5*1.0*(f[i]+f[i+1])*0.1;
		}
		return s;
	}
	public static void main(String[]args) {
		
		double f[]= {11.3, 11.0, 12.6, 13.3, 17.3, 23.9, 29.4, 35.3, 40.2, 42.8, 44.2, 44.1, 43.9, 44.9, 44.1, 43.3, 42.7, 38.3, 33.4, 26.1, 20.0, 18.1, 17.1, 14.2, 15.9, 16.8,  14.3};
		System.out.println(Physic.sum(f));
	}
}
