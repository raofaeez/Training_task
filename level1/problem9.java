package level1;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double fee = scn.nextDouble();
        double disPer = scn.nextDouble();

        double dis = (fee * disPer) / 100;

        // Final fee
        double finalFee = fee - dis;

        System.out.println(
            "The dis amount is INR " + dis +
            " and final discounted fee is INR " + finalFee
        );
    }
}
