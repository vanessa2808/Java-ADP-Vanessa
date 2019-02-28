package lab7;

import lab6.GraphEdgeList;
import lab6.GraphEdgeMatrix;

public class DFS {

	static void dfs(GraphEdgeMatrix g, int v){
		g.vertexLabel[v] = "VISITED";
		for (int w = 0; w < g.V; w++)
			if (g.edgeLabel[v][w] == "UNEXPLORED")
			{
				if (g.vertexLabel[w] == "UNEXPLORED")
				{
					g.edgeLabel[v][w] = "DISCOVERY";
					g.edgeLabel[w][v] = "DISCOVERY";
					dfs(g,w);	// recursive call
					
				}
				else{
					g.edgeLabel[v][w] = "BACK";
					g.edgeLabel[w][v] = "BACK";
				}
				
			}
	}
	
	public static void main(String[] args) {

		GraphEdgeMatrix g = new GraphEdgeMatrix(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		
		dfs(g, 0);
		
		//
		for (int v = 0; v < g.V; v++)
			for (int w = v+1; w < g.V; w++)
				if (g.edgeLabel[v][w] != null)
					System.out.println("("+ v + "," + w + ") = " + g.edgeLabel[v][w]);
	}

}
