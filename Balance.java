public class Balance{
	private String name;
	private double balance;
	
	public Balance(String name, double balance) {
		this.name = name;
	
		if (balance > 0.0) {
			this.balance = balance;
		}
	
	}
	// Methods for depositAmount, accountBalance and names

	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}

	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}