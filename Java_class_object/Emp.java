public class Emp {
    public static void main(String[] args) {
        emp1 e1=new emp1("rohit", 12, 750000);
        e1.display();
    }
}
class emp1{
    String name;
    int id;
    double sal;
    emp1(String a,int i,double sal){
        name=a;
        id=i;
        this.sal=sal;
    }

    public void display(){
        System.out.println("name "+name);
        System.out.println("id " +id);
        System.out.println("salary "+sal);
    }
}
