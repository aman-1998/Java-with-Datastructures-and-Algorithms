package practice.dsa.sheet.part1;

public class Merge_Two_Sorted_Arrays {
	public static void main(String[] args) {
		int[] sortedList1 = {2, 5, 7, 9, 14, 15};
		int[] sortedList2 = {1, 3, 9, 11, 12, 14, 16, 17};
		
		int[] sortedMergedList = merge_2nd_approach(sortedList1, sortedList2);
		for(int i : sortedMergedList) {
			System.out.print(i + " | ");
		}
	}

	private static int[] merge(int[] sortedList1, int[] sortedList2) {
		int[] newSortedList1 = new int[sortedList1.length + 1]; // At the end infinity is to be added
		for(int i = 0; i <= sortedList1.length - 1; i++) {
			newSortedList1[i] = sortedList1[i];
		}
		newSortedList1[newSortedList1.length - 1] = (1 << 31) - 1;
		
		int[] newSortedList2 = new int[sortedList2.length + 1]; // At the end infinity is to be added
		for(int i = 0; i <= sortedList2.length - 1; i++) {
			newSortedList2[i] = sortedList2[i];
		}
		newSortedList2[newSortedList2.length - 1] = (1 << 31) - 1;
		
		int[] sortedMergedList = new int[sortedList1.length + sortedList2.length]; // 3rd array
		
		int i = 0, j = 0, k=0;
		while((i < sortedList1.length) || (j < sortedList2.length)) { // Note: When either of i or j is not infinity
			
			if(newSortedList1[i] <= newSortedList2[j]) {
				sortedMergedList[k] = newSortedList1[i];
				k++;
				i++;
			} else {
				sortedMergedList[k] = newSortedList2[j];
				k++;
				j++;
			}
		}
		
		return sortedMergedList;
	}
	
	private static int[] merge_2nd_approach(int[] sortedList1, int[] sortedList2) {
		int[] newSortedList1 = new int[sortedList1.length + 1]; // At the end infinity is to be added
		for(int i = 0; i <= sortedList1.length - 1; i++) {
			newSortedList1[i] = sortedList1[i];
		}
		newSortedList1[newSortedList1.length - 1] = (1 << 31) - 1;
		
		int[] newSortedList2 = new int[sortedList2.length + 1]; // At the end infinity is to be added
		for(int i = 0; i <= sortedList2.length - 1; i++) {
			newSortedList2[i] = sortedList2[i];
		}
		newSortedList2[newSortedList2.length - 1] = (1 << 31) - 1;
		
		int[] sortedMergedList = new int[sortedList1.length + sortedList2.length]; // 3rd array
		
		int i = 0, j = 0;
		for(int k = 0; k <= sortedList1.length + sortedList2.length - 1; k++) { // Note k to (sortedList1.length + sortedList2.length - 1)
			
			if(newSortedList1[i] <= newSortedList2[j]) {
				sortedMergedList[k] = newSortedList1[i];
				i++;
			} else {
				sortedMergedList[k] = newSortedList2[j];
				j++;
			}
		}
		
		return sortedMergedList;
	}
}
