package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_Heap {
	private static int heap_size;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter heap_size: ");
		heap_size = in.nextInt();
		//ArrayList<Integer> arr = new ArrayList<Integer>(heap_size + 1);
		//.add(0); // index 0  is of no use to us
		int[] arr = new int[heap_size + 1];
		while(true) {
			boolean stop = false;
			System.out.print("Enter your choice: ");
			int ch = in.nextInt();
			switch(ch) {
				case 1:
					for(int i = 1; i <= heap_size; i++) {
						System.out.print("Enter any integer: ");
						arr[i] = in.nextInt();
					}
					break;
				case 2:
					arr = buildHeap(arr);
					break;
				case 3:
					arr = deleteMax(arr);
					break;
				case 4:
					System.out.print("Enter the index and the new increased value: ");
					int index = in.nextInt();
					int higherVal = in.nextInt();
					arr = increaseKey(arr, index, higherVal);
					break;
				case 5:
					System.out.print("Enter the index and the new decreased value: ");
					int indx = in.nextInt();
					int lowerVal = in.nextInt();
					arr = decreaseKey(arr, indx, lowerVal);
					break;
				case 6:
					arr = heapSort(arr); // ascending
					heap_size = arr.length - 1;
					break;
				case 7:
					System.out.print("\nHeap Array:  ");
					for(int i = 1; i <= heap_size; i++) {
						System.out.print(arr[i] + " | ");
					}
					System.out.println();
					break;
				case 8:
					stop = true;
					break;
				default:
					System.out.println("Wrong choice !!");
			}
			
			if(stop == true) {
				break;
			}
		}
	}
	
	private static int[] heapSort(int[] arr) { // Time = O(n*log(n))
		while(heap_size > 1) {
			int max = arr[1];
			arr[1] = arr[heap_size];
			arr[heap_size] = max;
			heap_size--;
			arr = maxHeapify(arr, 1);
		}
		return arr;
	}

	private static int[] decreaseKey(int[] arr, int indx, int lowerVal) { // Time = O(log(n))
		if(indx < 1 || lowerVal >= arr[indx]) {
			return arr;
		}
		arr[indx] = lowerVal;
		arr = maxHeapify(arr, indx);
		return arr;
	}

	private static int[] increaseKey(int[] arr, int index, int higherValue) { // Time = O(log(n))
		if(index < 1 || higherValue <= arr[index]) {
			return arr;
		}
		arr[index] = higherValue;
		while(index > 1) {
			if(arr[index/2] < arr[index]) {
				int temp = arr[index];
				arr[index] = arr[index/2];
				arr[index/2] = temp;
				index = index/2;
			} else {
				break;
			}
		}
		return arr;
	}

	private static int[] deleteMax(int[] arr) { // Time = O(log(n))
		arr[1] = arr[heap_size];
		heap_size--;
		arr = maxHeapify(arr, 1);
		return arr;
	}

	private static int[] buildHeap(int[] arr) { // Time = O(n) | Note: Time != O(n*log(n))
		for(int i = heap_size/2; i >= 1; i--) {
			 arr = maxHeapify(arr, i);
		}
		return arr;
	}

	private static int[] maxHeapify(int[] arr, int index) { // Time = O(log(n))
		int index_of_left_child = 2*index;
		int index_of_right_child = 2*index + 1;
		int index_of_largest_value = 0;
		
		if(index_of_left_child <= heap_size && arr[index_of_left_child] > arr[index]) {
			index_of_largest_value = index_of_left_child;
		} else {
			index_of_largest_value = index;
		}
		
		if(index_of_right_child <= heap_size && arr[index_of_right_child] > arr[index_of_largest_value]) {
			index_of_largest_value = index_of_right_child;
		}
		
		if(index_of_largest_value != index) {
			int temp = arr[index_of_largest_value];
			arr[index_of_largest_value] = arr[index];
			arr[index] = temp;
			arr = maxHeapify(arr, index_of_largest_value);
		}
		return arr;
	}
}
