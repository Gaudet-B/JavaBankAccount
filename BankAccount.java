import java.util.Random;

public class BankAccount {

    // Member variables :
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double totalCashOnHand = 0;

    // Constructor:
    public BankAccount() {
        numberOfAccounts++;
    }

    // Overload:

    // Methods: 
    public void deposit(double checking, double savings) {
        this.checkingBalance += checking;
        this.savingsBalance += savings;
        totalCashOnHand += checking + savings;
    }

    public String checkingWithdrawal(double amount) {
        double balanceRemaining = this.checkingBalance - amount;
        if (balanceRemaining < 0) {
            return String.format("INSUFFICIENT FUNDS. We were unable to process your withdrawal due to insufficient checking account balance");
        } else {
            this.checkingBalance -= amount;
            return String.format("SUCCESS. $%.2f was successfully deposited to your checking account.", amount);
        }
    }

    public String savingsWithdrawal(double amount) {
        double balanceRemaining = this.savingsBalance - amount;
        if (balanceRemaining < 0) {
            return String.format("INSUFFICIENT FUNDS. We were unable to process your withdrawal due to insufficient savings account balance");
        } else {
            this.savingsBalance -= amount;
            return String.format("SUCCESS. $%.2f was successfully deposited to your savings account.", amount);
        }
    }

    public double getTotalAccountsBalance() {
        return this.checkingBalance + this.savingsBalance;
    }

    public double getTotalCashOnHand() {
        return totalCashOnHand;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    // Getter and Setter:
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
}