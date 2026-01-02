package level1;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double unit = scn.nextDouble();
        int q = scn.nextInt();
        double price = unit * q;

        System.out.println(
            "The total purchase price is INR " + price +
            " if the quanity " + q +
            " and unit price is INR " + unit
        );
    }

}
