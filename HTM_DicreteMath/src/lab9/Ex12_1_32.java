package lab9;

public class Ex12_1_32 {

	static boolean checkSymmetry(char[] f, int L, int n){
		boolean ret = true;
		
		int[] xyz = new int[n];
		for (int i = 0; i < L; i++){
			// generate xyz
			for (int k = 0; k < n; k++)
				xyz[k] = (i >> k) & 1;
			
			// check
			char[] values = new char[n];
			for (int k = 0; k < n; k++){
				int id = 0;
				for (int j = 0; j < n; j++)
					if (j != k)
						id = id + xyz[j] * (1 << j);
					else
						id = id + (1-xyz[j]) * (1 << j);
				values[k] = f[id];
			}
			for (int k = 1; k < n; k++)
				if (values[k] != values[0])
					ret = false; 
			
		}
		
		//
		return ret;
	}
	
	public static void main(String[] args) {
		int n = 3;
		int L = 1 << n;
		char[] f = new char[L];
		
		// init f to 00..0
		for(int i = 0; i < L; i++)
			f[i] = '0';
		
		// generate next bit strings
		int count = 0;
		while (true){
			if (checkSymmetry(f, L, n) == true){
				count += 1;
				System.out.println(new String(f));
			}
			
			int i = L-1;
			while (i >= 0 && f[i] == '1'){
				f[i] = '0';
				i = i - 1;
				
			}
			if (i == -1)
				break;
			else
				f[i] = '1';
			
//					System.out.println(new String(b));
			
		}
		System.out.println("There are " + count + " symmetric functions f");

	}

}
