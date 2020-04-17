public class BankAccountTest{
    public static void main(String[] args){
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        // BankAccount user3 = new BankAccount("123456789", 10000.00);

        user1.accountDeposit(100.00, "Checking");
        // user1.accountDeposit(100.00, "Savings");
        user1.accountWithdraw(150.00, "Checking");
        // user1.accountDeposit(50.00, "Savings");
        // user1.accountDeposit(100.00, "Savings");
        // user1.accountWithdraw(50.00, "Checking");
        // user1.accountWithdraw(50.50, "Savings");
        user1.balance();

        // System.out.println(user1.toString());
        // System.out.println(user2.toString());
        // System.out.println(user3.toString());
    }
}