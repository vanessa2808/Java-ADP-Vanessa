package lab8;

public class GraphColoring {

	public static void main(String[] args) {
		int[][] adj = new int[][]{
			{0,1,1,1,1,0},
			{1,0,0,1,1,1},				
			{1,0,0,1,1,1},
			{1,1,1,0,0,1},
			{1,1,1,0,0,1},
			{0,1,1,1,1,0}
		};
		int n = 6;
		int[] color = new int[n];
		color[0] = 1;
		int num_color = 1;
		for (int u = 1; u < n; u++){
			boolean found = false;
			for (int c = 1; c <= num_color; c++){
				boolean used = false;
			
				for (int v = 0; v < n; v++)
					if (v != u && adj[v][u] == 1 && color[v] == c){
						used = true;
						break;
					}
				if (!used){
					color[u] = c;
					found = true;
					break;
				}
			}
			if (!found){
				num_color += 1;
				color[u] = num_color;
			}
		}
		// print
		System.out.println("num_color = " + num_color);
		for (int u = 0; u < n; u++)
			System.out.println(u + " -> " + color[u]);
	}

}
