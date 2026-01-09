
import java.util.Scanner;

public class sumDigit {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
   } 
}
