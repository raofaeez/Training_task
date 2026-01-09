
import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();

        for(char ch:s.toCharArray()){
            System.out.println((int)ch);
        }
    }
}
