package algorithms.part1;

import java.util.HashMap;

public class Longest_Substring_Without_Repeat {
	 
	public static void main(String[] args) {
		System.out.println(longestSubstringWithoutRepeat_2("abcaabcdba"));
	}
	
	// T = O(2n)
	// S = O(n)
	private static int longestSubstringWithoutRepeat_1(String str) {
		
		HashMap<String, String> hMap = new HashMap<>();
		int l = 0;
		int r = 0;
		int max = 0;
		
		while(r != str.length()) {
			
			if(hMap.get(String.valueOf(str.charAt(r))) == null) {
				hMap.put(String.valueOf(str.charAt(r)), "dummy");
				if(r-l+1 > max) {
					max = r-l+1;
				}
				r++;
			} else {
				hMap.remove(String.valueOf(str.charAt(l)));
				l++;
			}
		}
		
		return max;
	}
	
	// T = O(n)
	// S = O(n)
	private static int longestSubstringWithoutRepeat_2(String str) {
		
		HashMap<String, Integer> hMap = new HashMap<>();
		int l = 0;
		int r = 0;
		int max = 0;
		
		while(r != str.length()) {
			Integer index = hMap.get(String.valueOf(str.charAt(r)));
			if(index == null) {
				hMap.put(String.valueOf(str.charAt(r)), r); // add
				if(r-l+1 > max) {
					max = r-l+1;
				}
				r++;
			}
			else {
				if(!(l <= index && r >= index)) {
					hMap.put(String.valueOf(str.charAt(r)), r); // replace
					if(r-l+1 > max) {
						max = r-l+1;
					}
					r++;
				} else {
					l = hMap.get(String.valueOf(str.charAt(r))) + 1;
				}
			}
		}
		
		return max;
	}
}
