package bankaccountproject;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount user = new BankAccount();
		BankAccount user2 = new BankAccount();
		BankAccount user3 = new BankAccount();
		
		user.accountDeposit("checking", 750.00);
		user2.accountDeposit("Savings", 10.00);
		user3.accountDeposit("savings:", 50.00);
		user.accountWithdraw("Checking", 150.00);
		user2.accountWithdraw("savings", 5.00);
		user3.accountWithdraw("checking", 149.00);
		user.balance();
		user2.balance();
		user3.balance();
		

	}
}
