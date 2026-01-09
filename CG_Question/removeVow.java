import java.util.Scanner;

public class removeVow {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
        String s=scn.next();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
               continue;
            } else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
