class Order{
    int orderId;
    String orderDate;
    Order(int i,String d){
        orderId=i;orderDate=d;
    }
    String getOrderStatus(){
        return "Order Placed";
    }
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(int i,String d,String t){
        super(i,d);
        trackingNumber=t;
    }
    String getOrderStatus(){
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(int i,String d,String t,String dd){
        super(i,d,t);
        deliveryDate=dd;
    }
    String getOrderStatus(){
        return "Order Delivered";
    }
}
public class Online{
    public static void main(String[]args){
        Order o=new DeliveredOrder(1,"01-01","TR123","05-01");
        System.out.println(o.getOrderStatus());
    }
}
