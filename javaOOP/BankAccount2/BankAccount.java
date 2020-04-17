import java.util.Random;


public class BankAccount{
    private static final String[] VALID_ACCOUNTS = {"Checking", "Savings"};

    private String accountNumber;
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private double totalMoney = 0.0;

    //Constructors

    public BankAccount(){
        setAccountNumber(newAccountNumber());
        setCheckingBalance(checkingBalance);
        setSavingsBalance(savingsBalance);
        setTotalMoney(totalMoney);
    }

    public BankAccount(String accountNumber){
        setAccountNumber(accountNumber);
    }

    public BankAccount(String accountNumber, Double checkingBalance){
        this(accountNumber);
        setCheckingBalance(checkingBalance);
    }

    public BankAccount(String accountNumber, Double checkingBalance, Double savingsBalance){
        this(accountNumber, checkingBalance);
        setSavingsBalance(savingsBalance);
    }

    public BankAccount(String accountNumber, Double checkingBalance, Double savingsBalance, Double totalMoney){
        this(accountNumber, checkingBalance, savingsBalance);
        setTotalMoney(totalMoney);
    }

    //Getters/Setters
    public String getAcountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getCheckingBalance(){
        return checkingBalance;
    }

    public void setCheckingBalance(Double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public Double getSavingsBalance(){
        return savingsBalance;
    }

    public void setSavingsBalance(Double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public Double getTotalMoney(){
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney){
        this.totalMoney = totalMoney;
    }

    private String newAccountNumber(){
        String numberTable = "0123456789";
        String randomNumber = "";

        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            char num = numberTable.charAt(rand.nextInt(10));
            randomNumber += num;
        }
        setAccountNumber(randomNumber);
        return randomNumber;
    }

    public void accountDeposit(Double depositAmount, String type){
        if(isValidAccount(type) && type.equals("Checking")){
            setCheckingBalance(checkingBalance + depositAmount);
            totalMoney += depositAmount;
        }
        else if(isValidAccount(type) && type.equals("Savings")){
            setSavingsBalance(savingsBalance + depositAmount);
            totalMoney += depositAmount;
        }
        else{
            System.out.println("Invalid account type, must be a Checking or Savings account");
            System.exit(0);
        }
    }

    public void accountWithdraw(Double withdrawlAmount, String type){
        if(isValidAccount(type) && type.equals("Checking")){
            if(withdrawlAmount > checkingBalance){
                System.out.println("Insufficient funds!!!");
                System.exit(0);
            }
            setCheckingBalance(checkingBalance - withdrawlAmount);
            totalMoney -= withdrawlAmount;
        }
        else{
            if(isValidAccount(type) && type.equals("Savings")){
                if(withdrawlAmount > savingsBalance){
                    System.out.println("Insufienct funds!!");
                    System.exit(0);
                }
                setSavingsBalance(savingsBalance - withdrawlAmount);
                totalMoney -= withdrawlAmount;
            }
        }

    }

    public void balance(){
        System.out.println("Your total balance is: $" +this.totalMoney);
    }




    public static boolean isValidAccount(String account){
        for(String a : VALID_ACCOUNTS){
            if(account.equals("Checking") || account.equals("Savings")){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Your balance for account " + accountNumber + " is as follows: Checking= $" + getCheckingBalance() + ", Savings: $" + getSavingsBalance() + ", giving a total of: $" + totalMoney;
    }


}