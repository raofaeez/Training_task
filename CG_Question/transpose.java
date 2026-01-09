import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
         int[][]ans=new int[n][n];
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=arr[i][j];
            }
        }
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
