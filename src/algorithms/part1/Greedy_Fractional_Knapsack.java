package algorithms.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Item {
	private double weight;
	private double profit;
	
	public Item(double weight, double profit) {
		this.weight = weight;
		this.profit = profit;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}
	
}

public class Greedy_Fractional_Knapsack {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(5, 30));
		items.add(new Item(10,40));
		items.add(new Item(15,45));
		items.add(new Item(22,77));
		items.add(new Item(25,90));
		
		double capacity = 60;
		
		double maxProfit = fractional_knapsack(items,capacity); // O(n*log(n))
		System.out.println(maxProfit);
	}
	
	public static double fractional_knapsack(List<Item> items, double capacity) {
		// sort in descending order of (profit per weight).
		items = items.stream().sorted(Comparator.comparing(item -> -(item.getProfit()/item.getWeight()))).collect(Collectors.toList());
		
		double profit = 0;
		for(Item item : items) {
			if(item.getWeight() <= capacity) {
				capacity = capacity - item.getWeight();
				profit = profit + item.getProfit();
			} else {
				profit = profit + item.getProfit()/item.getWeight()*capacity;
				capacity = 0;
			}
		}
		
		return profit;
	}
}
