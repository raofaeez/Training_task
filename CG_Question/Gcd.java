
import java.util.Scanner;

public class Gcd {
    public static  int solve(int a,int b){
        if(b==0)return a;
        return solve(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();

        int hcf=solve(a,b);

        int lcm=a*b/hcf;

        System.out.println("hcf"+ hcf);
        System.out.println("lcm"+ lcm);

    }  
}
