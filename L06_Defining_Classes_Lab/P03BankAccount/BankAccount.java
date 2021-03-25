package L06_Defining_Classes_Lab.P03BankAccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int accountsCount;

    private int accountId;
    private double balance;

    public BankAccount() {
        BankAccount.accountsCount++;
        this.accountId = accountsCount;
        this.balance = 0.0;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getInterestRate(int years) {
        return interestRate * balance * years;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }
}
