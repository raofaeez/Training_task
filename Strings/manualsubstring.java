
import java.util.Scanner;

public class manualsubstring {
    public static String create(String str,int s,int e){
        StringBuilder sb=new StringBuilder();
        for(int i=s;i<e;i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int s = scn.nextInt();
        int e = scn.nextInt();

        String manual=create(str,s,e);
        String builtIn=str.substring(s,e);
        boolean isSame=manual.equals(builtIn);

        System.out.println("manual substring "+ manual);
        System.out.println("built in substring "+ builtIn);
        System.out.println("compare both "+ isSame);
    }
}
