package de.szut.schwerk.tddkurs;

public class NumberSummaration {
	
	public int sum (int start, int end) {
		int result = 0;
		if(start > end) {
			result = 0;
		}
		else if(start == end) {
			result = start;
		}
		else {
			int i = start;
			while(i<=end) {
				result += i;
				i++;
			}
		}
		return result;
	}

}
