package OopsConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	void print(ArrayList<StockValue> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println(stockList.get(i));
		}
	}

	void addStock(StockValue stock) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter share name");
		stock.setShareName(sc.nextLine());
		System.out.println("Enter Number of shares :");
		stock.setNumOfShares(sc.nextInt());
		System.out.println("Enter share price :");
		stock.setSharePrice(sc.nextInt());
		stock.setTotalValueOfStock(stock.getNumOfShares() * stock.getSharePrice());
		Stock stockStore = new Stock();
		stockStore.add(stock);
	}
}