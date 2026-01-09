
import java.util.Scanner;

public class rotate {
    public static void rev(int[]arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        rev(arr,0,n-1);
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
          for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
