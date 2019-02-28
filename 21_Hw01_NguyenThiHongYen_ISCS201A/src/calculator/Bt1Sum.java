package calculator;
	import java.util.Scanner;
	public class Bt1Sum
	{
		private static Scanner kb;

		public static void main(String[]args)
		{
		kb = new Scanner(System.in);
		System.out.println(" pls enter a");
		int a= kb.nextInt();
		System.out.println("pls enter b");				
		int b= kb.nextInt();
		int sum = a+b;
		System.out.println(a+"+"+b+"="+sum);
		double divide =1.0*a/b;
		System.out.println("division: "+divide);
		
	}
}
