package level2;

import java.util.Scanner;

public class problem9 {
      public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int choco = scn.nextInt();
        int child = scn.nextInt();

        int c = choco / child;
        int rem = choco % child;

        System.out.println(
            "The number of chocolates each child gets is " +
            c +
            " and the number of remaining chocolates are " +
            rem
        );
    }
}
