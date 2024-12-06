import java.util.Scanner;

abstract class Account {
    String customerName;
    String accountNumber;
    double balance;
    String accountType;

    public Account(String customerName, String accountNumber, double balance, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract void computeInterest();
}

class SavingsAccount extends Account {
    public SavingsAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, balance, "Savings");
    }

    public void computeInterest() {
        double interestRate = 0.05;
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest Deposited: " + interest);
    }
}

class CurrentAccount extends Account {
    private final double minimumBalance = 1000.0;
    private final double serviceCharge = 50.0;

    public CurrentAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, balance, "Current");
    }

    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Balance falls below minimum balance! Service charge applied.");
            balance -= serviceCharge;
        } else {
            super.withdraw(amount);
        }
    }

    public void displayBalance() {
        if (balance < minimumBalance) {
            System.out.println("Balance: " + balance + " (Service charge applied)");
        } else {
            super.displayBalance();
        }
    }

    public void computeInterest() {}
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount("John Doe", "S001", 5000);
        accounts[1] = new CurrentAccount("Jane Smith", "C001", 1500);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nAccount " + (i + 1) + " Details:");
            System.out.println("Account Holder: " + accounts[i].customerName);
            System.out.println("Account Number: " + accounts[i].accountNumber);
            System.out.println("Account Type: " + accounts[i].accountType);

            accounts[i].displayBalance();
            if (accounts[i] instanceof SavingsAccount) {
                accounts[i].computeInterest();
            }

            accounts[i].deposit(1000);
            accounts[i].displayBalance();

            System.out.print("Enter withdrawal amount for " + accounts[i].customerName + ": ");
            double withdrawAmount = scanner.nextDouble();
            accounts[i].withdraw(withdrawAmount);
            accounts[i].displayBalance();
        }

        scanner.close();
    }
}
