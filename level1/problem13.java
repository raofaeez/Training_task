package level1;

import java.util.Scanner;

public class problem13 {
      public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double per = scn.nextDouble();

        double s = per / 4;

        System.out.println(
            "The length of the side is " + s +
            " whose per is " + per
        );
    }
}
