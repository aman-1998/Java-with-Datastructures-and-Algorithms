package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Job {
	private int profit;
	private int deadline;
	
	public Job(int profit, int deadline) {
		this.profit = profit;
		this.deadline = deadline;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	
}

public class Greedy_Job_Sequencing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of jobs: ");
		List<Job> jobList = new ArrayList<>();
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter the profit for job-"+i+": ");
			int profit = in.nextInt();
			System.out.print("Enter the deadline for job-"+i+": ");
			int deadline = in.nextInt();
			jobList.add(new Job(profit, deadline));
		}
		
		List<Integer> timings = jobSequencing(jobList);
		
		for(int i = 0; i < timings.size(); i++) {
			System.out.println(timings.get(i) +" -> " + " " + i + " to "+(i+1));
		}
		
		int maxProfit = timings.stream().reduce(0, (result,  accumulator) -> result +  accumulator);
		System.out.println("\nMax profit = "+maxProfit);
	}
	
	private static List<Integer> jobSequencing(List<Job> jobList) {
		
		int maxDeadline = jobList.stream()
								 .max(Comparator.comparing(job -> job.getDeadline()))
								 .get()
								 .getDeadline();
		
		
		List<Integer> timings = new ArrayList<>(maxDeadline);
		for(int i = 0; i < maxDeadline; i++) {
			timings.add(0);
		}
		
		//Collections.sort(jobList, Comparator.comparing(job -> -(job.getProfit())));
		//jobList = jobList.stream().sorted(Comparator.comparing(job -> -(job.getProfit()))).collect(Collectors.toList());
		jobList = jobList.stream()
						 .sorted(Comparator.comparing(Job::getProfit)
						 .reversed())
						 .collect(Collectors.toList());
		
		for(Job job : jobList) {
			int deadline = job.getDeadline();
			for(int i = deadline -1 ; i >= 0; i--) {
				if(timings.get(i) == 0) {
					timings.set(i, job.getProfit());
					break;
				}
			}
		}
		
		return timings;
	}
}
