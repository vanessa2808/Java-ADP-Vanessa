package lab3;

import java.util.ArrayList;
import java.util.List;

public class Entry{
	List<Integer> seq;
	int sum;
	//
	public Entry(){
		this.seq = new ArrayList<Integer>();
		this.sum = 0;
	}
	
	public Entry(Entry other){
		this.seq = new ArrayList<Integer>();
		for (int i : other.seq)
			this.seq.add(i);
		this.sum = other.sum;
	}
	
	public Entry(List<Integer> seq, int sum) {
		super();
		this.seq = seq;
		this.sum = sum;
	}
	
}
