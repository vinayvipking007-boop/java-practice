
public class Banks {
    static class BankAccount {
        private double balance;
        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) balance -= amount;
            else System.out.println("Invalid amount or insufficient balance");
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
