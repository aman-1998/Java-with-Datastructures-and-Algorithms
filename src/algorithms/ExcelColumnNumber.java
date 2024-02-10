package algorithms;

public class ExcelColumnNumber {
	
	public static void main(String[] args) {
		
		String excelColumn = "ABC";
		int excelColumnNo = excelColumnNumber(excelColumn); // T = O(n)
		System.out.println("Column no. for " + excelColumn + " is " + excelColumnNo);
	}

	private static int excelColumnNumber(String excelColumn) {
		int res = 0;
		for(int i=0; i < excelColumn.length(); i++) {
			res = res*26 + (excelColumn.charAt(i) - 64);
		}
		return res;
	}
}
