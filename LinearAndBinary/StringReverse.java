package LinearAndBinary;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String input=scn.next();
        StringBuilder s=new StringBuilder(input);

        System.out.println(s.reverse());
    }
}
