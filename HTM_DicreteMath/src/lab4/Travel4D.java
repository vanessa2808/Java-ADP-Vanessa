/*
 * Ex. 40 (Section 6.5) and Ex. 33 (Section 6.4)
 */

package lab4;

public class Travel4D {
	// n!
	static long fact(int n){
		long ret = 1;
		for (int i = 1; i <= n; i++)
			ret = ret * i;
		return ret;
	}
	
	public static void main(String[] args) {
		// 2-dimensional
		int m = 4;
		int n = 3;
		int p = 5;
		int q = 4;
		long[][][][] D = new long[m+1][n+1][p+1][q+1];
//		D[0][0][0][0] = 1;
		
		// init
		for (int i = 0; i <= m; i++)
			for (int j = 0; j <= n; j++)
				for (int k = 0; k <= p; k++)
					for (int l = 0; l <= q; l++)
						if (i*j*k*l == 0)
							D[i][j][k][l] = fact(i+j+k+l)/fact(i)/fact(j)/fact(k)/fact(l);
		// recurrence relation
		for (int i = 1; i <= m; i++)
			for (int j = 1; j <= n; j++)
				for (int k = 1; k <= p; k++)
					for (int l = 1; l <= q; l++)
						D[i][j][k][l] = D[i-1][j][k][l] + D[i][j-1][k][l] + 
										D[i][j][k-1][l] + D[i][j][k][l-1];
		
		// check D[m][n][p][q] = (m+n+p+q)!/(m!n!p!q!)
		long C_mnpq = fact(m+n+p+q)/fact(m)/fact(n)/fact(p)/fact(q);
		
		System.out.println("D[m][n][p][q] = " + D[m][n][p][q]);
		System.out.println("C_mnpq = " + C_mnpq);
		
	}

}
