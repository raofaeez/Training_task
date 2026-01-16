class BankAccount {

    public long accN;
    protected String accHold;
    private double balance;

    BankAccount(long accNo, String holder, double bal) {
        accN = accNo;
        accHold = holder;
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }
}

class SavingsAccount extends BankAccount {

    double interest;

    SavingsAccount(long accNo, String holder, double bal, double rate) {
        super(accNo, holder, bal);
        interest = rate;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accN);   
        System.out.println("Account Holder: " + accHold);   
        System.out.println("Balance: " + getBalance());    
        System.out.println("Interest Rate: " + interest);
    }
}

public class BankMain {
    public static void main(String[] args) {

        SavingsAccount sa =
            new SavingsAccount(1234567890L, "Aman", 50000, 4.5);

        sa.displayDetails();
        sa.setBalance(60000);

        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
