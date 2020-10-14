package main;

import java.io.IOException;
import java.util.List;

import file.File;
import knapsack.FractionalKnapsack;
import knapsack.Item;
import knapsack.Result;

public class Main {
	public static void main(String[] args) throws IOException {
		FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();
		File file = new File();
		
		List<Item> items = file.readFile();
		int capacity = file.getLastLine();
		
		Result result = fractionalKnapsack.getItemsAndMaxValue(items, capacity);
		
		file.writeFile(result);
		
	}
}
