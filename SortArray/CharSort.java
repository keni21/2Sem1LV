package SortArray;

import java.util.Arrays;

public class CharSort {

	public static void main(String[] args) {
		
		char[] seq={'s','d','?'};
		Arrays.sort(seq);
		
		for (char c : seq) {
			System.out.print(c+" ");
		}
		
	}

}
