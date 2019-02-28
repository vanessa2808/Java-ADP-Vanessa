package electionquestion;
import java.util.*;
import java.io.*;
public class ElectionAnswer {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input= new Scanner(new File("poll.txt"));
		int obamaVotes=0, mccainVotes=0;
		while(input.hasNext()) {
			if(input.hasNextInt()) {
				int obama=input.nextInt();
				int mccain=input.nextInt();
				int eVotes=input.nextInt();
				if(obama>mccain) {
					obamaVotes= mccainVotes+ eVotes;
				} else if(obama<mccain) {
					mccainVotes= mccainVotes+ eVotes;
				}
			}else {
				input.next();
			}
		}
		System.out.println("Obama: "+obamaVotes+"Votes");
		System.out.println("Mccain: "+mccainVotes+"Votes");
	}
}
