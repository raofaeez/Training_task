package level1;

import java.util.Scanner;

public class problem8 {
     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        
        double km = scn.nextDouble();

        // Convert to miles
        double miles = km / 1.6;

        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km"
        );
    }
}
