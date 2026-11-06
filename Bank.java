class BankAccount{
    private String accountNumber;
    private double balance;
    public void deposite(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");

        }
        public double getBalance(){
            return balance;
        }

        }
    }
public class Bank{
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposite(1000);
        account.withdraw(500);
        System.out.println("Balance: "+account.getBalance());
    }
}
