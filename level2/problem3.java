package level2;

import java.util.Scanner;

public class problem3 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        double res1 = a + b * c;
        double res2 = a * b + c;
        double res3 = c + a / b;
        double res4 = a % b + c;

        System.out.println(
            "The results of Double Operations are " +
            res1 + ", " + res2 + ", " +
            res3 + ", and " + res4
        );
    }
}
