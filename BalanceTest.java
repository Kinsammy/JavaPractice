import java.util.Scanner;
public class BalanceTest {
	public static void main(String[] args) {
		Balance account1 = new Balance("Sammy Jane", 50.90);
		Balance account2 = new Balance("Emily Jean", 70.50);

		// initial balance of each object
		System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());
		Scanner input = new Scanner(System.in);

		// Account1 input
		System.out.print("Enter Deposit Amount for account1: ");
		double depositAmount = input.nextDouble();
		//System.out.printf("%nadding %.2f to account1's balance %n%n", depositAmount);
		account1.deposit(depositAmount);

		// display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		// Account2 input 
		System.out.print("Enter Deposit Amount for account2: ");
		depositAmount = input.nextDouble();
		//System.out.printf("%adding %2.f to account2's balance %n%n", depositAmount);
		account2.deposit(depositAmount);

		// display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
	}
}