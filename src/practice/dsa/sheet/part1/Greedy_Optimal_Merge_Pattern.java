package practice.dsa.sheet.part1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class FileWithRecord {
	private int noOfRecords;
	private FileWithRecord left;
	private FileWithRecord right;
	
	public FileWithRecord(FileWithRecord left, int noOfRecords, FileWithRecord right) {
		this.left = left;
		this.noOfRecords = noOfRecords;
		this.right = right;
	}

	public int getNoOfRecords() {
		return noOfRecords;
	}

	public void setNoOfRecords(int noOfRecords) {
		this.noOfRecords = noOfRecords;
	}

	public FileWithRecord getLeft() {
		return left;
	}

	public void setLeft(FileWithRecord left) {
		this.left = left;
	}

	public FileWithRecord getRight() {
		return right;
	}

	public void setRight(FileWithRecord right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Record [noOfRecords=" + noOfRecords + "]";
	}
	
}

public class Greedy_Optimal_Merge_Pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		PriorityQueue<FileWithRecord> minHeap = new PriorityQueue<>(Comparator.comparing(fileWithRecord -> fileWithRecord.getNoOfRecords()));
		
		System.out.print("Enter no. of files: ");
		int n = in.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter no. of records in file-"+i+": ");
			int noOfRecords = in.nextInt();
			minHeap.add(new FileWithRecord(null, noOfRecords, null));
		}
		
		FileWithRecord root = constructHuffmanTree(minHeap);
		
		int minNoOfMovementsToMergeAllTheFiles = movements(root,0, 0);
		
		System.out.println("Min no. of movements to merge all the files = "+minNoOfMovementsToMergeAllTheFiles);
	}

	private static int movements(FileWithRecord root, int length, int sum) {
		if(root.getLeft() != null) {
			sum = movements(root.getLeft(), length + 1, sum);
		}
		
		if(root.getRight() != null) {
			sum = movements(root.getRight(), length + 1, sum);
		}
		
		if(root.getLeft() == null && root.getRight() == null) {
			sum = sum + length * root.getNoOfRecords();
		}
		return sum;
	}

	private static FileWithRecord constructHuffmanTree(PriorityQueue<FileWithRecord> minHeap) { // O(n*log(n))
		while(minHeap.size() > 1) {
			FileWithRecord min1 = minHeap.poll();
			FileWithRecord min2 = minHeap.poll();
			FileWithRecord internalNode = new FileWithRecord(min1, min1.getNoOfRecords()+min2.getNoOfRecords(), min2);
			minHeap.add(internalNode);
		}
		return minHeap.poll();
	}
}
