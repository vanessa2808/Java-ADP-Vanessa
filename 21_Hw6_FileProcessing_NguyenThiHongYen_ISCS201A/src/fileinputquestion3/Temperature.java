/**
 * 
 */
/**
 * @author Vanessa
 *
 */
package fileinputquestion3;
import java.io.File; // for file
import java.io.IOException; //for Scanner
import java.io.PrintWriter;
public class Temperature{
	public static void main(String[] args)  {
		try {
			File file= new File("temperature.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);
			pw.println("this is my file content");
			pw.println(100000);
			pw.close();
			System.out.println("Done");
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
