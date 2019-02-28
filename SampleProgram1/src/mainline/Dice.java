package mainline;
import java.util.*;
public class Dice 
{
	public static void main(String[]args) 
	{
		Random rand=new Random();
		int tries=0;
		int sum=0;
		while (sum!=9) 
		{
			int roll1=rand.nextInt(6)+1;
			int roll2=rand.nextInt(6)+1;
			sum= roll1+roll2;
			System.out.println(roll1+"+"+roll2+"="+sum);
			tries++;
		}
		System.out.println("you won after: "+tries+" tries!");
	}

}
