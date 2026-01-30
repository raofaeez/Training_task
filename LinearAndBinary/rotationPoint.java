package LinearAndBinary;

import java.util.Scanner;

public class rotationPoint {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int low=0,high=n-1;
        if(arr[low]<=arr[high]){
            System.out.println(0);
            return;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        System.out.println(low);
    }
}
