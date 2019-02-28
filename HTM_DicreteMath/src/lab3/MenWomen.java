package lab3;

public class MenWomen {

	public static void main(String[] args) {
		int M = 7;			// number of men
		int K = 5;			// number of women
		int N = M + K;		// number of positions
		int[][] T = new int[N+1][K+1];
		
		T[1][1] = 1;
		for (int n = 0; n <= N; n++)
			T[n][0] = 1;
		
		for (int n = 2; n <= N; n++){
			for (int k = 1; k <= K; k++)
				T[n][k] = T[n-2][k-1] + T[n-1][k];
		}
		// print
		for (int n = 0; n <= N; n++){
			for (int k = 0; k <= K; k++)
				System.out.print(T[n][k] + "\t");
			System.out.println();
		}
		

	}

}
