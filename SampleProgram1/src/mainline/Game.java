package mainline;
import java.util.*;
public class Game
{
	private static Scanner console;
	private static int play(Scanner console2, Random rand) 
	{
		return 0;
	}



	public static void main(String[]args)
	{
		console = new Scanner(System.in);
		
		Random rand=new Random();
		int points=0;
		int wrong=0;
		while(wrong<3)
		{ 
			int  result=play(console,rand);
			if(result>0) points++;
			else wrong++;
			 
		}
		
		System.out.println("you earned"+points+"total points.");
		
	}
}
	
