import java.util.Scanner;

public class upperCompare {
    public static String toUpper(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                char upper=(char)(ch-'a'+'A');
                sb.append(upper);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String s1=scn.nextLine();


        String build=s1.toUpperCase();
        String manual=toUpper(s1);

        boolean isSame=check(build,manual);
        System.out.println("build in upper "+ build);
        System.out.println("manual upper "+ manual);
        System.out.println("compare both "+ isSame);
    }
}
