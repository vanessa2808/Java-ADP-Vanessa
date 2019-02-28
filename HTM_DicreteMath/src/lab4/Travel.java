/*
 * Ex. 40 (Section 6.5) and Ex. 33 (Section 6.4)
 */

package lab4;

public class Travel {
	// n!
	static long fact(int n){
		long ret = 1;
		for (int i = 1; i <= n; i++)
			ret = ret * i;
		return ret;
	}
	
	public static void main(String[] args) {
		// 2-dimensional
		int m = 5;
		int n = 3;
		long[][] D = new long[m+1][n+1];
		D[0][0] = 1;
		// init
		for (int i = 1; i <= m; i++)
			D[i][0] = 1;
		for (int j = 1; j <= n; j++)
			D[0][j] = 1;
		
		// recurrence relation
		for (int i = 1; i <= m; i++)
			for (int j = 1; j <= n; j++)
				D[i][j] = D[i-1][j] + D[i][j-1];
		//
		for (int j = n; j >= 0; j--){
			for (int i =0; i <= m; i++)
				System.out.print(D[i][j] + "\t");
			System.out.println();
		}
		
		// check D[m][n] = C(m+n,m)
		long C_mn = fact(m+n)/fact(m)/fact(n);	// C(m+n,m)
		
		System.out.println("D[m][n] = " + D[m][n]);
		System.out.println("C_mn = " + C_mn);
		
	}

}
