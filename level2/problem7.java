package level2;

import java.util.Scanner;

public class problem7 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println(
            "The swapped numbers are " + n1 + " and " + n2
        );
    }
}
