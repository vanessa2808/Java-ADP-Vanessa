package lab1;

import java.util.HashMap;
import java.util.Map;

public class Ex2_BitString {

	
	public static void main(String[] args) {
		String x = "0110110110";
		String y = "1100011101";
		String OR_xy = "";
		String AND_xy = "";
		String XOR_xy = "";
		
		Map<String, String> ORmap = new HashMap<String, String>();
		ORmap.put("00", "0");
		ORmap.put("01", "1");
		ORmap.put("10", "1");
		ORmap.put("11", "1");
		
		Map<String, String> ANDmap = new HashMap<String, String>();
		ANDmap.put("00", "0");
		ANDmap.put("01", "0");
		ANDmap.put("10", "0");
		ANDmap.put("11", "1");
		
		Map<String, String> XORmap = new HashMap<String, String>();
		XORmap.put("00", "0");
		XORmap.put("01", "1");
		XORmap.put("10", "1");
		XORmap.put("11", "0");
		
		for (int i = 0; i < x.length(); i++ ){
			String pair = x.substring(i,i+1) + y.substring(i,i+1);
			OR_xy += ORmap.get(pair);
			AND_xy += ANDmap.get(pair);
			XOR_xy += XORmap.get(pair);
			
		}
		
		System.out.println("x = \t" + x);
		System.out.println("x = \t" + y);
		System.out.println("-----------");
		System.out.println("OR = \t" + OR_xy);
		System.out.println("AND = \t" + AND_xy);
		System.out.println("XOR = \t" + XOR_xy);
	}
}
