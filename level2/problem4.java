package level2;

import java.util.Scanner;

public class problem4 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double cel = scn.nextDouble();

        double fahren = (cel * 9 / 5) + 32;

        System.out.println(
            "The " + cel + " celsius is " + fahren + " fahren"
        );
    }
}
