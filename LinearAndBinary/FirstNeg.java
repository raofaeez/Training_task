package LinearAndBinary;

import java.util.Scanner;

public class FirstNeg {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int ele:arr){
            if(ele<0){
                System.out.println(ele);
                break;
            }
        }
        System.out.println("no neg number found");
    }
}
