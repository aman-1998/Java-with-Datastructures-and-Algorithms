package algorithms;

public class Reverse_words_in_string {
	public static void main(String[] args) {
		System.out.println(reverseWordInString("The Sky is Blue"));
	}
	
	public static String reverseWordInString(String str) {
		str = " " + str;
		int j = 0;
		String substr="";
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) != ' ') {
				j = i;
			}
			
			while(str.charAt(i) != ' ') {
				i=i-1;
			}
			
			//if()
			substr = substr + str.substring(i+1, j+1) +" ";
		}
		return substr.trim();
	}
}
