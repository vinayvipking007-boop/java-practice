
public class Bank {
    static class BankAccount {
        private double balance;
        public void deposit(double amount) {
            if (amount > 0) balance += amount;
            else System.out.println("Deposit amount must be positive");
        }
        public void withdraw(double amount) {
            if (amount <= 0) System.out.println("Withdrawal amount must be positive");
            else if (amount <= balance) balance -= amount;
            else System.out.println("Insufficient balance");
        }
        public double getBalance() { return balance; }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
