
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
