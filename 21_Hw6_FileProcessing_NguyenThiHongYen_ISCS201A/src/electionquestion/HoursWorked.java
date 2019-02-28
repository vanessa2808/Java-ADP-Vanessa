package electionquestion;
import java.util.*;
import java.io.*;
public class HoursWorked {
	public static void main(String[]args) throws FileNotFoundException{
		Scanner input=new Scanner(new File("poll.txt"));
		while(input.hasNext()) {
			int id=input.nextInt();
			String name=input.next();
			double totalHours=0.0;
			int days=0;
			while(input.hasNextDouble()) {
				totalHours += input.nextDouble();
				days++;
			}
			System.out.println(name+ "(ID#"+id+") worked"+totalHours+"hours("+(totalHours/days)+"hour/day)");
		}
	}
}
