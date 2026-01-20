import java.util.ArrayList;
import java.util.List;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double extraCharge = 50; // Non-veg extra charge
        return (getPrice() * getQuantity()) + extraCharge;
    }
}

public class OnlineFood {

    public static void processOrder(List<FoodItem> items) {

        for (FoodItem item : items) {

            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalAmount = total - discount;

            System.out.println("Total Price : " + total);
            System.out.println("Final Amount: " + finalAmount);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Pizza", 250, 2));
        order.add(new NonVegItem("Chicken Burger", 180, 2));

        processOrder(order);
    }
}
