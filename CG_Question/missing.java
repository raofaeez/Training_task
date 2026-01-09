
import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        boolean found=false;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found=true;
                    System.out.println(i);
                    break;
                }
            }
        }
        if(!found){
            System.out.println(n);
        }
    }
}
