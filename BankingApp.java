class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Shakthi", 1000);

        acc1.checkBalance();
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.withdraw(1500);
        acc1.checkBalance();
    }
}
