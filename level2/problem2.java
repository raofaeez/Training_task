package level2;

import java.util.Scanner;

public class problem2 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int res1 = a + b * c;
        int res2 = a * b + c;
        int res3 = c + a / b;
        int res4 = a % b + c;

        System.out.println(
            "The results of Int Operations are " +
            res1 + ", " + res2 + ", " +
            res3 + ", and " + res4
        );
    }
}
