
import java.util.Scanner;



public class evenPosSym {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        String s=""+n;
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                sum+=ch-'0';
            }
        }
        System.out.println(sum);
    }
}
