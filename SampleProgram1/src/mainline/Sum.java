package mainline;

public class Sum {
	public double solve() {
		double s=0;
		for(int i=2;i<=6;i=i+4) {
			s=(s + 1/i- 1/i+2)*1.0;
			
		}
		return s;
	}
	public static void main(String []args) {
		Sum yen=new Sum();
		System.out.println(yen.solve());
	}
}
