package OopsConcept;

import java.util.ArrayList;

public class Stock {
	
	private ArrayList<StockValue> stockList = new ArrayList<StockValue>();

	
	public ArrayList<StockValue> getStockList() {
		return stockList;
	}

	public void add(StockValue stock) {
		stockList.add(stock);
	}

	public void remove(StockValue stock) {
		stockList.remove(stock);
	}
}

