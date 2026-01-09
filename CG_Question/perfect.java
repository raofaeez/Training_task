import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int sum=0;
        for(int i=1;i<n;i++){
             if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("perfect");
        }else{
            System.out.println("not perfect");
        }
           
    }
}
