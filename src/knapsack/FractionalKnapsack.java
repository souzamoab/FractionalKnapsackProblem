package knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {

	public Result getItemsAndMaxValue(List<Item> items, int capacity) {
		Collections.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				if(i1.getCost() > i2.getCost()) {
					return -1;
				}else if(i1.getCost() < i2.getCost()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		
		double totalValue = 0d;
		
		List<Item> result = new ArrayList<Item>();
		
		for(Item item : items) {
			int wt = (int) item.getWeight();
			int value = (int) item.getValue();
			
			if(capacity - wt >= 0) {
				capacity = capacity - wt;
				totalValue += value;
				result.add(item);
			}else {
				double fraction = ((double)capacity / (double)wt);
				totalValue += (value*fraction);
				capacity = (int)(capacity - (wt*fraction));
				result.add(item);
				break;
			}
		}
		
		return new Result(result, totalValue);
	}
}
