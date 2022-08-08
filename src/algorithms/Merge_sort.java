package algorithms;

public class Merge_sort {
	public static void main(String[] args) {
		int[] input = {9,3,7,1,1,5,8};
		int[] result = mergeSort(input, 0, input.length-1);
		for(int i : result) {
			System.out.print(i + " | ");
		}
	}

	private static int[] mergeSort(int[] input, int p, int r) {
		if(p < r) {
			int q = (p+r)/2; // Divide
			input = mergeSort(input, p, q);
			input = mergeSort(input, q+1, r);
			input = merge_2nd_approach(input, p , q, r);
		}
		return input;
	}

	private static int[] merge(int[] input, int p, int q, int r) {
		int[] sortedList1 = new int[q-p+2];
		int[] sortedList2 = new int[r-q+1];
		int index = 0;
		for(int i = p; i <= q; i++) {
			sortedList1[index++] = input[i];
		}
		sortedList1[sortedList1.length - 1] = (1 << 31) - 1;
		
		index = 0;
		for(int i = q+1; i <= r; i++) {
			sortedList2[index++] = input[i];		
		}
		sortedList2[sortedList2.length - 1] = (1 << 31) - 1;
		
		int i = 0, j = 0, k=p;
		while((i < sortedList1.length-1) || (j < sortedList2.length-1)) {
			if(sortedList1[i] <= sortedList2[j]) {
				input[k] = sortedList1[i];
				k++;
				i++;
			} else {
				input[k] = sortedList2[j];
				k++;
				j++;
			}
		}
		
		return input;
	}
	
	private static int[] merge_2nd_approach(int[] input, int p, int q, int r) {
		int[] sortedList1 = new int[q-p+2];
		int[] sortedList2 = new int[r-q+1];
		int index = 0;
		for(int i = p; i <= q; i++) {
			sortedList1[index++] = input[i];
		}
		sortedList1[sortedList1.length - 1] = (1 << 31) - 1;
		
		index = 0;
		for(int i = q+1; i <= r; i++) {
			sortedList2[index++] = input[i];		
		}
		sortedList2[sortedList2.length - 1] = (1 << 31) - 1;
		
		int i = 0, j = 0;
		for(int k = p; k <= r; k++) {
			if(sortedList1[i] <= sortedList2[j]) {
				input[k] = sortedList1[i];
				i++;
			} else {
				input[k] = sortedList2[j];
				j++;
			}
		}
		
		return input;
		
	}
}
