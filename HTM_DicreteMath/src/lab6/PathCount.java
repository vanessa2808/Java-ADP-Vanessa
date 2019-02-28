package lab6;

public class PathCount {
	
	public static int[][] matrixMul(int[][] a, int[][] b){
		int m = a.length;
		int n = a[0].length;
		int p = b[0].length;
		
		int[][] c = new int[m][p];	// c = a*b
		for (int i = 0; i < m; i++)
			for (int k = 0; k < p; k++){
				for (int j = 0; j < n; j++)
					c[i][k] += a[i][j] * b[j][k];
				
			}
		//
		return c;
	}

	static void printMatrix(int[][] adj){
		// print adj
		for (int u = 0; u < adj.length; u++){
			for (int v = 0; v < adj[0].length; v++)
				System.out.print(adj[u][v] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		GraphEdgeMatrix g = new GraphEdgeMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		
		System.out.println("Adj. matrix");
		printMatrix(g.adj);
		
		// matrix multiplication
		int[][] A2 = matrixMul(g.adj, g.adj);
		System.out.println("A^2");
		printMatrix(A2);
		
		int[][] A4 = matrixMul(A2, A2);
		System.out.println("A^4");
		printMatrix(A4);
	}

}
