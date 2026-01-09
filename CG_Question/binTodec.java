
import java.util.Scanner;

public class binTodec {
    public static int con(int n){
        int num=0;
        int pow=1;
        while(n>0){
            int rem=n%2;
            num=num+rem*pow;
            pow*=10;
            n/=2;
        }
        return num;
    }
    public static int rev(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int rem=n%10;
            dec=dec+rem*(int)Math.pow(2,pow);
            pow++;
            n/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int bin=con(n);
        int dec=rev(bin);
        System.out.println("binary if n is : "+bin);
        System.out.println("decimal of bin is : "+dec);
    }
}
