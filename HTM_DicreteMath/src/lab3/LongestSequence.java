package lab3;

public class LongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[]{22, 5, 7, 2, 23, 10, 15, 21, 3, 17};
		int n = s.length;
		
		System.out.println("Input sequence");
		for (int k = 0; k < n; k++)
			System.out.print(s[k] + " ");
		System.out.println();
		
		int maxLenInc = 0;		// length of maximum increasing sequence(s)
		int maxIdInc = -1;		// starting index of the maximum increasing sequence(s) 
		
		int i = 0;
		int len = 1;
		while (true){
			while (i < n-1 && s[i+1] >= s[i]){
				i = i + 1;
				len = len + 1;
			}
			if (maxLenInc < len){
				maxLenInc = len;
				maxIdInc = i - len + 1;
			}
			
			i = i + 1;
			len = 1;
			
			if (i == n)
				break;
		}
		
		System.out.println("Maximum increasing sequence(s)");
		for (int k = 0; k < maxLenInc; k++)
			System.out.print(s[maxIdInc + k] + " ");
		
	}

}
