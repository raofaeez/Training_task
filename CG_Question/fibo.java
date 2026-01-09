
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0,b=1;
        System.out.println(0);
        System.out.println(1);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
