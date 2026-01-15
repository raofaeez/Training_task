public class ATM {
    public static void main(String[] args) {
        bank cus1=new bank("rao", 8220, 1000);
        // cus1.deposit(2000);
        cus1.withdraw(2000);
        cus1.balance();
    }
}
class bank{
    String name;
    int accNum;
    double bal;

    public bank(String n,int a,double b) {
        name=n;
        accNum=a;
        bal=b;
    }

    void deposit(double am){
        bal+=am;
        System.out.println("depo "+am);
    }
    void withdraw(double am){
        if(am<=bal){
            bal-=am;
            System.out.println("withdraw "+am);
        }else{
            System.out.println("insufficient balance");
        }
    }

    void balance(){
        System.out.println("balance "+ bal);
    }
    
}
