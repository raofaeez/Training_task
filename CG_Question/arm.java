
import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int temp=n;
        int ans=n;
        String s=""+temp;
        int len=s.length();
        int result=0;
        while(n!=0){
            int rem=n%10;
            result+=(int)(Math.pow(rem,len));
            n/=10;
        }
        if(ans==result){
            System.out.println("Arm");
        }else{
            System.out.println("not arm");
        }

    }
}
