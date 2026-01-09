
import java.util.Scanner;

public class secondlar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>first){
                second=first;
                first=val;
            }
            else if(val>second && val!=first){
                second=val;
            }
        }
        System.out.println(second==Integer.MIN_VALUE?"-1":second);
    }
}
