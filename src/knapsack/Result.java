package knapsack;

import java.util.List;

public class Result {

	private List<Item> items;
	private double totalValue;
	
	public Result(List<Item> items, double totalValue) {
		super();
		this.items = items;
		this.totalValue = totalValue;
	}

	public List<Item> getItems() {
		return items;
	}

	public double getTotalValue() {
		return totalValue;
	}
	
}
