import java.util.Scanner;


public class stringCompare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();

        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            System.out.println(false);
        }
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
        System.out.println(s1.equals(s2));
    
    }
}
