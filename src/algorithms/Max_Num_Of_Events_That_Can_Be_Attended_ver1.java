package algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Max_Num_Of_Events_That_Can_Be_Attended_ver1 {
	
	public static void main(String[] args) {
		//int[][] events = {{3,5}, {1,2}, {2,4}, {4,5}, {5,6}};
		
		int[][] events = {{1,2}, {3,3}, {2,3}, {2,4}, {4,4}};
		
		int maxNoOfEvents = max_num_of_events_attended_1(events);
		
		System.out.println(maxNoOfEvents);
	}

	/*
	 * T = O(n*log n) + O(nd)
	 */
	private static int max_num_of_events_attended(int[][] events) {
		
		int n = events.length;
		Arrays.sort(events, (int[] event1, int[] event2) -> {
			if(event1[1] < event2[1]) {
				return -1;
			} else if(event1[1] > event2[1]) {
				return 1;
			} else {
				if(event1[0] < event2[0]) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		Set<Integer> hashSet = new HashSet<>();
		int count = 0;
		
		for(int i = 0; i <= n-1; i++) {
			for(int day = events[i][0]; day <= events[i][1]; day++) {
				if(!hashSet.contains(day)) {
					count++;
					hashSet.add(day);
					break;
				}
			}
		}
		
		return count;
	}
	
	private static int max_num_of_events_attended_1(int[][] events) {
		
		int n = events.length;
		Arrays.sort(events, (int[] event1, int[] event2) -> {
			if(event1[1] < event2[1]) {
				return -1;
			} else if(event1[1] > event2[1]) {
				return 1;
			} else {
				if(event1[0] < event2[0]) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		Set<Integer> treeSet = new TreeSet<>();
		for(int i = 1; i <= 100000; i++) {
			treeSet.add(i);
		}
		
		int count = 0;
		
		for(int i = 0; i <= n-1; i++) {
			for(int day = events[i][0]; day <= events[i][1]; day++) {
				Boolean available = treeSet.contains(day);
				if(available) {
					count++;
					treeSet.remove(day);
					break;
				}
			}
		}
		
		return count;
	}
	
	// https://www.youtube.com/watch?v=EKZhEN9P2-I
	private static int max_num_of_events_attended_2(int[][] events) {
		
		return 0;
	}

}
