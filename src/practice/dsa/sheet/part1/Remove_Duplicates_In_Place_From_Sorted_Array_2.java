package practice.dsa.sheet.part1;

public class Remove_Duplicates_In_Place_From_Sorted_Array_2 {
	
	public static void main(String[] args) {
		
		int[] arr = {0,0,1,1,1,1,2,3,3};
		
		int k = removeDuplicates(arr);
		
		System.out.println(k);
	}
	
	private static int removeDuplicates(int[] arr) {
        
        int n = arr.length;
		int i = 2;
		for(int j = i; j <= n-1; j++) {
			if(arr[i-2] != arr[j]) {
				arr[i] = arr[j];
				i++;
			}
		}
		
		return i;
    }
}
