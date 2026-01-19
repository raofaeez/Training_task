class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int a,double b){
        accountNumber=a;
        balance=b;
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int a,double b,double i){
        super(a,b);
        interestRate=i;
    }
    void displayAccountType(){
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends BankAccount{
    int withdrawalLimit;
    CheckingAccount(int a,double b,int w){
        super(a,b);
        withdrawalLimit=w;
    }
    void displayAccountType(){
        System.out.println("Checking Account");
    }
}
class FixedDepositAccount extends BankAccount{
    int tenure;
    FixedDepositAccount(int a,double b,int t){
        super(a,b);
        tenure=t;
    }
    void displayAccountType(){
        System.out.println("Fixed Deposit Account");
    }
    }
public class Bank{
public static void main(String[]args){
BankAccount b=new SavingsAccount(101,5000,4.5);
((SavingsAccount)b).displayAccountType();
}
}
