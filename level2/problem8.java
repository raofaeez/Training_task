package level2;

import java.util.Scanner;

public class problem8 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double s1 = scn.nextDouble();
        double s2 = scn.nextDouble();
        double s3 = scn.nextDouble();

        double per = s1 + s2 + s3;
        double dis = 5000; // 5 km in meters

        double rounds = dis / per;

        System.out.println(
            "The total number of rounds the athlete will run is " + rounds +
            " to complete 5 km"
        );
    }
}
