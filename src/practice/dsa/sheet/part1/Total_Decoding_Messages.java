package practice.dsa.sheet.part1;

public class Total_Decoding_Messages {
	public static void main(String[] args) {
		System.out.println(totalDecodingWays("2210"));
		System.out.println(totalDecodingWays("2230"));
		System.out.println(totalDecodingWays("2102"));
		System.out.println(totalDecodingWays("22"));
	}
	
	public static int totalDecodingWays(String str) {
		if(str == null || str.length() == 0 || str.charAt(0)== '0') {
			return 0;
		}
		
		if(str.length() == 1) {
			return 1;
		}
		
		int numbOfSolTillPrev = 1;
		int numbOfSolTillPrevToPrev = 1;
		for(int i = 1; i < str.length(); i++) {
			int d = str.charAt(i) - '0';
			int dd = (str.charAt(i-1) - '0')*10 + d;
			int count = 0;
			
			if(d > 0) {
				count = count + numbOfSolTillPrev;
			}
			
			if(dd >= 10 && dd <= 26) {
				count = count + numbOfSolTillPrevToPrev;
			}
			
			numbOfSolTillPrevToPrev = numbOfSolTillPrev;
			numbOfSolTillPrev = count;
		}
		return numbOfSolTillPrev;
	}
}
