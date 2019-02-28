package lab1;

public class Ex1 {
	
	static boolean AND(boolean p, boolean q){
		return p && q;
	}
	static boolean OR(boolean p, boolean q){
		return p || q;
	}
	static boolean XOR(boolean p, boolean q){
		return (p && !q) || (!p && q);
	}
	static boolean COND(boolean p, boolean q){
		return !p || q;
	}
	static boolean BICOND(boolean p, boolean q){
		return (p && q) || (!p && !q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean p = true;
//		boolean q = true;
//		
//		System.out.println("p AND q = " + (p && q)   );
//		System.out.println("p OR q = " + (p || q)   );
//		System.out.println("p XOR q = " + ((p && !q) || (!p && q))    );
//		System.out.println("p -> q = " + (!p || q)    );
//		System.out.println("p <-> q = " + ((p && q) || (!p && !q))   );
		
		// true tables
//		boolean[] boolArr = new boolean[]{true, false};
//		
//		System.out.println("p \t q \t AND \t OR \t XOR \t -> \t <->");
//		for (boolean p : boolArr)
//			for (boolean q : boolArr)
//				System.out.println(p + "\t" + q + "\t" + 
//						(p && q) + "\t" + 
//						(p || q) + "\t" + 
//						((p && !q) || (!p && q)) + "\t" + 
//						(!p || q) + "\t" + 
//						((p && q) || (!p && !q))  );
		
		// (p -> r) OR (q -> r) = (p AND q) -> r
		boolean[] boolArr = new boolean[]{true, false};
		for (boolean p : boolArr)
			for (boolean q : boolArr)
				for (boolean r : boolArr)
					System.out.println(OR(COND(p,r), COND(q,r)) + "\t" +
										COND(AND(p,q), r));
	}

}
