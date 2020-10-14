package knapsack;

public class Item {

	private String label;
	private int weight;
	private int value;
	private double cost;
	
	public Item(String label, int weight, int value, double cost) {
		super();
		this.label = label;
		this.weight = weight;
		this.value = value;
		this.cost = value/weight;
	}

	public String getLabel() {
		return label;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public double getCost() {
		return cost;
	}
	
}
