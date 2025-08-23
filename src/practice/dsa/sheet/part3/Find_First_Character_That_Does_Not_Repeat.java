package practice.dsa.sheet.part3;

import java.util.HashMap;
import java.util.Map;

public class Find_First_Character_That_Does_Not_Repeat {
	
	public static void main(String[] args) {
		
		String str = "acecars";
		int output = findFirstCharNoRepeat(str);
		
		System.out.println(output);
	}
	
	/*
	 * T = O(2n)
	 * S = O(n)
	 */
	public static int findFirstCharNoRepeat(String str) {
		
		int n = str.length();
		Map<Character, Integer> freqMap = new HashMap<>();
		
		for(int i = 0; i <= n-1; i++) {
			Integer freq = freqMap.get(str.charAt(i));
			if(freq == null) {
				freqMap.put(str.charAt(i), 1);
			} else {
				freqMap.put(str.charAt(i), freq+1);
			}
		}
		
		for(int i = 0; i <= n-1; i++) {
			Integer freq = freqMap.get(str.charAt(i));
			if(freq == 1) {
				return i;
			}
		}
		
		return -1;
	}
}
