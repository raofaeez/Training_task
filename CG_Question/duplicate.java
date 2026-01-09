import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
