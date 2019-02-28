package encapsulation;
public class ToanHoc {
	public static int min(int a, int b) {
		int min= a;
		if(min>b) min=b;
		return min;
	}
	public static int min(int a, int b, int c) {
		int min=a;
		if(min>b) min=b;
		else if(min>c) min=c;
		return min;
	}
	public static int min(int []a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) min=a[i];
		}
		return min;
	}
	public static void main(String[]args) {
		System.out.println(ToanHoc.min(5, 6));
		System.out.println(ToanHoc.min(3, 5, 6));
		int [] a= {3,4,5,7,8};
		System.out.println(ToanHoc.min(a));
		}
}
