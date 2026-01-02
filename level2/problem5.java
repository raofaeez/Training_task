package level2;

import java.util.Scanner;

public class problem5 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double farhen = scn.nextDouble();

        double cel = (farhen - 32) * 5 / 9;

        System.out.println(
            "The " + farhen + " farhen is " + cel + " celsius"
        );
    }
}


