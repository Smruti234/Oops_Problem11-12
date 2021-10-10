package OopsConcept;

import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) {
		Account account = new Account(10000.00);

		System.out.printf("Account1 Balance: $%.2f\n", account.getBalance());

		Scanner input = new Scanner(System.in);
		double depositAmount;
		double debitAmount;
		System.out.print("Enter deposit amount for account: "); 
		depositAmount = input.nextDouble(); 
		System.out.printf("nadding %.2f to account balance\n\n", depositAmount);
		account.credit(depositAmount); 
		System.out.printf("Account1 balance: $%.2f\n", account.getBalance());

		System.out.print("Enter debit amount for account: ");
		debitAmount = input.nextDouble();
		System.out.printf("\nSubtracting %.2f from account balance\n\n", debitAmount);
		if (account.getBalance() >= debitAmount) {
			account.debit(debitAmount);
			System.out.printf("Account balance: $%.2f\n", account.getBalance());
		}

		else {
			System.out.printf("!!!Debit amount exceeded account balance!!!\n\n  Try Again Once");
		}
	}
}
		
