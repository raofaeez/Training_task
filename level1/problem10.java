package level1;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //  height in cm
        double height = scn.nextDouble();

        // Convert cm to inc
        double total = height / 2.54;

        // Convert inches to f and remaining inches
        int feet = (int) (total / 12);
        double inches = total % 12;

        System.out.println(
            "Your Height in cm is " + height +
            " while in feet is " + feet +
            " and inches is " + inches
        );
    }
}
