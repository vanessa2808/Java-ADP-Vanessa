package lab1;

public class Ex3_Satisfiability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] boolArr = new boolean[]{true, false};
		
		for (boolean p : boolArr)
			for (boolean q : boolArr)
				for (boolean r : boolArr)
					for (boolean s : boolArr){
						boolean sat = (p || q || !r) && (p || !q || !s) && (p || !r || !s) && 
								(!p || !q || !s) && (p || q || !s);
						
						if (sat == true)
							System.out.println("Found. p = " + p + " q = " + q + " r = " + r + " s = " + s);
					}

				
				
	}

}
