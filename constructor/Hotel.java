public class Hotel {
    public static void main(String[] args) {
        cart c1=new cart("chips", 25);
        c1.add(4);
        c1.remove(1);
        c1.display();
    }
}
class cart{
    String name;
    int price;
    int qua;

    public cart(String n,int p) {
        name=n;
        price=p;
        qua=0;
    }
    void add(int q){
        qua+=q;
        System.out.println(q+ " quantity added!");
    }
    void remove(int q){
        if(q<=qua){
            qua-=q;
            System.out.println(q+" item removed");
        }else{
            System.out.println(" no more items left ");
        }
    }
    void display(){
        System.out.println("item name:- "+ name);
        System.out.println("total price: "+ price*qua);
    }

    
}