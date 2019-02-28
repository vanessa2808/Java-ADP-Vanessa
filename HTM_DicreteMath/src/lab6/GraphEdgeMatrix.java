package lab6;

import java.util.ArrayList;
import java.util.List;

public class GraphEdgeMatrix {

	public int V;	// number of vertices: 0 -> V-1
	public int adj[][];
	public String[] vertexLabel; 
	public String[][] edgeLabel; 
	
	public GraphEdgeMatrix(int V){
		this.V = V;
		adj = new int[V][V];
		//
		vertexLabel = new String[V];
		for (int u = 0; u < V; u++)
			vertexLabel[u] = "UNEXPLORED";
		edgeLabel = new String[V][V];
	}
	
	public void addEdge(int u, int v){
		adj[u][v] = 1;
		adj[v][u] = 1;
		//
		edgeLabel[u][v] = "UNEXPLORED";
		edgeLabel[v][u] = "UNEXPLORED";
	}
}
