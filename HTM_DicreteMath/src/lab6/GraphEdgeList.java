package lab6;

import java.util.ArrayList;
import java.util.List;

public class GraphEdgeList {
		public int V;	// number of vertices: 0 -> V-1
		public List<Integer> adj[];
		public String[] vertexLabel; 
//		public Map<> edgeLabel;
		
		public GraphEdgeList(int V){
			this.V = V;
			adj = new ArrayList[V];
			vertexLabel = new String[V];
			for (int i = 0; i < V; i++){
				adj[i] = new ArrayList<Integer>();
				vertexLabel[i] = "UNEXPLORED";
			}
			
		}
		
		public void addEdge(int u, int v){
			adj[u].add(v);
			adj[v].add(u);
		}
		
		
}
