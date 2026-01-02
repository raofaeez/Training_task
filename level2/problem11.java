package level2;

import java.util.Scanner;

public class problem11 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double pounds = scn.nextDouble();

        double kilo = pounds / 2.2;

        System.out.println(
            "The weight of the person in pound is " + pounds +
            " and in kg is " + kilo
        );
    }
}
