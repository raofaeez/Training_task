package level2;

import java.util.Scanner;

public class problem6 {
      public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double sal = scn.nextDouble();
        double bonus = scn.nextDouble();

        double total = sal + bonus;

        System.out.println(
            "The sal is INR " + sal +
            " and bonus is INR " + bonus +
            ". Hence Total Income is INR " + total
        );
    }
}
