package fileinputquestion2;
import java.io.*;
import java.util.*;
public class Temperature2 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input=new Scanner(new File("Weather2.txt"));
		double prev=input.nextDouble();
		while(input.hasNext()) {
			if(input.hasNextDouble()) {
				double next=input.nextDouble();
				System.out.println(prev+ " to  " +  next  +", change = "+ (next- prev));
				prev=next;
			}
			else 
				input.next();

		}
	}
}
