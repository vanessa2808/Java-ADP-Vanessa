package basic;
import java.util.Scanner; 
public class Bai2 {

	public static int nhap(){
		Scanner input= new Scanner(System.in); 
		boolean check= false;
		int n=0; 
		while(!check){
			System.out.print(" "); 
			try{
				n= input.nextInt(); 
				check= true;

			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai..."); 
				input.nextLine();
			}
		}
		return (n);
	}

	public static void doiCoSo(int n,int b){ 
		if(n>=b) doiCoSo(n / b, b);
			if(n % b>9) System.out.printf("%c",n%b+55); 
		else
			System.out.print((n % b));
	}


	public static void main(String[] args) {
		System.out.println("Nhap n");
		int n= nhap();
		System.out.println("Nhap vao co so can chuyen sang b"); 
		int b= nhap();
		System.out.println("So " +n+ " chuyen sang co so " +b+ " thanh: "); 
		doiCoSo(n,b);
	}
}