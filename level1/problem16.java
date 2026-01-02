package level1;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = (n * (n - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + ans);
    }
}
