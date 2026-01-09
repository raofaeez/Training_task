
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int odd=0,even=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                even++;
            }else{
                odd++;
            }
            n/=10;
        }
        System.out.println("even "+even);
        System.out.println("odd "+odd);
    }
}
