public class Product {
    public static void main(String[] args) {
        inventary item1=new inventary("laptop", 50000);
        inventary item2=new inventary("mobile", 750000);
        item1.display();
        item2.display();
        inventary.totalProducts();
    }
}
class inventary{
    String name;
    double price;
    static int total;
    public inventary(String n,double p) {
        name=n;
        price=p;
        total++;
    }

    void display(){
        System.out.println("name of product:- "+name);
        System.out.println("price of product:- "+price);
    }

   static void totalProducts(){
        System.out.println(total);
    }
    
    
}