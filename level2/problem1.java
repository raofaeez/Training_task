package level2;

import java.util.Scanner;

public class problem1 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int quo = n1 / n2;
        int rem = n1 % n2;

        System.out.println(
            "The quo is " + quo +
            " and Reminder is " + rem +
            " of two number " + n1 + " and " + n2
        );
    }
}
