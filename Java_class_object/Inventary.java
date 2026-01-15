public class Inventary {
    public static void main(String[] args) {
        invent item1=new invent(123, "kaju katli", 1200,2);
        item1.display();
    }
}
class invent{
    int code;
    String name;
    int price;
    int qua;

    public invent(int c,String n,int p,int q) {
        code=c;
        name=n;
        price=p;
        qua=q;
    }
    public void display(){
        System.out.println(code);
        System.out.println(name);
        System.out.println(price);
        System.out.println(price*qua);
    }
    
}
