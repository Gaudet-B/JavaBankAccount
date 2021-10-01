public class TestBank {
    public static void main(String[] args) {

        // Create test accounts
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();

        // Test methods
        user1.deposit(200, 200);
        user1.savingsWithdrawal(100);
        user1.deposit(100, 0);
        System.out.println(user1.getTotalAccountsBalance());

        user2.deposit(100, 300);
        user1.savingsWithdrawal(100);
        user1.deposit(100, 0);
        System.out.println(user2.getTotalAccountsBalance());

        user3.deposit(500, 100);
        user1.checkingWithdrawal(200);
        System.out.println(user1.getTotalAccountsBalance());

        System.out.println(user1.getTotalCashOnHand());
        System.out.println(user1.getNumberOfAccounts());

        // 

        System.out.println("Done.");
    }
}