import java.util.ArrayList;
import java.util.List;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {


    private String accountNumber;
    private String holderName;
    private double balance;


    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder    : " + holderName);
        System.out.println("Balance   : " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied for: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // 5 times balance
    }
}

class CurrentAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SA101", "Alice", 50000);
        BankAccount acc2 = new CurrentAccount("CA201", "Bob", 80000);

        accounts.add(acc1);
        accounts.add(acc2);

        // Polymorphism demonstration
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            System.out.println("--------------------------");
        }

        // Loan feature
        Loanable loanAccount = (Loanable) acc1;
        loanAccount.applyForLoan(100000);
        System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
    }
}
