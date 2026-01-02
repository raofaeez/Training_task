package level1;

import java.util.Scanner;

public class problem14 {
      public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double f = scn.nextDouble();

        double y = f / 3;
        double miles = y / 1760;

        System.out.println(
            "The distance in yars is " + y +
            " and in miles is " + miles
        );
    }
}
