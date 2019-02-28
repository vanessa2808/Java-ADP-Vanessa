package fileinputquestion2;
import java.io.*;
import java.util.*;
public class Temperature1 {
	public static void main(String []args) throws FileNotFoundException{
		Scanner input= new Scanner(new File ("weather.txt"));
		double prev=input.nextDouble();
		for(int i=0;i<=7;i++) {
			double next=input.nextDouble();
			System.out.println(prev+"to"+next+", change = "+ (next- prev));
			prev=next;
		}
				
	}
}
