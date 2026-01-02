package level1;

public class problem6 {
    public static void main(String[] args) {

       
        double fee = 125000;

        double disP = 10;

        double discount = (fee * disP) / 100;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
