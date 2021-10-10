package OopsConcept;

import java.util.Scanner;

public class StockMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalStock = 0;

		UserInterface userInterface = new UserInterface();
		Stock stock1 = new Stock();

		boolean check = true;
		if (check == true) {
			System.out.println("Enter 1.Add Stock 2.Display");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				StockValue stock = new StockValue();
				userInterface.addStock(stock);
				totalStock = totalStock + stock.getTotalValueOfStock();
				stock1.add(stock);
				break;
			case 2:
				System.out.println("StockStore");
				userInterface.print(stock1.getStockList());
				System.out.println("Value of Total Stocks is : " + totalStock);
			default:
				check = false;
			}
		}
	}
}
