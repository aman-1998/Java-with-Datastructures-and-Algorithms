package dataStructure;

import java.util.Scanner;

public class Insert_Into_Min_Heap {
	static int minVal = -1;
	static int heap_size = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] heap = null;
		while(true) {
			System.out.println("Enter your choice: ");
			int ch = in.nextInt();
			int val=0;
			switch(ch) {
				case 1:
					System.out.print("Enter any integer: ");
					val = in.nextInt();
					heap = insertIntoMinHeap(heap, val);
					break;
				case 2:
					heap = deleteMin(heap);
					System.out.println("Min value polled = "+minVal);
					break;
				case 3:
					minVal = peek(heap);
					break;
				default:
					display(heap);
			}
		}
	}

	private static void display(int[] heap) {
		for(int i = 0; i <= heap_size; i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}

	private static int peek(int[] heap) {
		return heap[1];
	}

	private static int[] deleteMin(int[] heap) {
		minVal = heap[1];
		heap[1] = heap[heap_size];
		heap_size--;
		heap = minHeapify(heap, 1);
		return heap;
	}

	private static int[] minHeapify(int[] heap, int i) {
		if(i < 1 || i > heap_size) {
			return heap;
		}
		
		int index_of_smallest = i;
		
		if(2*i <= heap_size) {
			index_of_smallest = heap[2*i] < heap[i] ? 2*i : i;
		}
		
		if((2*i + 1) <= heap_size) {
			index_of_smallest = heap[2*i+1] < heap[index_of_smallest] ? 2*i+1 : index_of_smallest;
		}
		
		if(i != index_of_smallest) {
			int temp = heap[index_of_smallest];
			heap[index_of_smallest] = heap[i];
			heap[i] = temp;
			heap = minHeapify(heap, index_of_smallest);
		}
		
		return heap;
	}

	private static int[] insertIntoMinHeap(int[] heap, int val) {
		if(heap == null) {
			heap = new int[100];
			heap[1] = val;
			heap_size++;
			return heap;
		}

		heap_size++;
		heap[heap_size] = (1 << 31) - 1;
		heap = decreaseKey(heap, heap_size, val);
		return heap;
	}

	private static int[] decreaseKey(int[] heap, int index, int val) {
		if(index < 1 || index > heap_size) {
			return heap;
		}
		
		if(val > heap[index]) {
			return heap;
		}
		
		heap[index] = val;
		while(index/2 >= 1) {
			if(heap[index/2] > heap[index]) {
				int temp = heap[index/2];
				heap[index/2] = heap[index];
				heap[index] = temp;
				index = index/2;
			} else {
				break;
			}
		}
		
		return heap;
	}
}

