package bankaccountproject;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	private static int numOfAccounts = 0;
	private double totalMoney = 0.0;
	
	//constructors
	
	public BankAccount() {
		String accountNumber = newAccountNumber();
		Double checkingBalance = 0.0;
		Double savingsBalance = 0.0;
		numOfAccounts += 1;
		System.out.println("New user created with account number: " + accountNumber + ".");
		System.out.println("Total accounts created: " + numOfAccounts + ".");
		
	}
	
	//getters
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	
	public Double getSavingsBalance() {
		return savingsBalance;
	}
	
	//setters
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	//methods
	private String newAccountNumber() {
		String numberTable = "0123456789";
		String randomNumber = "";
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			char num = numberTable.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		accountNumber = randomNumber;
		return randomNumber;
	}
	
	public void accountDeposit(String type, Double depositAmount) {
		if(type == "checking" || type == "Checking") {
			setCheckingBalance(getCheckingBalance() + depositAmount);
			totalMoney += depositAmount;
		}
		if(type == "savings" || type == "Savings") {
			setSavingsBalance(getSavingsBalance() + depositAmount);
			totalMoney += depositAmount;
		}
		else {
			System.out.println("Please choose correct account type");
		}
	}
	
	public void accountWithdraw(String type, Double withdrawlAmount) {
		if(type == "checking" || type == "Checking") {
			if(getCheckingBalance() < withdrawlAmount) {
				System.out.println("Insufficient funds!");
			}
			else {
				setCheckingBalance(getCheckingBalance() - withdrawlAmount);
				totalMoney -= withdrawlAmount;
			}
		}
		if(type == "savings" || type == "Savings") {
			if(getSavingsBalance() < withdrawlAmount) {
				System.out.println("Insufficient funds!");
			}
			else {
				setSavingsBalance(getSavingsBalance() - withdrawlAmount);
				totalMoney -= withdrawlAmount;
			}
		}
			
	}
	
	public Double balance() {
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;
	}
	
	
	

}
