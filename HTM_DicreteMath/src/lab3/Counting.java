package lab3;

public class Counting {
	// Section 6.1, Exercise 22.g
	static void distinctDigits(){
		int count = 0;
		for (int num = 1; num <= 999; num++){
			int a = num / 100;
			int b = (num - a*100) / 10;
			int c = num - a*100 - b*10;
			
			if (a == 0 && b == 0) 	// case 1: 1-digit number
				count += 1;
			if (a == 0 && b > 0)	// case 2: 2-digit number
				if (b != c)
					count += 1;		
			if (a > 0)				// case 3: 3-digit number
				if (a != b && a != c && b != c)
					count += 1;
		}
		
		System.out.println("count = " + count);
	}

	// Section 6.1, Exercise 22.h
	static void distinctDigitsEven(){
		int count = 0;
		for (int num = 1; num <= 999; num++){
			int a = num / 100;
			int b = (num - a*100) / 10;
			int c = num - a*100 - b*10;
			
			if (a == 0 && b == 0 && c % 2 == 0)
					count += 1;
			if (a == 0 && b > 0)
				if (b != c & c % 2 == 0)
					count += 1;
			if (a > 0)
				if (a != b && a != c && b != c && c % 2 == 0)
					count += 1;
		}
		
		System.out.println("count = " + count);
	}
	
	
	public static void main(String[] args) {

		distinctDigits();
		
		distinctDigitsEven();
	}

}
