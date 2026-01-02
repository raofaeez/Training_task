package level1;

import java.util.Scanner;

public class problem12 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double b = scn.nextDouble();
        double h = scn.nextDouble();

        // Area in square inches
        double area = 0.5 * b * h;

        // Convert inches to cm (1 inch = 2.54 cm)
        double acm = area * 2.54 * 2.54;

        System.out.println(
            "The area of triangle is " + area +
            " square inches and " + acm + " square centimeters"
        );
    }
}
