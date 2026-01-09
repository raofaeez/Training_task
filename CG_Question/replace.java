
import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();

        String str=s.replace(" ",",");
        System.out.println(str);
    }
}
