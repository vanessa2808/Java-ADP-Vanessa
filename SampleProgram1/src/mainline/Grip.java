package mainline;

public class Grip {
	Cell[][] grid;

	// Number of columns and rows in the grid
	int cols = 10;
	int rows = 10;

	void setup() {
	  size(200,200);
	  grid = new Cell[cols][rows];
	  for (int i = 0; i < cols; i++) {
	    for (int j = 0; j < rows; j++) {
	      // Initialize each object
	      grid[i][j] = new Cell(i*20,j*20,20,20,i+j);
	    }
	  }
	}

	private void size(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	void draw() {
	  background(0);
	  // The counter variables i and j are also the column and row numbers and 
	  // are used as arguments to the constructor for each object in the grid.  
	  for (int i = 0; i < cols; i++) {
	    for (int j = 0; j < rows; j++) {
	      // Oscillate and display each object
	      grid[i][j].oscillate();
	      grid[i][j].display();
	    }
	  }
	}

	private void background(int i) {
		// TODO Auto-generated method stub
		
	}

	// A Cell object
	class Cell {
	  // A cell object knows about its location in the grid 
	  // as well as its size with the variables x,y,w,h
	  float x,y;   // x,y location
	  float w,h;   // width and height
	  float angle; // angle for oscillating brightness

	  // Cell Constructor
	  Cell(float tempX, float tempY, float tempW, float tempH, float tempAngle) {
	    x = tempX;
	    y = tempY;
	    w = tempW;
	    h = tempH;
	    angle = tempAngle;
	  } 
	  
	  // Oscillation means increase angle
	  void oscillate() {
	    angle += 0.02; 
	  }

	  void display() {
	    stroke(255);
	    // Color calculated using sine wave
	    fill(127+127*sin(angle));
	    rect(x,y,w,h); 
	  }

	private void fill(int i) {
		// TODO Auto-generated method stub
		
	}

	private void rect(float x2, float y2, float w2, float h2) {
		// TODO Auto-generated method stub
		
	}

	private int sin(float angle2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void stroke(int i) {
		// TODO Auto-generated method stub
		
	}
	}

}
