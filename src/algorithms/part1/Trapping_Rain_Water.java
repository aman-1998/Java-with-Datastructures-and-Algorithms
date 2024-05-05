package algorithms.part1;

public class Trapping_Rain_Water {
	public static void main(String[] args) {
		int[] arr = {3,1,2,4,0,1,2,3,2};
		System.out.println(volumeOfTrappedRainWater(arr));
	}
	
	//Time = O(n)
	public static int volumeOfTrappedRainWater(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int[] left = new int[arr.length];
		
		//Largest blocks to the left of each block (inclusive)
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			left[i] = largest;
		}
		
		largest = Integer.MIN_VALUE;
		int[] right = new int[arr.length];
		
		//Largest blocks to the right of each block (inclusive)
		for(int i=arr.length-1; i >= 0; i--) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			right[i] = largest;
		}
		
		int volume = 0;
		for(int i=0; i < arr.length; i++) {
			volume = volume + (Math.min(left[i], right[i]) - arr[i]);
		}
		return volume;
	}
}
