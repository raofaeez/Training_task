package level2;

import java.util.Scanner;

public class problem10 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double prin = scn.nextDouble();
        double rate = scn.nextDouble();
        double time = scn.nextDouble();

        double SI = (prin * rate * time) / 100;

        System.out.println(
            "The Simple Interest is " + SI +
            " for prin " + prin +
            ", Rate of Interest " + rate +
            " and Time " + time
        );
    }
}
