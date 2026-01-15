public class MobilePhoneDetail {
    public static void main(String[] args) {
        mobile b1=new mobile("Iphone", "XR", 2000);
        b1.display();
    }
}
 class mobile{
    String brand;
    String model;
    int price;

    mobile(String b,String m,int p){
        brand=b;
        model=m;
        price=p;
    }
    void display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
 }
