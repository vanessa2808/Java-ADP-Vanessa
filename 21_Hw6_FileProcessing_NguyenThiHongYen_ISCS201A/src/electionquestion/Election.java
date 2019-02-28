
package electionquestion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Election{
	public static void main(String []args) {
		BufferedReader yen=null;
		try {
			yen= new BufferedReader(new FileReader("poll.txt"));
			String line;
			while((line = yen.readLine()) != null)  {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try { yen.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}