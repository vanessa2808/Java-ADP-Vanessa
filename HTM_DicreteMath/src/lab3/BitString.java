package lab3;

public class BitString {

	public static boolean containFiveBits(char[] b){
		String bStr = new String(b); // b.toString();
		return (bStr.indexOf("00000") != -1) || (bStr.indexOf("11111") != -1);
	}
	
	///////////////////////
	public static void main(String[] args) {
		// Algorithm 2 (page 437)
		int n = 10;
		char[] b = new char[n];
		
		// init b to 00..0
		for(int i = 0; i < n; i++)
			b[i] = '0';
		
		//
		int count = 0;
		System.out.println(b);
		System.out.println(b.toString()); //new String(b));
		
		if (containFiveBits(b) == true)
			count += 1;
		
		// generate next bit strings
		while (true){
			int i = n-1;
			while (i >= 0 && b[i] == '1'){
				b[i] = '0';
				i = i - 1;
				
			}
			if (i == -1)
				break;
			else
				b[i] = '1';
			
//			System.out.println(new String(b));
			if (containFiveBits(b) == true)
				count += 1;
		}

		System.out.println("count = " + count);
	}

}
